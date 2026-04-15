public class StatsCalculator {

    public static void main(String[] args) {
        // 1. Initialize the 2D array with the sample data (you may copy and paste it from sample_data.txt)
        double[][] scores;

        // 2. Call methods
        System.out.println("--- GradeBook Statistics ---\n");
        calculateStudentAverages(scores);
        System.out.println();
        calculateAssignmentAverages(scores);
        System.out.println();
        findHighestScore(scores);
    }

    // TODO: Implement this method
    public static void calculateStudentAverages(double[][] data) {
        System.out.println("Student Averages:");
        // Your logic here (Row-major traversal)
    }

    // TODO: Implement this method
    public static void calculateAssignmentAverages(double[][] data) {
        System.out.println("Assignment Averages:");
        // Your logic here (Column-major traversal)
    }

    // TODO: Implement this method
    public static void findHighestScore(double[][] data) {
         // Your logic here
    }
  
    
}