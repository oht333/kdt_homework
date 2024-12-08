package task;

public class AccountMain {
	public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000);
        System.out.println("=== SavingsAccount 테스트 ===");
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(3000);
        savingsAccount.withdraw(8000); // 잔액 부족 테스트

        // CheckingAccount 객체 생성 및 테스트
        CheckingAccount checkingAccount = new CheckingAccount(10000);
        System.out.println("\n=== CheckingAccount 테스트 ===");
        checkingAccount.deposit(5000);
        checkingAccount.withdraw(7000);
        checkingAccount.withdraw(14000); // 잔액 부족 테스트		
	}
}
