package bai3;

import java.util.*;
import java.util.ArrayList;

class Hanghoa {
	public static Scanner s = new Scanner(System.in);
	private String maHang, Tenhang;
	private float soLuong, Dongia;
	private Vatlieu dsVL = new Vatlieu();

	public Hanghoa() {

	}

	public Hanghoa(String maHang, String tenhang, float soLuong, float dongia, Vatlieu dsVL) {

		this.maHang = maHang;
		this.Tenhang = tenhang;
		this.soLuong = soLuong;
		this.Dongia = dongia;
		this.dsVL = dsVL;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenhang() {
		return Tenhang;
	}

	public void setTenhang(String tenhang) {
		Tenhang = tenhang;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDongia() {
		return Dongia;
	}

	public void setDongia(float dongia) {
		Dongia = dongia;
	}

	public Vatlieu getDsVL() {
		return dsVL;
	}

	public void setDsVL(Vatlieu dsVL) {
		this.dsVL = dsVL;
	}

	public void input() {
		System.out.print(" nhap ma hang : ");
		this.maHang = s.nextLine();
		System.out.print(" nhap ten hang : ");
		this.Tenhang = s.nextLine();
		System.out.print(" nhap so luong : ");
		this.soLuong = s.nextFloat();
		s.nextLine();
		System.out.print(" nhap don gia : ");
		this.Dongia = s.nextFloat();
		s.nextLine();
		dsVL.input();
	}

	public float Tongtien() {
		return Dongia * soLuong;
	}

	public void output() {
		System.out.println(" ma hang : " + maHang);
		System.out.println(" ten hang : " + Tenhang);
		System.out.println(" so luong : " + soLuong);
		System.out.println(" don gia : " + Dongia);
		System.out.println(" tong tien : " + Tongtien());
		dsVL.output();
	}
}

class Hanghoagiadung extends Hanghoa {
	private String Chucnang;

	public Hanghoagiadung() {

	}

	public Hanghoagiadung(String maHang, String tenhang, float soLuong, float dongia, Vatlieu dsVL, String chucnang) {
		super(maHang, tenhang, soLuong, dongia, dsVL);
		this.Chucnang = chucnang;
	}

	public String getChucnang() {
		return Chucnang;
	}

	public void setChucnang(String chucnang) {
		Chucnang = chucnang;
	}

	@Override
	public void input() {
		super.input();
		System.out.print(" nhap chuc nang : ");
		this.Chucnang = s.nextLine();
	}

	@Override
	public void output() {
		super.output();
		System.out.println(" chuc nang : " + Chucnang);
	}
}

class hanghoadientu extends Hanghoa {
	private int thoigiabaoHanh, Congxuat;

	public hanghoadientu() {
		
	}

	public hanghoadientu(String maHang, String tenhang, float soLuong, float dongia, Vatlieu dsVL, int thoigiabaoHanh,
			int congxuat) {
		super(maHang, tenhang, soLuong, dongia, dsVL);
		this.thoigiabaoHanh = thoigiabaoHanh;
		this.Congxuat = congxuat;
	}

	public int getThoigiabaoHanh() {
		return thoigiabaoHanh;
	}

	public void setThoigiabaoHanh(int thoigiabaoHanh) {
		this.thoigiabaoHanh = thoigiabaoHanh;
	}

	public int getCongxuat() {
		return Congxuat;
	}

	public void setCongxuat(int congxuat) {
		Congxuat = congxuat;
	}

	@Override
	public void input() {
		super.input();
		do {
			System.out.print(" thoi gian bao hanh : ");
			this.thoigiabaoHanh = s.nextInt();
			s.nextLine();
			System.out.print(" cong xuat : ");
			this.Congxuat = s.nextInt();
			s.nextLine();
		} while (thoigiabaoHanh <= 0 || Congxuat <= 0);
	}

	public void output() {
		super.output();
		System.out.println(" tg bao hanh " + thoigiabaoHanh + "\n" + " cong xuat : " + Congxuat);
	}
}

public class bai3 {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n,m;
		do {
			System.out.print(" nhap so luong hang hoa gia dung : ");
			n = s.nextInt();
			System.out.print(" nhap so luong hang hoa dien tu : ");
			m = s.nextInt();
		} while (n <= 0);
		ArrayList<Hanghoagiadung> Hanghoagiadung1 = new ArrayList<Hanghoagiadung>(n);
		ArrayList<hanghoadientu> Hanghoadientu = new ArrayList<hanghoadientu>(n);
		System.out.println(" nhap thong tin hang hoa gia dung thu : ");
		for (int i = 0; i < n; i++) {
			System.out.println("  [" + (i + 1) + "]:");
			Hanghoagiadung a1 = new Hanghoagiadung();
			a1.input();
			Hanghoagiadung1.add(a1);
		}
		System.out.println(" nhap thong tin hang hoa dien tu thu :");
		for (int i = 0; i < m; i++) {
			System.out.println("  [" + (i + 1) + "]:");
			hanghoadientu b1 = new hanghoadientu();
			b1.input();
			Hanghoadientu.add(b1);
		}
		System.out.println(" hang hoa gia dung ");
		for (int i = 0; i < n; i++) {
			System.out.println("[" + (i + 1) + "]:");
			Hanghoagiadung a = Hanghoagiadung1.get(i);
			a.output();
		}
		System.out.println(" hang hoa dien tu  ");
		for (int i = 0; i < m; i++) {
			System.out.println("[" + (i + 1) + "]:");
			hanghoadientu b = Hanghoadientu.get(i);
			b.output();
		}
	}
}