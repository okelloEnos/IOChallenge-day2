/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iochallenge;

/**
 *
 * @author okello
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        String input = ReadWrite.readTextFile("C:\\Users\\okello\\Desktop\\Input.txt");
        System.out.println(input);
        String header="MMUST STUDENT INFORMATION";
        
        
        ReadWrite.WriteToTextFile("C:\\Users\\okello\\Desktop\\MyOutputFile.txt", input);
        
        System.out.println(ReadWrite.readTextFile("C:\\Users\\okello\\Desktop\\MyOutputFile.txt"));
        
        ReadWrite.readTextFileByLines("C:\\Users\\okello\\Desktop\\Input.txt");
        
        Path path = Paths.get("C:\\Users\\okello\\Desktop\\Input.txt");
        
        System.out.println("Your File is Ready...");
    }
    
}
