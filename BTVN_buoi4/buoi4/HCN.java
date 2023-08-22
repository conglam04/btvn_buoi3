package buoi4;

import java.util.*;

public class HCN {
	public static Scanner in = new Scanner(System.in);
	public int chieudai;
	public int chieurong;

	public HCN() {

	}

	public HCN(int chieudai, int chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}

	public int getChieurong() {
		return chieurong;
	}

	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}

	public void nhap() {
		do {
			System.out.print(" chieu dai :");
			this.chieudai = in.nextInt();
			System.out.print(" chieu rong :");
			this.chieurong = in.nextInt();
		} while (chieudai <= 0 || chieurong <= 0 || chieudai < chieurong);
	}

	public void xuat() {
		System.out.println(" chieu dai : " + chieudai);
		System.out.println(" chieu rong : " + chieurong);
	}

	public void vehcn() {
		for (int i = 1; i <= chieurong; i++) {
			for (int j = 1; j <= chieudai; j++) {
				if (i == 1 || i == chieurong || j == 1 || j == chieudai) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
	}

	public float chuvi() {
		return (this.chieudai + this.chieurong) * 2;
	}

	public float dientich() {
		return this.chieudai * this.chieurong;
	}

	public static void main(String[] args) {
		HCN s = new HCN();
		s.nhap();
		s.xuat();
		s.vehcn();
		System.out.println(" chu vi = " + s.chuvi());
		System.out.println(" dien tich = " + s.dientich());
	}

}