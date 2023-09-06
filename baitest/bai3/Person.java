package bai3;
import java.util.Scanner;

public class Person {
	public static Scanner s = new Scanner(System.in);
	private String name, gender;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input() {
		System.out.println(" nhap ten : ");
		this.name = s.nextLine();
		System.out.println(" nhap age : ");
		this.age = s.nextInt();
		s.nextLine();
		System.out.println(" nhap gender : ");
		this.gender = s.nextLine();
	}

	public void output() {
		System.out.println(" name : " + name + "\n" + " age : " + age + "\n" + " gender : " + gender);
	}
	public static void main(String[] args) {
		
	}
}
