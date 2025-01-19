
package CLASS;

/**
 *
 * @author ROSE
 */

import UI.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class showEmployee extends readingFiles {
    
    public void showHRemployee(){
         FileSystem fileSystem = new FileSystem("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\hremployees.txt");//creating a new file to store the passing values while calling the filesystem constructor
         if(!fileSystem.createA_Newfile())//createA_Newfile() will be updated along with calling the method
        {
          fileSystem.readAFile();
        }
    }
    
   
    public void showADMINemployee(){
         FileSystem fileSystem = new FileSystem("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\adminHR.txt");//creating a new file to store the passing values while calling the filesystem constructor
          if(!fileSystem.createA_Newfile())//createA_Newfile() will be updated along with calling the method
        {
          fileSystem.readAFile();
        }
    }
    
    
    public void showDepartment(){
        FileSystem fileSystem = new FileSystem("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\hrdepartment.txt");//creating a new file to store the passing values while calling the filesystem constructor
        if(!fileSystem.createA_Newfile())//createA_Newfile() will be updated along with calling the method
        {
          fileSystem.readAFile();
        }
    }
    
    
    public void writetohrE(){
         try {
            File file =new File("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\hremployees.txt");//creating afile using file object
            
             if(file.exists()){//checking whther the file exsist
            System.out.println("the file exsists");
        }
        else{
            System.out.println("the file doesnt exsist");
         
            FileWriter writer=new FileWriter(file,true);
            writer.write("NAME - ID - DEPARTMENT_ID - EPF_NO - ADDRESS - GENDER\n-------------------------------------------------------\n\n");//writing to the file
            writer.close();//closing the writer
          }  
        } catch (IOException ex) {
            System.err.println("something went wrong");
        }
    }
    
   
    public void writrtohrD(){
        try {
            File file =new File("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\hrdepartment.txt");//creating afile using file object
            
             if(file.exists()){//checking whther the file exsist
            System.out.println("the file exsists");
        }
        else{
            System.out.println("the file doesnt exsist");
         
            FileWriter writer=new FileWriter(file,true);
            writer.write("NAME - ID - DESCRIPTION\n-----------------------------------------------\n\n");//writing to the file
            writer.close();//closing the writer
             }
            
        } catch (IOException ex) {
            System.err.println("something went wrong");
        }
    }
    
    
    public void writetoadminHR(){
         try {
            File file =new File("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\adminHR.txt");//creating afile using file object
            
             if(file.exists()){//checking whther the file exsist
            System.out.println("the file exsists");
        }
        else{
            System.out.println("the file doesnt exsist");
         
            FileWriter writer=new FileWriter(file,true);
            writer.write("ID - NAME - GENDER - USERNAME - PASSWORD\n-----------------------------------------------\n\n");//writing to the file
            writer.close();//closing the writer
          }  
        } catch (IOException ex) {
            System.err.println("something went wrong");
        }
    }
    }

