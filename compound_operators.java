package my_project;
import java.util.*;
public class compound_operators {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER A & B VALUES:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	 
	a+=b; //10+5=15
	System.out.println("comp +=: "+a);
	a-=b; //10-5=5
	System.out.println("comp -=: "+a);
	a*=b;  //10*5=50
	System.out.println("comp *=: "+a);
    a/=b;  //10/5=2
    System.out.println("comp /=: "+a);
    a%=b;//10%5=0
    System.out.println("comp +=: "+a);
    a|=b;
    System.out.println("comp |=: "+a);
    a&=b;
    System.out.println("comp &=: "+a);
    a^=b;
    System.out.println("comp ^=: "+a);
    a <<=b;
    System.out.println("comp <<=: "+a);
    a>>=b;
    System.out.println("comp >>=: "+a);
     	
}
}
