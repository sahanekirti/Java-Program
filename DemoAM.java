
class MyClass
{
 int a;
 int b; 
 MyClass()//default constructor
 {
 	a=0;b=0;
 }
 MyClass(int x,int y) // parameterized constructor
 {
 a=x;
 b=y;
 }
 void display()
 {
 
 System.out.println("a="+a+",b="+b);
 }
}
public class DemoAM {
 public static void main(String[] args) {
 MyClass M1=new MyClass(23,34);//object
 System.out.println("M1 object=>");
 M1.display();
 System.out.println("M2 object=>");
 MyClass M2=new MyClass();
 M2.display();
} 
 
 }
