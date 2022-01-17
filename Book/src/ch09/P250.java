package ch09;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention (RetentionPolicy.RUNTIME)
@interface UserAnnot {
	
	String value();
	int number() default 5;
}

class UserClass{
	
	@UserAnnot (value="A")
	public void methodA() {
		System.out.println("methodA() ����");
	}
	
	@UserAnnot (value="B", number=10)
	public void methodB() {
		System.out.println("methodB() ����");
	}
}


public class P250 {
	public static void main(String[] args) {
		
		Method method[] = UserClass.class.getDeclaredMethods();
		
		for(int i=0 ; i<method.length ; i++) {
			String methodName = method[i].getName();
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
			
			System.out.println(methodName+"�� ������̼�");
			System.out.println("value : "+annot.value()+" ");
			System.out.println("number : "+annot.number()+" ");
			System.out.println();
			
			method[i].invoke(new UserClass(), null);  //�޼��� ����
			
		}
		
	}

}
