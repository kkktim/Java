package ch07;

class Student171{
	
	String name;
	int grade;
	String department;
	
	Student171(){
		
	}
	Student171(String n){
		name = n;
		
	}
	Student171(String n, int g){
		name = n;
		grade = g;
		
	}
	Student171(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
		
	}
	
	//�а��� �г��� �Ű������� �޴� ������(�����߻�)
	Student171(String d, int g){
		department = d;
		grade = g;
		
	}
}


public class P171 {
	
	public static void main(String[] args) {
		
		Student171 stu1 = new Student171();
		Student171 stu2 = new Student171("ȫ�浿");
		Student171 stu3 = new Student171("ȫ�浿", 4);
		Student171 stu4 = new Student171("ȫ�浿", 4, "����Ʈ�������");
		
		
	}


}
