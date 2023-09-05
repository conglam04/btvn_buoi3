package bai2;

import java.util.*;

public class Date {
	public static Scanner s = new Scanner(System.in);
	private byte year, month, day;

	public Date() {
		super();
	}

	public Date(byte year, byte month, byte day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public byte getYear() {
		return year;
	}

	public void setYear(byte year) {
		this.year = year;
	}

	public byte getMonth() {
		return month;
	}

	public void setMonth(byte month) {
		this.month = month;
	}

	public byte getDay() {
		return day;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public void input() {
		do {
			this.day = s.nextByte();
			this.month = s.nextByte();
			this.year = s.nextByte();
		} while (day <= 0 || day > 31 || month <= 0 || month > 12 || year <= 0);
	}

	public void output() {
		System.out.println(" ngay : " + day + "/" + month + "/" + year);
	}

	public static void main(String[] args) {

	}
}
