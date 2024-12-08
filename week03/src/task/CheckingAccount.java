package task;

public class CheckingAccount extends Account {
    
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + 1000; // 수수료 포함
        if (amount > 0 && balance >= totalAmount) {
            balance -= totalAmount;
            System.out.println(amount + "원이 출금되었습니다. (수수료: 1000원) 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족하거나 잘못된 금액입니다.");
        }
    }
}
