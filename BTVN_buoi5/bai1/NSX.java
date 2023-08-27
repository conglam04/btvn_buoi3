package bai1;

import java.sql.PseudoColumnUsage;
import java.util.*;

public class NSX {
	public static Scanner s = new Scanner(System.in);
	private String Mansx;
	private String Tennsx;
	private String Dcnsx;

	public NSX() {

	}

	public NSX(String mansx, String tennsx, String dcnsx) {
		super();
		this.Mansx = mansx;
		this.Tennsx = tennsx;
		this.Dcnsx = dcnsx;
	}

	public String getMansx() {
		return Mansx;
	}

	public void setMansx(String mansx) {
		Mansx = mansx;
	}

	public String getTennsx() {
		return Tennsx;
	}

	public void setTennsx(String tennsx) {
		Tennsx = tennsx;
	}

	public String getDcnsx() {
		return Dcnsx;
	}

	public void setDcnsx(String dcnsx) {
		Dcnsx = dcnsx;
	}

	public void nhap() {
		System.out.print(" ten NSX : ");
		this.Tennsx = s.nextLine();
		System.out.print(" ma NSX : ");
		this.Mansx = s.nextLine();
		System.out.print(" dc NSX : ");
		this.Dcnsx = s.nextLine();
	}

	public void xuat() {
		System.out.println(" ten : " + Tennsx);
		System.out.println(" ma : " + Mansx);
		System.out.println(" dc : " + Dcnsx);
	}

	public static void main(String[] args) {

	}
}
