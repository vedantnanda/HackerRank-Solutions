public class Person {
    private int age;	
    
  
	public Person(int initialAge) {
        if(initialAge<0)
        {
            System.out.println("Age is not valid, setting age to 0.");
        age=0;
        }
        else
            {
            age=initialAge;
        }
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
       
        if(age<13)
            {
           System.out.println(/*Insert correct print statement here*/"You are young.");
        }
        else if(age>=13 && age<18)
        {// Write code determining if this person's age is old and print the correct statement:
        System.out.println(/*Insert correct print statement here*/"You are a teenager.");
        }
            else if(age>=18)
                {
            System.out.println(/*Insert correct print statement here*/"You are old.");
        }
	}

	public void yearPasses() {
         age=age+1;
  		// Increment this person's age.
	}