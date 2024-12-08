package task;

class Employee {
	String name;
	double salary;
	
    // 생성자
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.1;
    }
}
