package task;

class EmployeeMain {
    public static void main(String[] args) {
        // Employee 배열 생성
        Employee[] employees = new Employee[3];

        employees[0] = new Manager("홍길동", 100000);
        employees[1] = new Developer("박성현", 80000);
        employees[2] = new Employee("최윤철", 50000);

        for (Employee emp : employees) {
            System.out.println(emp.name + "의 보너스: " + emp.calculateBonus());
        }
    }
}
