import java.util.Scanner;

class A
{
	int id;
	String name;
	int age;
	int sal;
	String desg;

	A()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id : ");
		id = sc.nextInt();

		System.out.println("Enter name : ");
		name = sc.next();

		System.out.println("Enter age : ");
		age = sc.nextInt();

		System.out.println("Enter salary : ");
	        sal = sc.nextInt();

		System.out.println("Enter Designation : ");
		desg = sc.next();
	}
	void display()
	{
		System.out.println("My ID is : "+id);
		System.out.println("My name is : "+name);
		System.out.println("My AGE is : "+age);
		System.out.println("My SALARY is : "+sal);
		System.out.println("My DESIGNATION is : "+desg);
	}
}
class demo3
{
	public static void main(String args[])
	{
		A a= new A();
		a.display();
	}
}