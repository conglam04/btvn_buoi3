package bai1;

import java.util.*;

public class Hang {
	public static Scanner h = new Scanner(System.in);
	private String Mahang;
	private String Tenhang;
	private NSX x = new NSX();

	public Hang() {

	}

	public Hang(String mahang, String tenhang, NSX x) {
		super();
		this.Mahang = mahang;
		this.Tenhang = tenhang;
		this.x = x;
	}

	public String getMahang() {
		return Mahang;
	}

	public void setMahang(String mahang) {
		Mahang = mahang;
	}

	public String getTenhang() {
		return Tenhang;
	}

	public void setTenhang(String tenhang) {
		Tenhang = tenhang;
	}

	public NSX getX() {
		return x;
	}

	public void setX(NSX x) {
		this.x = x;
	}

	public void nhap() {
		System.out.println(" nhap : ");
		System.out.print(" ten hang : ");
		this.Tenhang = h.nextLine();
		System.out.print(" ma hang : ");
		this.Mahang = h.nextLine();
		x.nhap();
	}

	public void xuat() {
		System.out.println(" xuat : ");
		System.out.println(" ten hang : " + Tenhang + "\n" + " ma hang : " + Mahang);
		x.xuat();

	}

	public static void main(String[] args) {
		Hang s = new Hang();
		s.nhap();
		s.xuat();
	}
}
