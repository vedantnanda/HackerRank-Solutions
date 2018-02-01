public class Person {
    private static int age;	
  
	public Person(int initialAge) {
        if(initialAge>=0)
            Person.age=initialAge;
        else
        {age=0; Person.age=initialAge;
         System.out.println("Age is not valid, setting age to 0.");
        }
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
  		if(Person.age<13)
        System.out.println("You are young."/*Insert correct print statement here*/);
        else if(Person.age>=13 && Person.age<18)
            System.out.println("You are a teenager.");
            else
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		Person.age=Person.age+1;
	}