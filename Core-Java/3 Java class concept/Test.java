class Emp
{ 
	static int eid;
	static
	{ 
		eid=111;
	}
	static void disp()
	{ 
		System.out.println(eid);
	}
	public static void main(String[] args)
	{ 
		Emp.disp();
	}
}
/*
C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>javac Test.java

C:\Users\HP\Desktop\Learn New Technologies\Learn-New-Technologies\Core-Java\3 Java class concept>java Test
static block-1
static block-2
instance block
0-arg cons
instance block
1-arg cons
*/