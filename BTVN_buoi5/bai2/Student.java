package bai2;

import java.util.*;

public class Student {
	public Scanner s = new Scanner(System.in);
	private String Name;
	private String Class1;
	private double Scose;
	private Faculty y = new Faculty();

	public Student() {

	}

	public Student(String name, String class1, double scose, Faculty y) {
		super();
		Name = name;
		Class1 = class1;
		Scose = scose;
		this.y = y;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getClass1() {
		return Class1;
	}

	public void setClass(String class1) {
		Class1 = class1;
	}

	public double getScose() {
		return Scose;
	}

	public void setScose(double scose) {
		Scose = scose;
	}

	public Faculty getY() {
		return y;
	}

	public void setY(Faculty y) {
		this.y = y;
	}

	public void input() {
		System.out.println(" input : ");
		System.out.print(" name Student : ");
		this.Name = s.nextLine();
		System.out.print(" class Student : ");
		this.Class1 = s.nextLine();
		System.out.print(" scose Student : ");
		this.Scose = s.nextDouble();
		s.nextLine();
		y.input();
	}

	public void output() {
		System.out.println(" output : ");
		System.out.println(" name Student : " + Name + "\n" + " class Student : " + Class1 + "\n" + " scose Student : " + Scose);
		y.output();
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.input();
		student.output();
	}
}
