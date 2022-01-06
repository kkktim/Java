package ch07;

public interface RemoteControl {
	
	// 추상메서드
	public abstract void powerOn();
	public abstract void powerOff();

	public void chUp();    //abstract 생략가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
	
}
