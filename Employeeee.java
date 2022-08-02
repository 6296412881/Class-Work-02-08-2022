package Oopsdemo;

class Employe 
{
	int id;
	String name,city,country,state,designation;
	long phno,salary;
	
	final int adhaarno;
	
	// constructor chainning
	public Employe(int id,String name,String city,int adhaarno)
	 {
		this.id=id;
		this.name=name;
		this.city=city;
		this.adhaarno=adhaarno;
	 }	
	public Employe(int id,String name,String city,String country,String state,int adhaarno)
	{
		this(id,name,city,adhaarno);
		this.country=country;
		this.state=state;
		
	}
	public Employe(int id,String name,String city,String country,String state,
			   long phno,long salary,String designation,int adhaarno)
	  {
		this(id,name,city,country,state,adhaarno);
		this.phno=phno;
		this.salary=salary;
		this.designation=designation;
	  }
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", phno=" + phno + ", salary=" + salary + ", adhaarno=" + adhaarno
				+ "]";
	}
	
	
	
	
	 }
	
	

public class Employeeee {

	public static void main(String[] args) {
		
		Employe emp1=new Employe(121,"raju","kolkata",465778);
			System.out.println(emp1);
		Employe emp2=new Employe(102, "abc","kolkata", "india","wb" ,
				   56578475l, 200000, "developer",565768);	
		    System.out.println(emp2);
	}

}