package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main(); private이라 외부 호출 불가 에러
		
		//Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 기능 제공
		//java.lang.reflect패키지를 제공
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello"); //Hello클래스의 Class객체를 얻어 온다.
		Hello hello = (Hello)helloClass.newInstance(); //Class객체가 가진 정보로 객체 생성
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private인 main()을 호출가능하게 한다.
		
		main.invoke(hello); //hello.main();
	}
}
