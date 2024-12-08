package task;

public class SavingsAccount extends Account {
    // 생성자
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
