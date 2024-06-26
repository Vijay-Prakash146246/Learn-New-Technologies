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
m3
m2
m3
*/