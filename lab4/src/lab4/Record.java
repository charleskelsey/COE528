/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author charles kelsey
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.*;

public class Record {
    // Name of the associated file
    private String filename;
    private static Record instance;
    
    public Record(String n) { 
        filename = n;
    }
    
    public void setFileName(String n) {
        filename = n;
    }
    
    public String getFileName() {
        return filename;
    }
    
    public static Record getInstance() {
        if(instance == null)
            instance = new Record("record.txt");
        return instance;
    }
    
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try {
            // Write the code here
            try (BufferedReader br = new BufferedReader(new FileReader("record.txt"))) {
                String str;
                while((str = br.readLine()) != null){
                    out.println(str);
                } 
                br.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try {
            // Write the code here
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("record.txt", true))){
                bw.write(msg);
                bw.newLine();
                bw.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        Record r = Record.getInstance(); 
        
        // Do not modify the code below 
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " +
                            "contains the following lines:");
        r.read();
    }
}
