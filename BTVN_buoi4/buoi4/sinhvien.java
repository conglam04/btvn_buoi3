package buoi4;

import java.util.*;

public class sinhvien {
	public static Scanner k = new Scanner(System.in);
	public long masinhvien;
	public float diemtoan, diemly, diemhoa;
	public String hoten;

	public sinhvien() {

	}

	public sinhvien(long masinhvien, float diemtoan, float diemly, float diemhoa, String hoten) {
		super();
		this.masinhvien = masinhvien;
		this.diemtoan = diemtoan;
		this.diemly = diemly;
		this.diemhoa = diemhoa;
		this.hoten = hoten;
	}

	public long getMasinhvien() {
		return masinhvien;
	}

	public void setMasinhvien(long masinhvien) {
		this.masinhvien = masinhvien;
	}

	public float getDiemtoan() {
		return diemtoan;
	}

	public void setDiemtoan(float diemtoan) {
		this.diemtoan = diemtoan;
	}

	public float getDiemly() {
		return diemly;
	}

	public void setDiemly(float diemly) {
		this.diemly = diemly;
	}

	public float getDiemhoa() {
		return diemhoa;
	}

	public void setDiemhoa(float diemhoa) {
		this.diemhoa = diemhoa;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;

	}

	public void nhap1() {
		System.out.print(" nhap ma sinh vien : ");
		this.masinhvien = k.nextLong();
		k.nextLine();
		System.out.print(" nhap ho ten : ");
		this.hoten = k.nextLine();
		do {
			System.out.print(" nhap diem toan : ");
			this.diemtoan = k.nextFloat();
			System.out.print(" nhap diem ly : ");
			this.diemly = k.nextFloat();
			System.out.print(" nhap diem hoa : ");
			this.diemhoa = k.nextFloat();
		} while (diemtoan < 0 || diemly < 0 || diemhoa < 0 || diemtoan > 10 || diemly > 10 || diemhoa > 10);
	}

	public void xuat1() {
		System.out.print(masinhvien + "\t");
		System.out.print(hoten + "\t");
		System.out.print(diemtoan + "\t");
		System.out.print(diemly + "\t");
		System.out.print(diemhoa + "\t");
		System.out.print(TB1() + "\t");
	}

	public float TB1() {
		return (diemtoan + diemhoa + diemly) / 3;
	}

	public static void main(String[] args) {

		sinhvien[] a = new sinhvien[5];
		System.out.println(" sinh vien : ");
		for (int i = 0; i < 5; i++) {
			System.out.println(" [" + (i + 1) + "]:");
			a[i] = new sinhvien();
			a[i].nhap1();
		}
		System.out.println(" thong tin sinh vien : ");
		System.out.println(" masv    hoten     diemtoan   diemly   diemhoa     diemtb   ");
		for (int i = 0; i < 5; i++) {
			System.out.println("\n [" + (i + 1) + "]:");
			a[i].xuat1();
		}

	}
}