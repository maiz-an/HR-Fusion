
package CLASS;

//encapsulation


public class addDepartment {//file handling regarding adding a department
    private String hrdname;
    private String hrdid;
    private String hrddescription;
    
    FileSystem fileSystem = new FileSystem("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\hrdepartment.txt");//creating a new file to store the passing values while calling the filesystem constructor
    
    //constructor
    public addDepartment(String hrdname,String hrdid,String hrddescription){
    this.hrdname=hrdname;
    this.hrdid=hrdid;
    this.hrddescription=hrddescription;
}

    //getters and setters
    public String getHrdname() {
        return hrdname;
    }

    public void setHrdname(String hrdname) {
        this.hrdname = hrdname;
    }

    public String getHrdid() {
        return hrdid;
    }

    public void setHrdid(String hrdid) {
        this.hrdid = hrdid;
    }

    public String getHrddescription() {
        return hrddescription;
    }

    public void setHrddescription(String hrddescription) {
        this.hrddescription = hrddescription;
    }

    public FileSystem getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
    
     public boolean addHRDepartment() {
        
        if(!fileSystem.createA_Newfile())//createA_Newfile() will be updated along with calling the method
        {
          String record = hrdname+" - "+hrdid+" - "+hrddescription;          
          return fileSystem.writeDataToFile(record);//passing the values while calling the method to write in the file
        }

        return false;
     }
    
}
