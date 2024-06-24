//Importance of core java:
1) Java is used to develop Desktop Applications such as MediaPlayer,Antivirus etc.
2) Java is Used to Develop Web Applications such as sravyajobs.com, irctc.co.in etc.
3) Java is Used to Develop Enterprise Application such as Banking applications.
4) Java is Used to Develop Mobile Applications.
5) Java is Used to Develop Embedded System.
6) Java is Used to Develop SmartCards.
7) Java is Used to Develop Robotics.
8) Java is used to Develop Games ………………………..etc.
//Parts of the java:-
As per the sun micro system standard the java language is divided into three parts.
1) J2SE/JSE(java 2 standard edition)
2) J2EE/JEE(java 2 enterprise edition)
3) J2ME/JME(java 2 micro edition)
//API(Application programming interface) :
 It contains detailed description about how to use java product.
 It is a interface between end-user & product.
//JAVA Features :-
1. Simple
 Java technology has eliminated all the difficult and confusion oriented concepts like pointers,multiple inheritance in the java language.
 Java uses c,cpp syntaxes mainly hence who knows C,CPP for that java is simple language.
2. Object Oriented
 Java is object oriented because it is representing total data of the class in the form of object.
 The languages which are support object,class,Inheritance,Polymorphism,Encapsulation,Abstraction those languages are called Object oriented.
3. Robust
Any technology good at two main areas that technology is robust technology.
a. Exception Handling
b. Memory Allocation
Java is providing predefined support to handle the exceptions.
Java provides Garbage collector to support memory management.
4. Architectural Neutral
Java applications are compiled in one Architecture/hardware (RAM, Hard Disk) and that Compiled program runs on any architecture(hardware) is called Architectural Neutral.
5. Platform Independent
 Once we develop the application by using any one operating system(windows) that application runs only on same operating system is called platform dependency.
Ex :- C,CPP
 Once we develop the application by using any one operating system(windows) that application runs on in all operating system is called platform independency.
Ex :- java
6. Portable
In Java the applications are compiled and executed in any OS(operating system) and any Architecture(hardware) hence we can say java is a portable language.
7. Secure
To provide security Java provides one component inside JVM called Security Manager. 
To provide security for the Java applications we use java.security package.
8. Dynamic
Java is dynamic language at runtime the memory is allocated.
9. Distributed
By using java it is possible to develop distributed applications by using RMI,EJB…etc
10. Multithreaded
Executing more than one thread simultaneously is called multithreading.Main advantage of multithreading is used to develop multimedia, gaming, web application.
11. High Performance
Java support features like Robust, Security, Platform Independent, Dynamic and so on then that technology is high performance.
12. Interpreted JVM mostly uses interpreter to convert byte code to machine dependentcode.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
///
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Types of java applications:-
1. Standalone applications:
 It is also known as window based applications or desktop applications.
 This type of applications must install in every machine like media player, antivirus …etc
 By using AWT & Swings we are developing these type of applications.
 This type of application does notrequired client-server architecture.
2. Web applications:
a. The applications which are executed at server side those applications are called web applications like Gmail, facebook ,yahoo…etc .
b. All applications present in internet those are called web-applications.
c. The web applications required client-server architecture.
i. Client : who sends the request.
ii. Server : it contains application & it process the app & it will generate response.
iii. Database : used to store the data.
d. To develop the web applications we are using servlets,structs,spring…etc
3. Enterprise applications:-
 It is a business application & most of the people use the term it in big business application.
 Enterprise applications are used to satisfy the needs of an organization rather than individual users. Such organizations are business, schools, government …etc
 An application designed for corporate use is called enterprise application.
 An application in distributed in nature such as banking applications.
 All j2ee &EJB is used to create enterprise application.
4. Mobile applications:-
 The applications which are design for mobile platform are called mobile applications.
 We are developing mobile applications by swing android,IOS,j2me…etc
 There are three types of mobile applications
o Web-application (gmai l ,online shopping,oracle …etc)
o Native (run on device without internet or browser)ex:phonecall,calculator,alaram,games These are install from application store& to run these apps internet not required.
o Hybrid (required internet data to launch) ex:whats up,facebook,LinkedIn…etc
These are installed form app store but to run this application internet data required.
5. Distributed applications:-
Software that executes on two or more computers in a network. In a client-server environment.Application logic is divided into components according to function.
Ex : aircraft control systems,industrial control systems,network applications…etc.

//IDE: ( Integrated development Environment )
IDE is providing very good environment to develop the application. ex : Eclipse,MyEclipse,Netbeans,JDeveloper….etc
In IDE the code is automatically generated like,
 Automatic compilation.
 Automatic package import.
 It shows all the predefined methods of classes.
 Automatically generate try catch blocks and throws (Exception handling)……..etc.
//There are two approaches to import the classes in java,
1) Import all classes of particular package.
a. Import java.lang.*;
2) Importing application required classes.
a. Import java.lang.System;
b. Import java.lang.String;
Note: - The source file is allows to declare only one public class, if we are trying to declare more than one public class then compiler generate error message.

//Compiler responsibilities:-
 compiler check the syntax errors , If the application contains syntax errors then compiler will generate error message in the form of compilation error.
 If the application does not contain syntax errors then compiler translate .java to .class file.
Note: - In java compiler generate .class files based on number of classes present in source file. If the source file contains 100 classes after compilation compiler 
generates 100 .class files
//JVM responsibilities:-
 JVM wills loads corresponding .class file byte code into memory.
 After loading .class file JVM calls main method to start the execution process.
//Note points:-
 compiler is a translator it is translating .java file to .classwhereas JVM is also a translator it is translating .class file to machine code.
 Compiler understandable file format is .java file but JVM understandable file format is.class file.
 It is possible to compile multiple files at a time but it is possible to execute one .class file at a time.
 The .java file contains high level language but .class file contains byte code instructions it is a platform independent code.
 Java is a platform independent language but JVM is platform dependent.
javac A.java one file is compiled(A.java)
javac B.java C.java two files are compiled
javac *.java all files are compiled
//In java the decimal values are by default double values hence to represent float value use f
constant or perform type casting.
float f =10.5f; //using f constant (valid)
float f =(float)10.5; //using type casting (valid)
//String :-
 String is not a data type & it is a class present in java.lang package to represent group of characters or character array enclosed with in double quotes.
 The default value of the String is null
 For any class type the default value Is null.
String ename="ratan";
System.out.println(ename);
String s;
System.out.println(s); //null