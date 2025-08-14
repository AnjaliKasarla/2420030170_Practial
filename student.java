package my_project;

public class student {
String name;
int rollno;
double marks;
// defualt constructor
student(){
	name= "Unknown";
	rollno=0;
	marks=0.0;
	//System.out.println(""+name+"\n"+""+rollno+"\n"+""+marks);
}
//parameterized constructor 1
student(String nme){
	name= nme;
	rollno=0;
	marks=0.0;
	//System.out.println(""+name+"\n"+""+rollno+"\n"+""+marks);
}
//constructor 2
student(String nme,int rn){
	name= nme;
	rollno=rn;
	marks=0.0;
	//System.out.println(""+name+"\n"+""+rollno+"\n"+""+marks);
}
//constructor 3
student(String nme,int rn,double m){
	name= nme;
	rollno=rn;
	marks=m;
	//System.out.println(""+name+"\n"+""+rollno+"\n"+""+marks);
}

void print() {
	System.out.println(""+name+"\n"+""+rollno+"\n"+""+marks);
	System.out.println();
}
public static void main(String args[]) {
	student s1=new student();
	student s2=new student("Anjali");
	student s3=new student("Bob",1);
	student s4=new student("AK",1,20);
	s1.print();
	s2.print();
	s3.print();
	s4.print();
}
}
