package Oopsdemo;
import java.util.Scanner;

class Bankk
{

	final int wheel=2;
	String bikename;
	public Bankk(String bikename) {
		super();
		this.bikename = bikename;
	}
	
}

class Userr extends Bankk
{

	String userName;
	String lincenseNo;
	public Userr(String bikename) {
		super(bikename);
		// TODO Auto-generated constructor stub
	}
	
	public void setUserDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username:");
		userName=sc.nextLine();
		System.out.println("enter lincenseNo:");
		lincenseNo=sc.nextLine();
		
	}
	
	public void display() {
		System.out.println(super.bikename+" is assigned to "+ this.userName);
        System.out.println("bike details: "+ super.wheel+ "wheeler");
	}

}
public class ClassWork {

	public static void main(String[] args) {
	Userr user=new Userr("KTM");
	user.setUserDetails();
	user.display();

	}

}

