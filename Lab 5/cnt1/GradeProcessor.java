import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeProcessor {

    public static void main(String[] args) {
        
        // Input and Output file names
        String inputFileName = "student_data.txt";
        String outputFileName = "grade_report.txt";

        // TODO 1: Wrap your code in a try-catch block.
        // The catch block should handle 'FileNotFoundException'.
        try
        {
            File inputFile = new File(inputFileName);
            
            // TODO 2: Create a File object and a Scanner to read the input file.
            Scanner scanner = new Scanner(inputFile);
            // TODO 3: Create a PrintWriter object to write to the output file.
            PrinterWriter writer = new PrintWriter(outputFileName);
            System.out.println("Processing file...");
            
            // Write the header to the output file separated by tab characters (\t);
            // Print a dashed line ("--------------------");
            writer.println("Name\tAverage\tStatus");
            writer.println("-----------------------");
            // TODO 4: Create a while loop to process the file line by line.
            //   - Read the name (String)
            //   - Read the three scores (int or double)
            //   - Calculate the average
            //   - Determine "Pass" or "Fail" (Pass is >= 70.0)
            //   - Write the formatted line to the output file
            while (scanner.hasNext()) 
            {
                String name = scanner.next();
                double score1 = scanner.nextDouble();
                double score2 = scanner.nextDouble();
                double score3 = scanner.nextDouble();
                
                double average = (score1 + score2 + score3) / 3;
                
                String status;
                if(average >= 70) 
                {
                    status = "pass";
                }
                else
                {
                    status = "fail";
                }
                
                writer.println(name + "\t" + average + "t" + status);
            }
            // TODO 5: Close both the Scanner and the PrintWriter.
            scanner.close();
            writer.close();
        }
            System.out.println("Done! Check " + outputFileName + " for results.");

        // TODO 6: catch block:
                    catch (FileNotFoundException e)
        {
            System.out.println("Error: Input file 'student_data.txt' was not found.");
        }
    }
    }  
}