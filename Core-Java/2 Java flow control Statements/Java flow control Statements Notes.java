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
By using iteration statements we are able to execute group of statements repeatedly or more
number of times.
1) For
2) For-each
3) while
4) do-while 
Flow of execution in for loop:-
class Test 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5;i++)
		{ 
					System.out.println("Ratan");
		}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
Ratan
Ratan
Ratan
Ratan
Ratan
*/
Case 2: Inside the for loop initialization part is optional but semicolon is mandatory.
int i=0;
for (;i<10;i++)
{ 
	System.out.println("durga");
}
Case 3 : Initialization part it is possible to take n number of System.out.println(“ratna”) statements and each and every statement is separated by comma(,) .
int i=0;
for (System.out.println("Aruna"),System.out.println("Ratan");i<10;i++)
{ 
	System.out.println("anu");
}
Case 4 : Initialization part it is not possible to declare the data type two times whether it is same type or different types. But it is possible to declare the single 
data type with more than one variable.
Invalid
for (int i=0,int j=0 ;i<10;i++)
{ 
	System.out.println("ratan");
}
Valid
for (int i=0,j=0;i<10;i++)
{ 
	System.out.println("ratan");
}

//Conditional part :
Case 1: Inside for loop conditional part is optional, if we are not providing condition at the time
of compilation compiler will generate true constant.
for (int i=0;;i++)
{ 
	System.out.println("ratan");
}
Case 2: error : Unreachable statement
 If the control unable to enter in particular area is called unreachable statement.
 We will get the unreachable code when we declare only Boolean constants(true,false).
 When we will give true condition the remaining code is unreachable when we will give false condition the body is unreachable.
class Test 
{
	public static void main(String[] args) 
	{
		for (int i=1;true;i++) 
		{
		System.out.println("ratan");
		}
		System.out.println("rest of the code");
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java
controlstatement.java:9: error: unreachable statement
                System.out.println("rest of the code");
                ^
1 error
*/
for (int i=1;false;i++)
{ 
	System.out.println("ratan");
}
System.out.println("rest of the code");

Case 3 :- Valid
 When you provide the condition even though that condition is represent infinite loop compiler is unable to find unreachable statements,
because there may be chance of condition fail.
 When you provide Boolean constants as a condition then compiler is identifying unreachable statement because compiler knows that condition never change.
for (int i=1;i>0;i++ )
{ 
	System.out.println("durga");
}
System.out.println("rest of the app");
Case 4: method calling return Boolean condition.
class Test
{ 
	static boolean m1()
	{ 
		return true;
	}
public static void main(String[] args)
{ 
	for (i=0 ;Test.m1();i++ )
	{ 
		System.out.println("durga");
	}
}
}

//increment/decrement :-
case 1 : Inside the for loop increment/decrement part is optional.
for (int i=0;i<10;)
{ 
	System.out.println("durga");
    i++;
}
Case 2 : In the increment/decrement it is possible to take the n number of SOP() statements and
each and every statement is separated by comma(,).
for (int i=0;i<10;System.out.println("aruna"),System.out.println("sravya"))
{ 
	System.out.println("sravya");
    i++;
}
Case 3 : Inside the for loop each and every part is optional but semicolon is mandatory.
for(;; ) represent infinite loop because the condition is always true.
Case 4: error : unreachable statement
for ( ; ; )
{ 
	System.out.println("ratan");
}
System.out.println("anu"); //error: unreachable statement

For-each loop:-(introduced in 1.5 version)
class Test 
{
	public static void main(String[] args) 
	{
		int[] a={10,20};
		System.out.println(a[0]);
		System.out.println(a[1]);
		//printing data by using for-loop
		for (int i=0;i<a.length;i++)
		{ 
			System.out.println(a[i]);
		}
		//printing data by using for-each loop
		for (int aa: a)
		{ 
			System.out.println(aa);
		}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
10
20
10
20
10
20
*/
for loop vs for-each loop :-
 For loop is used to print the data & it is possible to apply conditions.
 For-each loop is used to print the data from starting element to ending element it is not possible to apply the conditions.
//While loop:- 
while (Boolean-expression) //condition must be Boolean & mandatory.
{ 
	body;
}
class Test 
{
	public static void main(String[] args) 
	{
		int i=0;
		while (i<10)
		{ 
			System.out.println("ratan");
		    i++;
		}
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
ratan
ratan
ratan
ratan
ratan
ratan
ratan
ratan
ratan
ratan
*/
Case 3: 
while (true)
{ 
	System.out.println("ratan");
}
System.out.println("anu"); //error: unreachable statement
Case 4 : Just to check the data & print the data use while loop.
while (itr.hasNext())
{ 
	System.out.println(itr.next());
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
class Test 
{
	public static void main(String[] args) 
	{
		String[] array = {"Niraj", "Sonu"};
        ArrayList<String> itr = new ArrayList<>(Arrays.asList(array));
        Iterator<String> iterator = itr.iterator();

        while (iterator.hasNext()) 
			{
                     System.out.println(iterator.next());
           }
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
Niraj
Sonu
*/

//for loop vs while loop :-
 To print the data from specific value to specific value with increment value use for loop.
 Just to check the data & print the data use while loop.
//Do-While:-
 If we want to execute the loop body at least one time them we should go for do-while statement.
 In do-while first body will be executed then only condition will be checked.
Syntax:- 
do
{ 
	//body of loop
} while(Boolean-condition);
Case 1:
class Test
public static void main(String[] args)
{ 
	int i=0;
		do
		{ 
			System.out.println("ratan");
		i++;
		}while (i<10);
}
}
Case 2:- 
int i=0;
class Test 
{
	public static void main(String[] args) 
	{
		do
		{ 
			System.out.println("durga");
		}while (false);
		System.out.println("durgasoft");
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>javac controlstatement.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\2 Java flow control Statements>java Test
durga
durgasoft
*/
//Transfer statements:- (jump statements)
By using transfer statements we are able to transfer the flow of execution from one position to another position.
 Break
 continue
 return
 try
 goto
//break:- 
Break is used to stop the execution. And is possible touse the break statement only two areas.
 Inside the switch statement.
 Inside the loops.
Case 1 : break is used to stop the execution come out of loop.
class Test
{ 
public static void main(String[] args)
{ 
	for (int i=0;i<10;i++)
	{ 
			if (i==5)
			break;
			System.out.println(i);
	}
}
}
Case 2: if we are using break outside switch or loops the compiler will raise compilation error //“break outside switch or loop”
if (true)
{ 
	    System.out.println("ratan");
		break;
		System.out.println("nandu");
}

//Continue: it is used skip the current iteration and it is continue the rest of the iterations normally.
class Test
{ 
	public static void main(String[] args)
{ 
		for (int i=0;i<10;i++)
		{ 
		if (i==5)
		continue;
		System.out.println(i);
		}
}
}