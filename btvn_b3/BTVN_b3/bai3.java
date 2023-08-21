package buoi4;
import java.util.*;
public class bai3 {
public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	    System.out.print("Nhap so luong phan tu : ");
	    int n= s.nextInt();
	    int [] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        System.out.print("a["+i+"] = ");
	        a[i]=s.nextInt();
	    }
	    System.out.print("mang vua nhap la : ");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	    System.out.print("\nmang sau khi sap xep la : ");
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i]>a[j])
	            {
	                int b =a[i];
	                a[i] = a[j];
	                a[j]= b;
	            }
	        }
	    }
	     for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
}
}
