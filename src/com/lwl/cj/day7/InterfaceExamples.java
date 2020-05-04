package com.lwl.cj.day7;

interface IOne{
	void m1();
}
interface ITwo{
	void m1();
	void m2();
}

interface IThree extends IOne,ITwo{
	void m3();
}

abstract class  AbsFour implements IThree{

	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {

	}
}

class Xyz extends AbsFour{

	@Override
	public void m3() {
		
		
	}
	
}

class Three implements IOne,ITwo{

	@Override
	public void m1() {
	
	}
	@Override
	public void m2() {
		
	}
	
}

public class InterfaceExamples {

}
