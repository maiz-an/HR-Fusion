
package CLASS;

/**
 *
 * @author ROSE
 */

public class addEmployee {
    private String hrename;
    private String hreid;
    private String hredepartmentid;
    private String hreepfno;
    private String hreaddress;
    private String hregender;
    
    
    FileSystem fileSystem = new FileSystem("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\hremployees.txt");//creating a new file to store the passing values while calling the filesystem constructor
    
    //constructor
    public addEmployee(String hrename,String hreid ,String hredepartmentid,String hreaddress,String hreepfno, String hregender){
    this.hrename=hrename;
    this.hreid=hreid;
    this.hredepartmentid=hredepartmentid;
    this.hreepfno=hreepfno;
    this.hreaddress=hreaddress;
    this.hregender=hregender;
}

    //getters and setters

    public String getHrename() {
        return hrename;
    }

    public void setHrename(String hrename) {
        this.hrename = hrename;
    }

    public String getHreid() {
        return hreid;
    }

    public void setHreid(String hreid) {
        this.hreid = hreid;
    }

    public String getHredepartmentid() {
        return hredepartmentid;
    }

    public void setHredepartmentid(String hredepartmentid) {
        this.hredepartmentid = hredepartmentid;
    }

    public String getHreepfno() {
        return hreepfno;
    }

    public void setHreepfno(String hreepfno) {
        this.hreepfno = hreepfno;
    }

    public String getHreaddress() {
        return hreaddress;
    }

    public void setHreaddress(String hreaddress) {
        this.hreaddress = hreaddress;
    }

    public String getHregender() {
        return hregender;
    }

    public void setHregender(String hregender) {
        this.hregender = hregender;
    }

    public FileSystem getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
    
    
     public boolean addHREmployee() {
        
        if(!fileSystem.createA_Newfile())//createA_Newfile() will be updated along with calling the method
        {
          String record = hrename+" - "+hreid+" - "+hredepartmentid+" - "+hreepfno+" - "+hreaddress+" - "+hregender;          
          return fileSystem.writeDataToFile(record);//passing the values while calling the method to write in the file
        }

        return false;
     }
     
     
   
}
