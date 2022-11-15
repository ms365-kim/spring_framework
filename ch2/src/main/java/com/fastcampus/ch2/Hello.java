package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10; //인스턴스 변수
	static int cv = 20; //static 변수
	@RequestMapping("/hello")
	private void main() { //인스턴스 메서드는 iv, cv 둘 다 사용 가능
		System.out.println("Hello");
		System.out.println("Hello - private"); //private도 가능
		System.out.println(iv); 
		System.out.println(cv); // static 메서드는 cv만 사용 가능
	}
	
	public static void main2 () {
		System.out.println(cv); // static 메서드는 cv만 사용 가능
	}
}
