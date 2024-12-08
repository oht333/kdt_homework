package task;

public class Account {
    double balance;

    // 생성자
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // 입금 메서드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("입금 금액은 양수여야 합니다.");
        }
    }

    // 출금 메서드
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족하거나 잘못된 금액입니다.");
        }
    }
}
