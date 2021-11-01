package com.my.pkg2;

public class Test1 {
	public final int COUNTRY_CODE_KOREA = 82;
	protected int speed = 3 ;
	public MyHistory obj1 = new MyHistory(1990, 1, 12);
	
	public static void main(String[] args) {
		
		int temp = 0;
		
		System.out.print("Hello World \n");
		
		MyClass1 test = new MyClass1();
		temp = test.modOperatorTest(2021, 10);
		
		//MyClass1.staticTest(1934);
		MyClass1.makeLotto();
		

	}
	
	public int getSpeed() {
		//COUNTRY_CODE_KOREA = 23132;
		obj1.getHistory();
		return speed;
	}

}

class Test2 extends Test1{
	public void printspd() {
		System.out.println(speed) ;
	}
}




class Test3 {
	public int int1 = 10;
	public int int2 = new Integer(10);
	private boolean kk2 = false ;
	private char[] chr = {'k','o','r','e','a'} ;
	public Test1 kk3 = null ;
	public String str1 = null ;
	public String str2 = new String ("korea") ;
}



class MyHistory {
	private int objValue ;
	
	public MyHistory(int contry, int mon, int day) {
		this.objValue = day ;
	}
	
	public int getMyValue() {
		return objValue ;
	}
	
	public String getHistory() {
		return "이성계가 죽은 해입니다. " ;
	}
}