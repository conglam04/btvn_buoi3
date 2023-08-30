package bai3;
import java.util.*;
public class Phongmay {
public static Scanner s = new Scanner(System.in);
private String Maphong , Tenphong ;
private double Dientich;
private Quanly x = new Quanly();
private May y = new May();
private Integer n ;
public Phongmay() {
	super();
}

public Phongmay(String maphong, String tenphong, double dientich, Quanly x, May y, Integer n) {
	super();
	Maphong = maphong;
	Tenphong = tenphong;
	Dientich = dientich;
	this.x = x;
	this.y = y;
	this.n = n;
}

public String getMaphong() {
	return Maphong;
}
public void setMaphong(String maphong) {
	Maphong = maphong;
}
public String getTenphong() {
	return Tenphong;
}
public void setTenphong(String tenphong) {
	Tenphong = tenphong;
}
public double getDientich() {
	return Dientich;
}
public void setDientich(double dientich) {
	Dientich = dientich;
}
public Quanly getX() {
	return x;
}
public void setX(Quanly x) {
	this.x = x;
}
public May getY() {
	return y;
}
public void setY(May y) {
	this.y = y;
}

public Integer getN() {
	return n;
}

public void setN(Integer n) {
	this.n = n;
}

public void input(Phongmay[] a) {
	// nhap ma phong - ten phong - dien tich - thong tin quan ly - thong tin may 
	System.out.println(" nhap lan luot thong tin phong may : ");
	this.Maphong = s.nextLine();
	this.Tenphong = s.nextLine();
	this.Dientich = s.nextDouble(); s.nextLine();
	// nhap maQL - TenQL
	x.input();
	System.out.print( " nhap so may : ");
	this.n = s.nextInt();
	for(int i = 1 ; i <= n ; i++) {
		System.out.println("["+i+"]:");
		a[i] = new Phongmay();
		a[i].y.input();
	}
}
public void output(Phongmay[] a) {
	System.out.println(" Ma phong : "+Maphong);
	System.out.println(" ten phong : "+Tenphong);
	System.out.println(" dien tich : "+Dientich);
    x.output();
    System.out.println(n+" may ");
    System.out.println("\t ma may \t ten may \t tinh trang ");
    for(int i = 1 ; i <= n ; i++) {
    	System.out.print("["+i+"]: \t ");
    	a[i].y.output();
    	System.out.println();
    }
}
public static void main(String[] args) {
	Phongmay[] a = new Phongmay[100];
	Phongmay phongmay = new Phongmay();
	phongmay.input(a);
	phongmay.output(a);
	
}
}
