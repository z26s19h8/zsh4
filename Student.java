package text;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

class Student {
	String name;
	int id;
	String gender;
	int age;

	public void toshows() {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.age = age;
		Scanner sc = new Scanner(System.in);
		System.out.println("姓名");
		name = sc.next();
		System.out.println("学号");
		id = sc.nextInt();
		System.out.println("性别");
		gender = sc.next();
		System.out.println("年龄");
		age = sc.nextInt();
		System.out.println("你输入的姓名" + name + "学号：" + id + "性别:" + gender + "年龄"
				+ age);

	}

}
