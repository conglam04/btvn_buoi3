package bai3;
import java.util.*;
public class Address {
public static Scanner s = new Scanner(System.in);
private String city , district ;
public Address() {
	
}
public Address(String city, String district) {
	super();
	this.city = city;
	this.district = district;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public void input() {
	System.out.println(" nhap city : ");
	this.city = s.nextLine();
	System.out.println(" nhap district : ");
	this.district = s.nextLine();
}
public void output() {
	System.out.println(" city : "+city+"\n"+" district : "+district);
}
public static void main(String[] args) {
	
}
}
