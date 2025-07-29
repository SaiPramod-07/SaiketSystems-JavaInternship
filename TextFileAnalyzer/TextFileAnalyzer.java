package SaiKetSystems_Internship.TextFileAnalyzer;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
public class TextFileAnalyzer {
    public static void main(String[] args) {
        File myfile=new File("D:\\Desktop\\FileHandling\\test.txt");
        int wordsCount=0;
        int characters=0;
        int noOfLines=0;
        StringBuilder allText=new StringBuilder();
        int selectedWordCount=0;
        try
        {
            Scanner input=new Scanner(myfile);
            while (input.hasNextLine())
            {
                String line=input.nextLine();
                noOfLines+=1;
                characters+=line.length();
                if(!line.trim().isEmpty())
                {
                    String[] words=line.trim().split("\\s+");
                    wordsCount+=words.length;
                }
                allText.append(line).append(" ");
            }
            System.out.println("===File Analyzer===");
            System.out.println("No of lines in file:"+noOfLines);
            System.out.println("No of words in file:"+wordsCount);
            System.out.println("No of characters in file:"+characters);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter word to count:");
            String searchWord=sc.next();
            String[] words=allText.toString().split("\\s+");
            for(String word:words)
            {
                if(word.equalsIgnoreCase(searchWord))
                {
                    selectedWordCount+=1;
                }
            }
            System.out.println("Occurrence of '"+searchWord+"' words in file:"+selectedWordCount);
            input.close();
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error"+e.getMessage());
        }
    }
}
