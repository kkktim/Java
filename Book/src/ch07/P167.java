package ch07;

class Student167{
	//필드
	String name;  //학생명
	int grade;   //학년
	String department; //학과
	
	Student167(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	// 기본생성자
	Student167(){
		
	}
	
	// 2번 생성자
	Student167(String n){
			name = n;
	}
		
		
	// 3번 생성자
	Student167(String n, int g){
		name = n;
		grade = g;
	}
		
	
}

public class P167 {
	
	public static void main(String[] args) {
		
		Student167 stu = new Student167("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		
	}

}
