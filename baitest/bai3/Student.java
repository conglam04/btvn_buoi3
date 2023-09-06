package bai3;

import java.util.ArrayList;
import java.util.*;
	public class Student extends Person {
		private int id;
		private Address address = new Address();
		private double gpa;

		public Student() {

		}

		public Student(String name, String gender, int age, int id, Address address, double gpa) {
			super(name, gender, age);
			this.id = id;
			this.address = address;
			this.gpa = gpa;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public double getGpa() {
			return gpa;
		}

		public void setGpa(double gpa) {
			this.gpa = gpa;
		}

		@Override
		public void input() {
			super.input();
			System.out.println(" nhap id : ");
			this.id = s.nextInt();
			s.nextLine();
			address.input();
			this.gpa = s.nextDouble();
			s.nextLine();
		}

		@Override
		public void output() {
			super.output();
			System.out.println(" id : " + id);
			address.output();
			System.out.println(" age : " + gpa);
		}
	}

