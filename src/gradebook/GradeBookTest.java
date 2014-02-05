// Solution: GradeBookTest.java
// GradeBook constructor used to specify the course name at the 
// time each GradeBook object is created.

public class GradeBookTest
{
   // main method begins program execution
   public static void main( String args[] )
   { 
      // create GradeBook object and initialize data
      GradeBook gradeBook = new GradeBook( "ENG CS 60 JAVA Programming", "Judy Jones" ); 
      
      System.out.printf("==GradeBook contructor is called!!==\n"+
              "Welcome to the grade book for\n"+gradeBook.getCourseName()+"!\n"+
              "This course is presented by: %s",gradeBook.getInstructorName()+"\n"+
              "== End of GradeBook constructor.==\n");
     

    // display change instructor name
      System.out.printf( "\nChanging instructor name from %s to Sonny Huang\n", gradeBook.getInstructorName());
    // call setInstructorName function to set a new name.
      gradeBook.setInstructorName( "Sonny Huang" ); 

    //display change course name
      System.out.printf( "Changing course name from %s to CISP401 Object Oriented Programming with JAVA\n\n", gradeBook.getCourseName());
     // call setCourseName function to set a new name.
      gradeBook.setCourseName( "CISP401 Object Oriented Programming with JAVA" ); 

      gradeBook.displayMessage(); // display welcome message
   } // end main

} // end class GradeBookTest

 