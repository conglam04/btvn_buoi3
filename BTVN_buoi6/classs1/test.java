package classs1;
import java.util.*;
 class Animal {
public static Scanner s = new Scanner(System.in);
private String name ;
private byte age;
private float weight ;
public Animal() {
	
}
public Animal(String name, byte age, float weight) {
	this.name = name;
	this.age = age;
	this.weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public byte getAge() {
	return age;
}
public void setAge(byte age) {
	this.age = age;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
public void input() {
	System.out.println(" nhap lan luot name - age - weight : ");
	this.name = s.nextLine();
	this.age = s.nextByte();s.nextLine();
	this.weight = s.nextFloat();s.nextLine();
}
public void output() {
	System.out.println(" name : "+name+"\n"+" age : "+"\n"+" weight : "+ weight);
}
public void Tiengkeu() {
	System.out.println(" you you you ...");
}
}
 class Cat extends Animal{
	private String color,preferences,ownerName ;

	public Cat() {
		
	}

	public Cat(String color, String preferences, String ownerName,String name,byte age ,float weight) {
		super(name,age,weight);
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void input() {
		super.input();
		System.out.println(" nhap lan luot cac:  color - preferences - ownername ");
		this.color = s.nextLine();
		this.preferences = s.nextLine();
		this.ownerName = s.nextLine();
	}
	public void output() {
		super.output();
		System.out.println(" color : "+color+"\n"+" preferences : "+preferences+"\n"+" ownerName : "+ownerName);
	}
	@Override
	public void Tiengkeu() {
		super.Tiengkeu();
		System.out.println(" meo meo mep ...");
	}
	
}
 class dog extends Animal{
	 private String Charader;

	public dog() {
		
	}

	public dog(String name, byte age, float weight, String charader) {
		super(name, age, weight);
		this.Charader = charader;
	}

	public String getCharader() {
		return Charader;
	}

	public void setCharader(String charader) {
		Charader = charader;
	}
	 public void input() {
		 super.input();
		 System.out.print(" charader : ");
		 this.Charader = s.nextLine();
	 }
	 public  void output() {
		 super.output();
		 System.out.println(" charader : "+Charader);
	 }
	 @Override
	 public void Tiengkeu() {
		 super.Tiengkeu();
		 System.out.println(" go go go ...");
	 }
 }
 public class test{
	 public static void main(String[] args) {
		Cat cat = new Cat();
		dog Dog = new dog();
		System.out.println(" nhap thong tin  cat : ");
		cat.input();
		System.out.println(" thong tin cat : ");
		cat.output();
		cat.Tiengkeu();
		System.out.println(" nhap thong tin Dog : ");
		Dog.input();
		System.out.println(" thong tin Dog : ");
		Dog.output();
		Dog.Tiengkeu();
	}
 }
