public class Test{
	public static void main (String [] args){
	Employees employee1= new Employees();
	Employees employee2= new Employees();
	Employees employee3= new Employees();
	
	//Sttr for Employes
	employee1.setFirstName("sufyan");
	employee1.setLastName("AB");
	employee1.setNumber(123);
	employee1.setId(1);

	employee2.setFirstName("waleed");
	employee2.setLastName("ABa");
	employee2.setNumber(1234);
	employee2.setId(2);

	employee3.setFirstName("Nazim");
	employee3.setLastName("nazeer");
	employee3.setNumber(443);
	employee3.setId(3);

	//Getter for employess instances
	employee1.getFirstName();
	employee1.getLastName();
	employee1.getNumber();
	employee1.getId();

	employee2.getFirstName();
	employee2.getLastName();
	employee2.getNumber();
	employee2.getId();

	employee3.getFirstName();
	employee3.getLastName();
	employee3.getNumber();
	employee3.getId();
	
	}
}
