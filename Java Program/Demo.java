class Demo {
	public static void main(String args[]) {
	int abc[]=new int[10];
	System.out.println("Size of array is "+abc.length);
	System.out.println(abc[0]);
	System.out.println(abc[9]);
	abc[0]=100;
	abc[1]=200;
	System.out.println("Value is "+abc[0]);
	System.out.println("Value is "+abc[1]);
	int  temp =1000;
	for(int i=0;i<abc.length;i++) {
		abc[i]=temp;
		temp = temp +100;
	}
	
	System.out.println("using loop display");
	
	for(int a: abc) {
		System.out.println(a);
	}
	//System.out.println(abc[10]);
	}
}