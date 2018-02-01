class Student extends Person{
	private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
		super(firstName,lastName,id);
       this.testScores=scores;
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate()
        {
        double sum=0;
        for(int i=0;i<testScores.length;i++)
            {
            sum=sum+testScores[i];
        }
        double avg= (sum/(testScores.length));
        if(avg<=100 && avg>=90)
            return "O";
        if(avg<90 && avg>=80)
            return "E";
        if(avg<80 && avg>=70)
            return "A";
        if(avg<70 && avg>=55)
            return "P";
        if(avg<55 && avg>=40)
            return "D";
        else
            return "T";
    }
}