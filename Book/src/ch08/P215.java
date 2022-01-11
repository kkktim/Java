package ch08;

import ch08.Aclass;

public class P215 extends Aclass {
	
//	public void methodB() {          
//		Aclass ac = new Aclass();   
//		ac.varA = "varA";           사용불가
//		ac.varA2 = "varA2";         사용불가
//		ac.methodA();               사용불가
//		ac.methodA2();              사용불가
//	}
	
	CClass(){
		this.varA = "varA";   // 사용가능
		this.varA2 = "varA2"; // 사용불가
		this.methodA();       // 사용가능
		this.methodA2();      // 사용불가
	}
	
	
	

}
