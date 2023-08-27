package bai2;

import java.util.*;

public class Faculty {
	public Scanner s = new Scanner(System.in);
	private String Name;
	private String Date;
	private School x = new School();

	public Faculty() {

	}

	public Faculty(String name, String date, School x) {

		this.Name = name;
		this.Date = date;
		this.x = x;
	}

	public Scanner getS() {
		return s;
	}

	public void setS(Scanner s) {
		this.s = s;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public School getX() {
		return x;
	}

	public void setX(School x) {
		this.x = x;
	}

	public void input() {
		System.out.print(" name Faculty  : ");
		this.Name = s.nextLine();
		System.out.print("  Date Faculty : ");
		this.Date = s.nextLine();
		System.out.print("  name school : ");
		this.x.setName(s.nextLine());
		System.out.print("  Date School :");
		this.x.setDate(s.nextLine());
	}

	public void output() {
		System.out.println(" name Faculty : " + Name + "\n" + " Date Faculty : " + Date);
		System.out.println(" name School : " + x.getName() + "\n" + " Date School : " + x.getDate());
	}

	public static void main(String[] args) {

	}
}
