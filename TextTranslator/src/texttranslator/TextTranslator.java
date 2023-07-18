package texttranslator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TextTranslator {
    public static HashMap <String, String> acroMap = new HashMap<>();
    
    public static void translate(String words[]){
        for(String word: words){
            String test = word.replaceAll("\\p{Punct}", "");
            String punctuation = word.replaceAll("[a-zA-Z0-9]","");

            if(acroMap.get(test.toUpperCase()) != null){
                System.out.print(acroMap.get(test.toUpperCase()) + punctuation + " ");
            } else{
                System.out.print(word + " ");
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException{
       
    //Creates a File object to hold acronyms.txt file and puts it into scanner to process text
    //txt contains key and value to convert acronyms into text
    File input = new File("acronyms.txt");
    Scanner scan = new Scanner(input);
    
    //Scans txt file to put key and value into a hashmap
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        String[] split = line.split("\\t");
        acroMap.put(split[0], split[1]);
    }
    scan.close();
    
    //Gets user input and converts it into full text
    Scanner in = new Scanner(System.in).useDelimiter("\\n");
    String userInput = in.next();
    String[]words = userInput.split("\\s+");
    in.close();
    
    translate(words);
    }
}
