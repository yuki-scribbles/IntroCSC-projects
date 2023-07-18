//Project objective: make a file named numbers.txt and fill it with 1000 random 
//integers between 0 and 1000. It then finds the average of the integers.

package filesproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FilesProject{
    public static void main(String[] args) throws FileNotFoundException{
        
        //Creates the file and fills it with integers.
        Random rand = new Random();
        PrintWriter out = new PrintWriter("numbers.txt");
        
        for(int i = 0; i < 1000; i++){
            out.println(rand.nextInt(1001));
        }
        out.close();
        
        //Reads file using scanner and then finds the average of the ints
        File input = new File("numbers.txt");
        double sum = 0;
        Scanner scan = new Scanner(input);
        while(scan.hasNextLine()){
            sum += Double.parseDouble(scan.nextLine());
        }
        scan.close();
        double average = sum/1000;
        
        System.out.printf("%.2f",average);
        
    }
    
}
