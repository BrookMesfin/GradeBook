// Fig. 3.10: GradeBook.java
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName; // instrucotr name for this GradeBook

   // constructor initializes courseName with String supplied as argument
   
   public GradeBook( String cName, String iName )
   {
      courseName = cName; // initializes courseName
      instructorName = iName;
   } 

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } 

   public void setInstructorName( String name )
   {
      instructorName = name; // store the course name
   } 

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } 

   public String getInstructorName()
   {
      return instructorName;
   } 
   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
       System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
       System.out.printf( "This course is presented by: %s!", 
         getInstructorName()+"\n" );
   } 

} // end class GradeBook
