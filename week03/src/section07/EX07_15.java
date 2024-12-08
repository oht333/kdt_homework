package section07;

public class EX07_15 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "김고이";
		stu1.hello();				//Student클래스의 hello()메서드 호출
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();		//Student클래스의 goToSchool()메서드 호출
		
		Student stu2 = new Student();
		stu2.studentName = "김고삼";
		stu2.hello();				//Student클래스의 hello()메서드 호출 (stu1 객체와 다름)
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();		//Student클래스의 goToSchool()메서드 호출
	}
}
