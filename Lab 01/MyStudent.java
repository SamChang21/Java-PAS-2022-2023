public class MyStudent {
    private String FirstName;
    private String LastName;
    private double GPA;
    private int grade;
    public MyStudent(String myFirestName, String myLastName, double myGPA, int myGrade) {
        FirstName=myFirestName;
        LastName=myLastName;
        GPA=myGPA;
        grade=myGrade;
    }
    public String toString(){
        return FirstName+" "+LastName+" Grade: "+grade+" and GPA is: "+ GPA;
    }
}
