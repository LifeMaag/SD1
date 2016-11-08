// Author:  Sufyan Abdur Rehman
   UOB#  15026396//
public class Lab_4_1{
	private static int staticVar=1;
	private int nonStaticVar=1;
	
	public static void staticFunction(){
	   // Accessing a static variable in a static function.
	   staticVar++;
	   System.out.println(staticVar);
	
	 //  nonStaticVar++;//  error: non-static variable nonStaticVar cannot be referenced from a static context
	 //   System.out.println(nonStaticVar++);
	}

	public void nonStaticFunction(){
	  Accessing a static variable in a nonstatic function.
	  staticVar++;
	  System.out.println(staticVar);  //  non-static method nonStaticFunction() cannot be referenced from a static context
	
	 //Accessing a nonstatic variable in a nonstatic function.
	   nonStaticVar++;
	   System.out.println(nonStaticVar++); //non-static method nonStaticFunction() cannot be referenced from a static context
	}
	
	public static void main(String[] args){
	  //Calling static and nonstatic variable from static function.
	  staticFunction();
	  //It worked well.

	  // Now caliing static and nonstatic variable in a nonstatic function.
	  nonStaticFunction(); //non-static method nonStaticFunction() cannot be referenced from a static context

	}
}