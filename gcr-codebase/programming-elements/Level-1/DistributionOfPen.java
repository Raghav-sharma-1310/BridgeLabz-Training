//Creating Class with name DistributionOfPen indicating the purpose is to divide pens equally among students.
class DistributionOfPen{
   public static void main(String args[]){
      // Declaring variables to store pens and students.
      int totalPens = 14;
      int totalStudents = 3;

      // Calculating pens per student and remaining pens using modulus operator.
      int penPerStudent = totalPens / totalStudents;
      int remainingPen = totalPens % totalStudents;

      // Displaying distribution result.
      System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
   }
}