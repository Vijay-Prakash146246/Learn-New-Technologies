Class Test
{ 
	1) variables
	2) methods
	3) constructors
	4) instance blocks
	5) static blocks
}
//Java Variables:
 Variables are used to store the constant values by using these values we are achieving project requirements.
 Variables are also known as fields of a class or properties of a class.
 Variable declaration is composed of three components in order,
o Zero or more modifiers.
o The variable type.
o The variable name.
o Constant value/ literal
public final int x=100;
There are three types of variables in java
1. Local variables.
2. Instance variables.
3. Static variables.
//Local variables:
 The variables which are declare inside a method or constructor or blocks those variables are called local variables.
class Test 
{
	public static void main(String[] args) 
	{
		//local variables
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
30
*/
 It is possible to access local variables only inside the method or constructor or blocks only, it is not possible to access outside of method or constructor or blocks.
void add()
{ 
	int a=10;
	System.out.println(a); //possible
}
void mul()
{ 
	System.out.println(a);
} //not-possible
 Local variables memory allocated when method starts & memory released when method completed.
 The local variables are stored in stack memory.
//There are five types of memory areas in java:
1. Heap memory
2. Stack memory
3. Method area
4. SCP(String constant pool) memory
5. Native method stacks
//Areas of java: There are two types’ areas in java.
Instance Area:-
void m1() //instance method
{ 
	Logics here //instance area
}
Static Area:-
Static void m1() //static method
{ 
	Logics here //static area
}
//Instance variables (non-static variables):
 The variables which are declare inside a class but outside of methods are called instance variables.
 The scope (permission) of instance variable is inside the class having global visibility.
 Instance variables memory allocated during object creation& memory released when object is destroyed.
 Instance variables are stored in heap memory.
//Instance variable accessing:
                  (Instance variables& methods)
Directly can access                      Access by using Object 
Instance Area                              Static Area
class Test
{ 
	//instance variables
	int a=10;
	int b=20;
	//static method
public static void main(String[] args)
{ 
	//Static Area
	Test t=new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	t.m1(); //instance method calling
}
//instance method
void m1()
{
	//instance area
	System.out.println(a);
	System.out.println(b);
}//main ends
};//class ends
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
10
20
10
20
*/
 In java program execution always starts from main method called by JVM.
 The JVM is responsible to execute only main method so must call the user defined method (m1)inside the main method then only user method will be executed.
//Example :-operator overloading
 One operator with more than one behavior is called operator over loading.
 Java is not supporting operator overloading concept but only one implicit overloaded operator in java is + operator.
o If two operands are integers then plus (+) perform addition.
o If at least one operand is String then plus (+) perform concatenation.
class Test
{ 
	public static void main(String[] args)
	{ 
		System.out.println(10+20); //addition
		System.out.println("ratan"+"anushka"+2+2+"kids"); //concatenation
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a);
		System.out.println(a+"---");
		System.out.println(a+"---"+b);
		System.out.println(a+"---"+b+"----");
		System.out.println(a+"---"+b+"----"+c);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
30
ratananushka22kids
10
10---
10---20
10---20----
10---20----30
*/
//Example: -Different ways to initialize the variables
class Test
{ 
	int p=10,q=20,r=30; //10 20 30
	int i=10,j=20,k; //10 20 0
	int x=10,y,z; //10 0 0
	static int d=10,e,f=30; //10 0 30
	static int a,b,c; //0 0 0
	public static void main(String[] args)
	{ 
		Test t = new Test();
		System.out.println(t.p+"---"+t.q+"---"+t.r);
		System.out.println(t.i+"---"+t.j+"---"+t.k);
		System.out.println(t.x+"---"+t.y+"---"+t.z);
		System.out.println(Test.d+"---"+Test.e+"---"+Test.f);
		System.out.println(Test.a+"---"+Test.b+"---"+Test.c);
}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
10---20---30
10---20---0
10---0---0
10---0---30
0---0---0
*/
//Static variables (class variables):
 The variables which are declared inside the class but outside of the methods with static modifier are called static variables.
 Scope of the static variables with in the class global visibility.
 Static variables memory allocated during .class file loading and memory released at .class file unloading time.
 Static variables are stored in method area.
//Static variables & methods accessing:
(Static variables& static methods)
Access the static members by using class name in both area Static as well as instance area.
class Test
{ 
	//static variables
	static int a=1000;
	static int b=2000;
	public static void main(String[] args) //static method
	{ 
		System.out.println(Test.a);
		System.out.println(Test.b);
		Test t = new Test();
		t.m1(); //instance method calling
	}
	void m1() //instance method
	{ 
		System.out.println(Test.a);
		System.out.println(Test.b);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
1000
2000
1000
2000
*/
//Static variables calling: - 
There are three ways to access the static members
1) Direct accessing
2) By using reference variable.
3) By using class-name. (Project level use this approach)
class Test
{ 
	static int a=100; //static variable
	public static void main(String[] args)
	{ 
		System.out.println(a); //1-way(directly possible)
		System.out.println(Test.a); //2-way(By using class name)
		Test t=new Test();
		System.out.println(t.a); //3-way(By using reference variable)
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
100
100
100
*/
//Example: -
 It is possible to create the objects inside the main method & inside the user defined methods also.
 When we create object inside method that object is destroyed when method completed, if any other method required object then create the object inside that method.
class Test
{ 
	int a=10;
	int b=20;
	static void m1()
	{ 
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
	}
	static void m2()
	{ 
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
	}
	public static void main(String[] args)
	{ 
		Test.m1(); //static method calling
		Test.m2(); //static method calling
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
10
20
10
20
*/
//Variables VS default values:
Case 1:-for the instance & static variables JVM will assign default values.
class Test
{ 
	int a;
	static boolean b;
	public static void main(String[] args)
	{ 
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(Test.b);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
0
false
*/

Case 2:-
 Local variables JVM does not provide default values.
 In java before using local variables must initialize some values to the variables otherwise compiler generates compilationerror “variable a might not have been initialized”.
class Test
{ 
	public static void main(String[] args)
	{ 
		int a;
		System.out.println(a);//error: variable a might not have been initialized
	}
}
//Class vs. Object:-
 Class is a logical entity it contains logics where as object is physical entity it is representing memory.
 Class is blue print it decides object creation without class we are unable to create object.
 Based on single class it is possible to create multiple objects but every object occupies memory.
 We are declaring the class by using class keyword but we are creating object by using new keyword.
//Instance vs. Static variables:-
 In case of instance variables the JVM will create separate copy of memory for each and every object.
 When we perform modifications on instance variables that will be reflected on same object only.
 In case of static variables irrespective of object creation per class single memory is allocated.
 When we performed modifications on static variable then will be reflected on next created all objects.
class Test
{
	int a=10;
	static int b=20;
	public static void main(String[] args)
	{ 
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=111;
		t.b=222;
		System.out.println(t.a);
		System.out.println(t.b);
		Test t1 = new Test();
		System.out.println(t1.a);
		System.out.println(t1.b);
		t1.b=444;
		Test t2 = new Test();
		System.out.println(t2.a);
		System.out.println(t2.b);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
10
20
111
222
10
222
10
444
*/
 Inside the classes it is not possible to write the business logics directly, so inside the class declares the method inside that method writes the logics of the application.
 Methods are used to write the business logics of the application.
ex: post() , charAt() , toUpperCase() , compareToIgnoreCase()……etc
There are two types of methods in java,
1. Instance method
Instance method:
void m1() //instance method
{ 
	//body //instance area
}
//Note: Instance member’s memory is allocated during object creation hence accesses the instance members by using object-name (reference-variable).
Objectname.instancemethod( );//calling instance method
Test t = new Test();
t.m1( );
2. Static method
Static method:
static void m1() //static method
{
	//body //static area
}
Note: Static member’s memory allocated during .class file loading hence access the static members
by using class-name.
Classname.staticmethod( ); // call static method by using class name
Test.m2( );
//Every method contains three parts.
1. Method declaration
2. Method implementation (logic)
3. Method calling
ex : 
void m1() ------> method declaration
{ Body (Business logic); -----> method implementation
}
Test t = new Test();
t.m1(); ------> method calling
Method Syntax:
[modifiers-list] return-Type Method-name (parameters list) throws Exception
Method name ---> functionality name
Parameter-list ---> input to functionality
Modifiers-list ---> represent access permissions.
Return-type ---> functionality return value
Throws Exception ---> representing exception handling
ex: Public void m1()
Private int m2(int a,int b)
Private String m2(char ch)throws Exception
//Method Signature: Method-name & parameters list is called method signature.
Syntax: Method-name(parameter-list)
ex: m1(int a)
m2(int a,int b)
//ex 2: Instance & static methods with parameters.
 If the method is expecting parameters (inputs to functionality), while calling that method must pass the values to parameters.
 If the method expecting three arguments must pass three arguments, not less than three not more than three.
 Method arguments are always local variables.
class Test
{ 
	void m1(int a,char ch) //local variables
	{ 
		System.out.println("m1 instance method");
		System.out.println(a);
		System.out.println(ch);
	}
	static void m2(String str,boolean b,double d)
	{
		System.out.println("m2 static method");
		System.out.println(str);
		System.out.println(b);
		System.out.println(d);
	}
	void m3(int a, int b)
	{ 
		System.out.println("m3 method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		t.m1(10,'a');
		Test.m2("ratan",true,10.5);
		int x=100;
		int y=200;
		t.m3(x,y);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 instance method
10
a
m2 static method
ratan
true
10.5
m3 method
100
200
*/
//Ex 7 : java methods it is possible to provide Objects as a parameters(in real time project).
class Emp{ }
class Student{ }
class Dog{ }
class Animal{ }
class Test
{ 
	void m1(Emp e,Student s)
	{ 
		System.out.println("m1 method");
		System.out.println(e+" "+s);
	}
	static void m2(int a,Animal a1,Dog d)
	{ 
		System.out.println("m2 method");
		System.out.println(a+" "+a1+" "+d);
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		Emp e = new Emp();
		Student s = new Student();
		t.m1(e,s);
		Animal x = new Animal();
		Dog d = new Dog();
		Test.m2(10,x,d);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 method
Emp@15db9742 Student@6d06d69c
m2 method
10 Animal@7852e922 Dog@4e25154f
*/
 In above example when we print reference variables hash code is printed (we will discuss later)
 The extra classes (Dog,Animal…) these classes it may belongs to same module classes or differnet module classes.
//ex 4: Java methods return type is mandatory, otherwise the compilation will generate error message “invalid method declaration; return type required “.
class Test
{ 
	m1()
	{

	}
}
error: invalid method declaration; return type required
//ex 5: Inside the class it is not possible to declare more than one method with same signature(duplicate methods) , if we are trying to declare with same signature compiler
//generates error : “m1() is already defined in Test”
class Test
{ 
	void m1()
	{ 
		System.out.println("m1 method");
	}
	void m1()
	{
		System.out.println("m1 method");
	}
}
error: m1() is already defined in Test

ex 6:
 Declaring the class inside another class is called inner classes, java supports inner classes.
 Declaring the methods inside other methods is called inner methods but java not supporting inner methods concept if we are trying to declare inner methods compiler 
generate error message.
class Test
{ 
	void m1()
	{ 
		void m2() //inner method : error: illegal start of expression
		{
		}
	}
}
error: illegal start of expression
ex -8 :
If the application continas both instnace & local variables with same name, in this case to represent instance variables we have two approaches.
1. Access by uisng this keyword
2. Access by using object.
‘This’ keyword is used to represent current class object.
class Test
{ 
	int a=100,b=200;
		void add(int a,int b)
		{ 
			System.out.println(a+b);
			System.out.println(this.a+this.b); //approach-1
			Test t = new Test();
			System.out.println(t.a+t.b); //approach-2
	   }
		public static void main(String[] args)
		{ 
			Test t = new Test();
			t.add(10,20);
		}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
30
300
300
*/
//Case 1: Invalid : inside the static area this keyword not allowed
Int a=100,b=200;
static void add(int a,int b)
{ 
	System.out.println(this.a+this.b);
}
Compilation error:-non-static variable this cannot be referenced from a static context.
//Case 2: In almost all cases we are using this keyword to represent instacne variables but inside the static area this keyword is not allowed hence use object creation approach.
Int a=100,b=200;
static void add(int a,int b)
{ 
	Test t = new Test();
	System.out.println(t.a+t.b);
}
//Example 9 :- methods vs return type.
 Java methods return type is mandatory & void represents no return value.
 Methods can have any return type like primitive type such as byte,short,int,long,float &Arrays type ,Class type , Interface type ,Enum type….etc
 If the method is having return type other than void then must return the value by using return keyword otherwise compiler will generate error message “missing return statement”
Invalid
int m1()
{ 
	System.out.println("Anushka");
}
Valid
int m1()
{ 
	System.out.println("Anushka");
    return 100;
}
 Inside the method it is possible to declare only one return statement, that statement must be last statement of the method otherwise compiler will generate error message.
 Method is able to returns the value, it is recommended to hold the return value check the status of the method but it is optional.
class Test
	{ 
		int m1()
		{ 
			System.out.println("m1 method");
			return 10;
		}
		static boolean m2()
		{ 
			System.out.println("m2 method");
			return false;
		}
		String m3()
		{ 
			System.out.println("m3 method");
			return "ratan";
		}
		public static void main(String[] args)
		{ 
			Test t = new Test();
			int x = t.m1();
			System.out.println("m1 method return value="+x);
			boolean b = Test.m2();
			System.out.println("m2 method return value="+b);
			String str = t.m3();
			System.out.println("m3 method return value="+str);
		}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 method
m1 method return value=10
m2 method
m2 method return value=false
m3 method
m3 method return value=ratan
*/
class Test
{ 
	int m1()
	{ 
		System.out.println("m1 method");
		return 10;
	}
	static String m2()
	{ 
		System.out.println("m2 method");
		return "ratan";
	}
	int add(int a,int b)
	{ 
		return a+b;
	}
	static String login(String uname,String upwd)
	{ 
		if (uname.equals("ratan"))
		{ 
			return "success";
		}
		else
		{ 
			return "fail";
		}	

	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		int x = t.m1();
		System.out.println("return value="+x);
		String str = Test.m2();
		System.out.println("return value="+str);
		int addition = t.add(10,20);
		System.out.println("return value="+addition);
		String status = Test.login("ratan","anu");
		System.out.println("Logins status="+status);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 method
return value=10
m2 method
return value=ratan
return value=30
Logins status=success
*/

//ex 10: It is possible to print return value of the method in two ways,
1. Hold the return value & print that value.
2. Directly print the value by calling method using System.out.println()
class Test
{ 
	int m1()
	{ 
		System.out.println("m1 method");
		return 10;
	}
	public static void main(String[] args)
	{ 
	Test t =new Test();
	int x = t.m1();
	System.out.println("return value="+x); //1-way printing return value
	System.out.println("return value="+t.m1()); //2-way printing return value
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 method
return value=10
m1 method
return value=10
*/
Observation : If the method is having return type is void but if we are trying to call method by using System.out.println() then compiler will generate error message.

class Test
{ 
	static void m2()
	{ 
		System.out.println("m2 method");
	}
	public static void main(String[] args)
	{ 
	    System.out.println(Test.m2());
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java
Test.java:9: error: 'void' type not allowed here
            System.out.println(Test.m2());
                                      ^
1 error
*/
Compilation error:'void' type not allowed here
//Example 11:- method return type is object
class Student{ }
class Emp{ }
class Test
{ 
	Emp m1()
	{ 
		System.out.println("m1 method");
		Emp e = new Emp();
		return e;
	}
	Student m2()
	{ 
		System.out.println("m2 method");
		Student s = new Student();
		return s;
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		Emp e = t.m1();
		System.out.println("return value="+e);
		Student s = t.m2();
		System.out.println("return value="+s);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 method
return value=Emp@15db9742
m2 method
return value=Student@6d06d69c
*/
Example 12 :-Java method is able to return current class object in two ways.
1) Creating object & return reference variable.
2) Return this keyword.
In almost all cases we are using this keyword but inside the static area this keyword not allowed hence use object creation approach.
class Test
{ 
	Test m1()
	{ 
		System.out.println("m2 method");
		return this;
	}
	static Test m2()
	{ 
		System.out.println("m1 method");
		Test t = new Test();
		return t;
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		Test t1 = t.m1();
		System.out.println("return value="+t1);
		Test t2 = Test.m2();
		System.out.println("return value="+t2);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m2 method
return value=Test@15db9742
m1 method
return value=Test@6d06d69c
*/
Example13: method arguments & return value
class Animal 
{
}
class Dog
{
}
class Emp
{
}
class Test
{ 
	Emp m1(Animal a,Dog d,int i)
	{ 
		System.out.println("m1 method");
		System.out.println(a+" "+d+" "+i);
		Emp e = new Emp();
		return e;
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		Animal a = new Animal();
		Dog d = new Dog();
		Emp e = t.m1(a,d,10);
		System.out.println("Return value ="+e);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1 method
Animal@15db9742 Dog@6d06d69c 10
Return value =Emp@7852e922
*/
Example 14: method vs return variables
Case 1: if the application contains both instance & local variables the return value will be local.
class Test
{ 
	int a=10;
	int m1(int a)
	{ 
		System.out.println("m1() method");
		return a; //return local variable
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		int x = t.m1(100);
		System.out.println("return value="+x);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1() method
return value=100
*/
Case 2: No local variables in application the return value will be instance value.
class Test
{ 
	int a=10;
	int m1()
	{ 
		System.out.println("m1() method");
		return a; //returns instance value
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		int x = t.m1();
		System.out.println("return value="+x);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1() method
return value=10
*/
Case 3:If the application contains both local & instance variables with same name then first priority goes to local variables but to return instance value use this keyword.
class Test
{ 
	int a=10;
	int m1(int a)
	{ 
		System.out.println("m1() method");
		return this.a; //return instance variable as a return value.
	}
	public static void main(String[] args)
	{ 
		int x = new Test().m1(100);
		System.out.println("m1() return value is="+x);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m1() method
m1() return value is=10
*/
Example 15 :-
 Scanner class present in java.util package and it is introduced in 1.5 versions & it is used to take dynamic input from the keyboard.
to get int value ----> s.nextInt()
to get float value ----> s.nextFloat()
to get String value ----> s.next()
to get single line ----> s.nextLine()
to close the input stream ----> s.close()
import java.util.*;
class Test
{ 
	public static void main(String[] args)
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter emp no");
		int eno=s.nextInt();
		System.out.println("enter emp name");
		String ename=s.next();
		System.out.println("enter emp salary");
		float esal=s.nextFloat();
		System.out.println("enter emp hobbies");
		String ehobbies = s.nextLine();
		System.out.println("*****emp details*****");
		System.out.println("emp no----->"+eno);
		System.out.println("emp name---->"+ename);
		System.out.println("emp sal------>"+esal);
		System.out.println("emp hobbies------>"+ehobbies);
		s.close(); //used to close the stream
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
enter emp no
123
enter emp name
Niraj
enter emp salary
10000
enter emp hobbies
*****emp details*****
emp no----->123
emp name---->Niraj
emp sal------>10000.0
emp hobbies------>
*/
Example 16:- The \s represents whitespace.
import java.util.*;
public class Test
{ 
	public static void main(String args[])
	{ 
		String input = "7 tea 12 coffee";
		Scanner s = new Scanner(input).useDelimiter("\\s");
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		s.close();
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
7
tea
12
coffee
*/
Example-17 :-Conversion of local variables to instace variables to improve the scope of the variable.
class Test
{ 
	//instance variables
	int val1;
	int val2;
	void values(int val1,int val2) //local variables
	{ 
		System.out.println(val1);
		System.out.println(val2);
		//conversion of local to instance (passing local variables values to instance variables)
		this.val1=val1;
		this.val2=val2;
	}
	void add()
	{ 
		System.out.println(val1+val2);
	}
	void mul()
	{ 
		System.out.println(val1*val2);
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		t.values(10,20);
		t.add();
		t.mul();
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
10
20
30
200
*/
Observation :- if the instance variable names and static variable names are different we can assign directly without using this keyword.
//instance variables
int a;
int b;
void values(int val1,int val2)//local variables
{ 
	System.out.println(val1);
	System.out.println(val2);
	//conversion of local to instance (passing local variables values to instance variables)
	a=val1;
	b=val2;
}
//Example 18:- conversion of local values to instance
Case 1: Inside the method taking local value then converting local to instance
import java.util.*;
class Test
{
	int sid;
	void details()
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("enter student id");
		int sid = s.nextInt();
		this.sid=sid;
	}
	void disp()
	{ 
		System.out.println("student is="+sid);
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		t.details();
		t.disp();
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
enter student id
123
student is=123
*/
Case 2:- Directly assigning values to instance variables.
import java.util.*;
class Test
{
	int sid;
	void details()
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("enter student id");
		sid = s.nextInt();
	}
	void disp()
	{ 
		System.out.println("student is="+sid);
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		t.details();
		t.disp();
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
enter student id
12345
student is=12345
*/
Example 19:- Method recursionA method is calling itself during execution is called recursion.
case 1:- (normal output)
class RecursiveMethod
{ 
	static void recursive(int a)
	{
		System.out.println("number is :- "+a);
		if (a==0)
		{
			return;
		}

	   recursive(--a);
	}
	public static void main(String[] args)
	{ 
		RecursiveMethod.recursive(10);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java RecursiveMethod
number is :- 10
number is :- 9
number is :- 8
number is :- 7
number is :- 6
number is :- 5
number is :- 4
number is :- 3
number is :- 2
number is :- 1
number is :- 0
*/
case 2:- (StackOverFlowError)
class RecursiveMethod
{ 
	static void recursive(int a)
	{
		System.out.println("number is :- "+a);
		if (a==0)
		{
			return;
		}
		recursive(++a);
	}
	public static void main(String[] args)
	{ 
		RecursiveMethod.recursive(10);
	}
}
/*

*/
Example-20:- methods vs. All data- types
 In java numeric values are by default integer values but to represent byte, short perform typecasting.
 In java decimal values are by default double values but to represent float value use “f”constant or perform typecasting.
class Test
{ 
	void m1(byte a) { System.out.println("Byte value-->"+a); }
	void m2(short b ) { System.out.println("short value-->"+b); }
	void m3(int c) { System.out.println("int value-->"+c); }
	void m4(long d) { System.out.println("long value is-->"+d); }
	void m5(float e) { System.out.println("float value is-->"+e); }
	void m6(double f) { System.out.println("double value is-->"+f); }
	void m7(char g) { System.out.println("character value is-->"+g); }
	void m8(boolean h) { System.out.println("Boolean value is-->"+h); }
	public static void main(String[] args)
	{ 
		Test t=new Test();
		t.m1((byte)10);
		t.m2((short)20);
		t.m3(30);
		t.m4(40);
		t.m5(10.6f);
		t.m6(20.5);
		t.m7('a');
		t.m8(true);
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
Byte value-->10
short value-->20
int value-->30
long value is-->40
float value is-->10.6
double value is-->20.5
character value is-->a
Boolean value is-->true
*/
Example 21:-java method calling: one method is able to call more than one method
class Test
{ 
	void m1()
	{ 
		m2(100);
		System.out.println("m2 ");
		m2(200);
	}
	void m2(int a)
	{ 
		System.out.println("m3 ");
	}
	public static void main(String[] args)
	{ 
		Test t=new Test();
		t.m1();
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
m3
m2
m3
*/
Example 22 :- Stack Memory
 The jvm will create empty stack memory just before calling main method & jvm will destroyed empty stack memory after completion of main method.
 When JVM calls particular method then that method entry and local variables stored in stack memory&when the method completed, that particular method entry 
and local variables are destroyed from stack memory &that memorybecomes available to other methods.
class Test
{ 
	void add(int a,int b)
	{ 
		System.out.println(a+b);
	}
	void mul(int a,int b)
	{ 
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{ 
		Test t = new Test();
		t.add(5,8);
		t.mul(10,20);
	}
}
/*

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
13
30
*/
Example 23:-when we call methods recursively then JVM will generate StackOverFlowError.
class Test
{ 
	void m1()
	{ 
		System.out.println("rattaiah");
		m2();
	}
	void m2()
	{ 
		System.out.println("Sravya");
		m1();
	}
	public static void main(String[] args)
	{ 
		Test t=new Test();
		t.m1();
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                                                                                                                                                                                    //
//                                                                                                                CONSTRUCTORS (65)                                                                                                                                                  //
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////