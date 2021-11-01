package com.my.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass1 {
	
	public MyClass1() { // constructor
		
	}
	
	// DATA
	
	private char ch1 = 'a';
	private char ch2 = '가'; // 2byte for Unicode
	
	private byte bt1 = 10;
	private short st1 = 30000; // 2byte
	
	private int it1 = 1234567890 ;
	private long lo1 = 123456789123L;
	private float ft1 = 123456789123F;
	private float ft2 = 126.3E6F; // exponential express
	private double db1 = 126.7456890D;
	private boolean b1 = false;
	
	
	// DATA 객체 참조형
	private char char1[] = {'k','o','r','e','a'}; // elements, 암묵적 객체생성
	private char[] char2 = {'k','o','r','e','a'};
	private char[] char3 = new char [] {1, 2, 3, 4};
	// 배열[] = {element}, element = 배열의 원소
	private int int1[] = {100, 200, 300, 400, 500}; // elements, 암묵적 객체생성
	private int[] int2 = {100, 200, 300, 400, 500};
	private int[] int3 = new int [] {1, 2, 3, 4};
	
	private String str1 = "korea"; // elements, 암묵적 객체생성
	private String str2 = new String("korea"); // 명시적 객체생성
	private String str3 = ""; // 객체 생성이 되는데 property 가 빈 상태
	private String str4 = null; // 객체 생성이 안된 상태
	
	// METHODS
	
	private void typeCastingTest() {
		it1 = st1;
		//it1 = lo1; // error
		it1 = (int) lo1; // type casting 
		
	}
	
	private void operatorTest() {
		if (b1 == true) {} ;
		
		if (b1) {} ;
		
		if (b1 == false) {} ;
		
		if (!b1) {} ;
		
		if (it1 >10) {}; 
		if ((it1 >10) && (lo1 > 10) ) {} ;
		if ((it1 >10) || (lo1 > 10) ) {} ;
		
	}
	
	int modOperatorTest(int year, int month) {
		
		// 내부 변수
		
		// 리스트
		ArrayList<Integer> aList = new ArrayList<Integer>();
		ArrayList<Integer> aList2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		int[] months1 = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 } ; //array 배열
		int[] months2 = {31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 } ;
		
		int retDays = 0;
		boolean leafYear = false ;
		
		// LOGIC - 알고리즘 -> stateMent
		if((month > 12) || (month <= 0)) { // check logic --> not valid 
			return -1;
		}
		
		int Count = months1.length ;
		
		// 윤년 check
		if( year % 400 == 0) {
			leafYear = true;
		}
		if( year % 100 == 0) {
			leafYear = false;
		}
		if( year % 4 == 0) {
			leafYear = false;
		}
		
		if( leafYear == true) {
			retDays = months2[month -1] ;
		} else 
			retDays = months1[month -1];
		
		// Return
		return retDays;
		
	}
	
	public static void staticTest(int any) {
		
		int d = 100; // decimal
		int h=0xff34; // hex (16진수);
	
		char c = 'M';
		float f = 10.12345F;
		boolean b = false;
		
		String str1 = Integer.toString(any); // 대표적인 static 메소드 : int 를 String 으로 변경.
		System.out.printf("korea\t\tebtest\n"); // print
		//System.out.printf("str1=%s", str1); // formatted print
		
		// printf test
		System.out.printf("d=%d,h=0x%x,c=%c,f=%f,b=%b,s=%s \n"
				,d,h,c,f,b,str1) ;
	}
	// array 와 Math 를 이용하여 만든다.
	public static void makeLotto() { // make lotto number
		int[] lotto = {0,0,0,0,0,0,};
		double random;
		int temp1, temp2; 
		int i,j,k;
		int indexCnt = 0;
		
		for(i = 0; i < 6 ; i++) { // ++은 숫자를 오름차순으로 반복함. control - 반
			
			random = Math.random();
			temp1 = (int) (random * 1000000); // 타입캐스팅 필요.
			temp2 = temp1 % 46;
			
			if(temp2 <= 0) { // control - 조건
				i--;
				continue; // control - 분기 continue는 다시
			}
			
			for(j=0; j < indexCnt; j++) {
				if(temp2 == lotto[j]) { //그전 동일번호인가 확인
					j--;
					continue;
				}
			}
			indexCnt++;
			lotto[i] = temp2;
		}
		
		System.out.printf("%d %d %d %d %d %d"
				,lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
		
		//System.out.print();
//		int[] ball = new int[45]; // 45개 숫자 저장용 배열 생성
//		for(int i = 0; i < ball.length; i++) // 배열에 0~44를 저장.
////			ball[i] = i + 1;
//		System.out.print(ball[i]);
	}
	
	
}
