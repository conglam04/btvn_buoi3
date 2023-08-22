package buoi4;

import java.util.*;

public class sach {
	public static Scanner h = new Scanner(System.in);
	public double masach, namxs;
	public String tensach, tentg, nhasx;

	public sach() {

	}

	public sach(double masach, double namxs, String tensach, String tentg, String nhasx) {
		super();
		this.masach = masach;
		this.namxs = namxs;
		this.tensach = tensach;
		this.tentg = tentg;
		this.nhasx = nhasx;
	}

	public double getMasach() {
		return masach;
	}

	public void setMasach(double masach) {
		this.masach = masach;
	}

	public double getNamxs() {
		return namxs;
	}

	public void setNamxs(double namxs) {
		this.namxs = namxs;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getTentg() {
		return tentg;
	}

	public void setTentg(String tentg) {
		this.tentg = tentg;
	}

	public String getNhasx() {
		return nhasx;
	}

	public void setNhasx(String nhasx) {
		this.nhasx = nhasx;
	}

	public void nhap() {
		System.out.print("ma sach : ");
		this.masach = h.nextDouble();
		h.nextLine();
		System.out.print("nam san xuat : ");
		this.namxs = h.nextDouble();
		h.nextLine();
		System.out.print(" ten sach : ");
		this.tensach = h.nextLine();
		System.out.print("ten tac gia : ");
		this.tentg = h.nextLine();
		System.out.print("nha san xuat : ");
		this.nhasx = h.nextLine();

	}

	public void xuat() {
		System.out.print("00" + masach + "\t- ");
		System.out.print(tensach + "\t- ");
		System.out.print(tentg + "\t- ");
		System.out.print(nhasx + "\t- ");
		System.out.print(namxs + "\t");
	}

	public static void main(String[] args) {
		int n;
		do {
			System.out.print(" nhap n : ");
			n = h.nextInt();
		} while (n < 0);
		sach[] s = new sach[n];
		for (int i = 0; i < n; i++) {
			System.out.println("[" + (i + 1) + "]:");
			s[i] = new sach();
			s[i].nhap();

		}
		System.out.println("masach |  ten sach |  ten tac gia  |  nha san xuat  |  nam san xuat");
		for (int i = 0; i < n; i++) {
			s[i].xuat();
		}

	}
}
