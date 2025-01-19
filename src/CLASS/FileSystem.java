/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASS;

/**
 *
 * @author ROSE
 */

import UI.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;


public class FileSystem {
    private String FILE_PATH,Lines="",Line;
    
    File file;
    
    
    //consructor
    public FileSystem(String filepath){//passing the filename
        //this. reffers to the current value of the given variable
        this.FILE_PATH=filepath;//will assign the passed file name to the private variable
        createA_Newfile();//calling the method
    }
    
    public boolean createA_Newfile(){
        try
        {
            file=new File(FILE_PATH);
            if(file.createNewFile())
               
            {//if the file is created the boolean value of the createANewfile will be true
                System.out.println("File created "+file.getName());
                return true;
             
            }
            else
            {//if the file is not created the boolean value of the createANewfile will be false
                System.out.println("File already exsists");
                return false; 
            }
           
        }
        catch(IOException ex)
        {
             System.out.println("something went wrong with the file"+ex);
                return false; 
        }
    }
    
    //creating the file writer method so it can be called whenever wanted in the UIclass
    public boolean writeDataToFile(String Record)//passing the record values
    {
        try
        {
          file.createNewFile();
           FileWriter fileWriter=new FileWriter(file,true);       
           BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);            
            
             bufferedWriter.write(Record);
             bufferedWriter.newLine();//adding anew line
             bufferedWriter.close();//closing the BufferedWriter
             fileWriter.close();//closing the FileWriter
             return true;
               
       
        }
        catch(IOException ex){
            System.out.println("Something went wrong with writing"+ex);
            return false;
        }
    }
    
    //creating the file reader method so it can be called whenever wanted in the UIclass
    public BufferedReader readAFile(){
        if(!createA_Newfile())
        {
           try
           {
              FileReader fileReader=new FileReader(file);
              BufferedReader bufferedReader=new BufferedReader(fileReader);
              //return bufferedReader;
               while ((Line = bufferedReader.readLine()) != null)         
         { 
          System.out.println(Line);
          Lines=Lines+Line+"\n";// "" +2 3 5+1 3 4         
         } 
         
        JOptionPane.showMessageDialog(null, Lines);
         bufferedReader.close();
         fileReader.close();     
           }
           catch(IOException ex)
           {
               System.out.println("Something went wrong with reading the file"+ ex);  
           }
        }
        return null;
    }
    
}