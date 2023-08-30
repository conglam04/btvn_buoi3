package bai3;

import java.util.*;

public class Quanly {
	public static Scanner s = new Scanner(System.in);
	private String MaQL, Hoten;

	public Quanly() {
		super();
	}

	public Quanly(String maQL, String hoten) {
		super();
		MaQL = maQL;
		Hoten = hoten;
	}

	public String getMaQL() {
		return MaQL;
	}

	public void setMaQL(String maQL) {
		MaQL = maQL;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public void input() {
		System.out.println(" nhap lan luot thong tin quan ly : ");
		this.MaQL = s.nextLine();
		this.Hoten = s.nextLine();
	}

	public void output() {
		System.out.println(" ma QL : " + MaQL + "\t" + " Ten QL : " + Hoten);
	}

	public static void main(String[] args) {

	}
}
