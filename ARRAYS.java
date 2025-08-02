package my_project;
import java.util;
import java.util.Scanner;
public class ARRAYS {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of an array");
int n=sc.nextInt();
int[] a=new int[n];
int[] b=new int[n];
int[] c=new int[n];

System.out.println("Enter elements into 1st array:");
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}

System.out.println("Enter elements into 2nd array:");
for(int i=0;i<n;i++) {
	b[i]=sc.nextInt();
}


for(int i=0;i<n;i++) {
	c[i]=a[i]+b[i];
}
System.out.println("Array elements after Addition:");
for(int i=0;i<n;i++) {
System.out.print(c[i]+" ");
}
}
}