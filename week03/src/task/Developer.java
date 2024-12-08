package task;

class Developer extends Employee {
    // 생성자
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }
}
