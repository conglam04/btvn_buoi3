package buoi4;
import java.util.*;
public class bai4 {
public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
     String a = s.nextLine();
     String b = new StringBuilder(a).reverse().toString();
     if(a.compareTo(b)==0)
     System.out.println("True");
     else
     System.out.println("False");
}
}
