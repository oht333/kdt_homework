package task;

class Manager extends Employee {	
    // 생성자
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}
