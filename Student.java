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
		System.out.println("����");
		name = sc.next();
		System.out.println("ѧ��");
		id = sc.nextInt();
		System.out.println("�Ա�");
		gender = sc.next();
		System.out.println("����");
		age = sc.nextInt();
		System.out.println("�����������" + name + "ѧ�ţ�" + id + "�Ա�:" + gender + "����"
				+ age);

	}

}
