package zoopark;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Nemoc{
   
    public void FileDataReader(String filePath){
    try{
     FileReader fileReader = new FileReader(filePath);
     //FileWriter fileWriter = new FileWriter(filePath, true);
     
     BufferedReader bufferedreader = new BufferedReader(fileReader);
     
     String Line;
     while((Line = bufferedreader.readLine()) !=null){
         System.out.println(Line);
     }
     bufferedreader.close();
    
    
    } catch (IOException e){
        e.printStackTrace(); 
    }
    
}
    
    public void FileDataWriter (String filepath){
        
    try{
        FileWriter fileWriter = new FileWriter(filepath, true);
        BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
      
        String newContent = Process.PridejNemocneneZvire();
        bufferedWriter.write(newContent);
       
        
       bufferedWriter.close();
        System.out.println("Congratulation!");
    } catch (IOException e){
       e.printStackTrace();
    }
    }
    }
