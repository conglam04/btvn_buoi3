package bai2;

import java.util.ArrayList;
import java.util.*;

class person {
	public static Scanner s = new Scanner(System.in);
	private String name, address;
	private byte age;
	private Date Birthday = new Date();

	public person() {

	}

	public person(String name, String address, byte age, Date birthday) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.Birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	public void input() {
		System.out.print(" nhap  name : ");
		this.name = s.nextLine();
		System.out.print(" nhap tuoi : ");
		this.age = s.nextByte();
		s.nextLine();
		System.out.print(" nhap address : ");
		this.address = s.nextLine();
		System.out.println("  nhap lan luot ngay - thang - nam : ");
		Birthday.input();
	}

	public void output() {
		System.out.println("name : " + name + "\n" + "age : " + age + "\n" + "address : " + address);
		Birthday.output();
	}
}

class student extends person {
	private String id, class1, school;

	public student() {

	}

	public student(String name, String address, byte age, Date birthday, String id, String class1, String school) {
		super(name, address, age, birthday);
		this.id = id;
		this.class1 = class1;
		this.school = school;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
    @Override
	public void input() {
		System.out.print(" nhap id : ");
		this.id = s.nextLine();
		System.out.print(" nhap class : ");
		this.class1 = s.nextLine();
		System.out.print(" nhap school : ");
		this.school = s.nextLine();
		super.input();
	}
    @Override
	public void output() {
		System.out.println(" id : " + id + "\n" + " class : " + class1 + "\n" + " school : " + school);
		super.output();
	}
}

public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.print(" nhap so sinh vien : ");
			n = s.nextInt();
		} while (n <= 0);
		ArrayList<student> student1 = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			student a = new student();
			System.out.println(" nhap thong tin sinh vien thu [" + (i + 1) + "]:");
			a.input();
			student1.add(a);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(" [" + (i + 1) + "]:");
			student b = student1.get(i);
			b.output();
		}
	}

}
