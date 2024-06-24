//Java flow control Statements
There are three types of flow control statements in java :-
a. Selection Statements
b. Iteration statements
c. Transfer statements
*****************************************************
1. Selection Statements
a. If
b. If-else
c. Switch
d. else-if 

class Test 
{
	public static void main(String[] args) 
	{
		int age =20;
		if(age>21)
		{
			System.out.println("If condition is true");
		}
		else
		{
					System.out.println("If condition is false");
		}
	}
}
/*C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
If condition is false
*/

class Test 
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("Boolean if condition is true");
		}
		else
		{
					System.out.println("If condition is false");
		}
	}
}
/*C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
Boolean if condition is true
*/
class Test 
{
	public static void main(String[] args) 
	{
		if(0)
		{
			System.out.println("0 is consider as false");
		}
		else
		{
					System.out.println("If condition is false");
		}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java
controlstatement.java:5: error: incompatible types: int cannot be converted to boolean
                if(0)
                   ^
1 error
*/
class Test 
{
	public static void main(String[] args) 
	{
		if(a=10)
		{
			System.out.println("a=10 consider as boolean");
		}
		else
		{
					System.out.println("If condition is false");
		}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java
controlstatement.java:5: error: cannot find symbol
                if(a=10)
                   ^
  symbol:   variable a
  location: class Test
1 error
*/

//Note : In java semicolon is empty statement
//Switch statement:-
 Switch statement is used to declare multiple options.
 Switch is taking the argument, the allowed arguments are byte,short,int,char (primitive data types) Byte, Short,Integer,Character(wrapper calsses) enum(1.5 v) String(1.7 v)
 Inside the switch it is possible to declare more than one case but it is possible to declare only one default.
 Based on the provided argument the matched case will be executed if the cases are not matched default will be executed.
 Float,double,long is not allowed as a switch argument because these are having too large values.
class Test 
{
	public static void main(String[] args) 
	{
		int a=20 ;
		switch(a)
		{
			case 10:
				System.out.println("Value of a = "+a);
			break;
			case 20:
				System.out.println("Value of a = "+a);
			break;
			default:
				System.out.println("Value of a = "+a);
		}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
Value of a = 20
*/

Case 2 : Inside the switch statement beak is optional. If we are not declaring break statement then from the matched case onwards up to the next break statement will be executed, 
if there is no break statement then end of the switch will be executed. This situation is called as fall though inside the switch.
Case 3 : inside the switch the default is optional.
Case 4: Inside the switch cases are optional part.
Case 5:- inside the switch both cases and default optional.
Case 6: Invalid : Inside the switch independent statements are not allowed. If we are declaring the
statements that statement must be inside the case or default.
int x=10;
switch(x)
{ System.out.println("Hello World");
}
Case 7 :In switch it is possible to declare the default at starting or middle or end of the switch.
int a=100;
switch (a)
{ 
default: System.out.println("default");
case 10:System.out.println("10");
}
Case 8: Inside the switch the case labels must be unique; if we are declaring duplicate case labels the
compiler will raise compilation error “duplicate case label”.
int a=10;
switch (a)
{ 
case 10:System.out.println("ratan");
case 10:System.out.println("anushka");
}
Case 9 :Inside the switch for the case labels & switch argument it is possible to provide expressions
int a=100;
switch (a+10)
{ 
case 110 :System.out.println("ratan");
case 10*5 :System.out.println("durga");
}
Case 10 : The advantage of fall through is used to executed common actions for multiple cases.
int a=2;
switch (a)
{ case 1:
case 2:
case 3:System.out.println("Q-1"); break;
case 4:
case 5:
case 6:System.out.println("Q-2"); break;
}
Case 11: Invalid : Inside the switch the case label must be constant values. If we are declaring variables
as a case labels the compiler will show error “constant expression required”.
int a=10,b=20;
switch (a)
{ 
case a:System.out.println("anushka");
case b:System.out.println("nazriya");
}
Case 12 : Valid
 It is possible to declare final variables as a case label. Because the final variables are constants.
 The final variables are replaced with constants during compilation.
final int a=10;
switch (a)
{ 
	case a:System.out.println("anushka");
}
Case 13:
 inside the switch the case label must match with provided argument data type otherwise
compiler will raise compilation error “incompatible types”.
 In below example we are passing String is a switch argument hence the case labels must be
Strings constants.
String str=”aaa”;
switch (str)
{ 
case "aaa" :System.out.println("ratan");
case 'a' :System.out.println("durga");
}
Case 14 :
 Inside switch the case labels must be within the range of provided argument data type otherwise compiler will raise compilation error “possible loss of precision”.
 In below example we are passing byte as a switch argument hence the case labels must be within the range of byte.
byte b=127;
switch (b)
{ 
case 127:System.out.println("ratan");
case 128:System.out.println("anu");
}
Case 15 :internal conversion for unicode. Unicode values a-97 A-65
Case 1 : int i=65;
switch (i)
{ 
	case 'A':System.out.println("ratan");
}
Case 2 : char ch='d';
switch (ch)
{ 
	case 100:System.out.println("durga");
}

//else-if:-
class Test 
{
	public static void main(String[] args) 
	{
		int a=20;
if (a==10)
{ System.out.println("ten");
}
else if (a==20)
{ System.out.println("twenty");
}
else if (a==30)
{ System.out.println("thirty");
}
else
{ System.out.println("default condition");
}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
twenty

*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///                                           Iteration Statements
///
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////