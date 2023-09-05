package bai3;
import java.util.*;
public class Vatlieu {
public static Scanner s = new Scanner(System.in);
private String Ten,mauSac ;
private int doCong;
public Vatlieu() {
	
}
public Vatlieu(String ten, String mauSac, int doCong) {
	this.Ten = ten;
	this.mauSac = mauSac;
	this.doCong = doCong;
}
public String getTen() {
	return Ten;
}
public void setTen(String ten) {
	Ten = ten;
}
public String getMauSac() {
	return mauSac;
}
public void setMauSac(String mauSac) {
	this.mauSac = mauSac;
}
public int getDoCong() {
	return doCong;
}
public void setDoCong(int doCong) {
	this.doCong = doCong;
}
public void input() {
	System.out.print(" nhap ten : ");
	this.Ten = s.nextLine();
	System.out.print(" nhap mau : ");
	this.mauSac = s.nextLine();
	System.out.print(" do cung : ");
	this.doCong= s.nextInt();s.nextLine();
}
public void output() {
	System.out.println(" ten : "+Ten+"\n"+" mau : "+mauSac+"\n"+" co cung : "+doCong);
}
public static void main(String[] args) {
	
}
}
