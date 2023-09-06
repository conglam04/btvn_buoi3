package bai3;
import java.util.*;
public class Classroom {
public static Scanner s = new Scanner(System.in);
private int classid , numberofStudent;
private List<Student> listStudent = new ArrayList<>();
public Classroom() {
	
}
public Classroom(int classid, int numberofStudent, List<Student> listStudent) {
	super();
	this.classid = classid;
	this.numberofStudent = numberofStudent;
	this.listStudent = listStudent;
}
public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public int getNumberofStudent() {
	return numberofStudent;
}
public void setNumberofStudent(int numberofStudent) {
	this.numberofStudent = numberofStudent;
}
public List<Student> getListStudent() {
	return listStudent;
}
public void setListStudent(List<Student> listStudent) {
	this.listStudent = listStudent;
}

public void input() {
	System.out.println(" nhap classid : ");
	this.classid = s.nextInt();
	System.out.println(" nhap numberofstudent : ");
	this.numberofStudent = s.nextInt() ;
	for(int i = 0 ; i < numberofStudent ; i++) {
		System.out.println(" ["+(i+1)+"]:");
		Student a = new Student();
		a.input();
		listStudent.add(a);
	}
}
	public void output () {
		
		System.out.println(" classid : "+classid+"\n"+" numberofstudent : "+numberofStudent);
		for(int i = 0 ; i < getNumberofStudent() ; i++) {
			System.out.println(" ["+(i+1)+"]:");
			Student b  = listStudent.get(i);
			b.output();
		}
	}
	public static void main(String[] args) {
		Classroom d = new Classroom();
		d.input();
		d.output();
	}
	 
}


