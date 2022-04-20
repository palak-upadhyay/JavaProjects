import java.util.Scanner;

class A
{
	A()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter age : ");
		int age = sc.nextInt();

		System.out.println("Enter salary : ");
		int sal = sc.nextInt();

		System.out.println("Enter Designation : ");
		String desg = sc.next();

		System.out.println("My ID is :" +id);
		System.out.println("My Name is :" +name);
		System.out.println("My Age is :" +age);
		System.out.println("My Salary is :" +sal);
		System.out.println("My Designation is :" +desg);

	}
}

class Demo
{
	public static void main (String args[])
	{
		A a=new A();
	}
}