package bai3;

import java.util.*;

public class May {
	public static Scanner s = new Scanner(System.in);
	private String Mamay, Tenmay, Tinhtrang;

	public May() {
		super();
	}

	public May(String mamay, String tenmay, String tinhtrang) {
		super();
		Mamay = mamay;
		Tenmay = tenmay;
		Tinhtrang = tinhtrang;
	}

	public String getMamay() {
		return Mamay;
	}

	public void setMamay(String mamay) {
		Mamay = mamay;
	}

	public String getTenmay() {
		return Tenmay;
	}

	public void setTenmay(String tenmay) {
		Tenmay = tenmay;
	}

	public String getTinhtrang() {
		return Tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		Tinhtrang = tinhtrang;
	}

	public void input() {
		this.Mamay = s.nextLine();
		this.Tenmay = s.nextLine();
		this.Tinhtrang = s.nextLine();
	}

	public void output() {
		System.out.println(Mamay+"\t"+Tenmay+"\t"+Tinhtrang);
	}

	public static void main(String[] args) {

	}
}
