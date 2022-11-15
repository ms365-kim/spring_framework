package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10; //�ν��Ͻ� ����
	static int cv = 20; //static ����
	@RequestMapping("/hello")
	private void main() { //�ν��Ͻ� �޼���� iv, cv �� �� ��� ����
		System.out.println("Hello");
		System.out.println("Hello - private"); //private�� ����
		System.out.println(iv); 
		System.out.println(cv); // static �޼���� cv�� ��� ����
	}
	
	public static void main2 () {
		System.out.println(cv); // static �޼���� cv�� ��� ����
	}
}