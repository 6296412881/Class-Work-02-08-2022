package Oopsdemo;

public class blankFinalStaticVar {
	static final int data;
	
	static {
		data=45;
	}
	int cube(final int n)
	{
		//n=n+1;// The final local variable n cannot be assigned.it must be blank and not using the compound assigment
		return n*n*n;
	}

	public static void main(String[] args) {
		System.out.println(blankFinalStaticVar.data);

	}

}
