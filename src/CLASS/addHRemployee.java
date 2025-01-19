
package CLASS;

/**
 *
 * @author ROSE
 */

public class addHRemployee {
    private String ahrid;
    private String ahrname;
    private String ahrgender;
    private String ahrusername;
    private String ahrpassword;    

    FileSystem fileSystem = new FileSystem("C:\\Users\\ROSE\\OneDrive\\Desktop\\New folder\\adminHR.txt");//creating a new file to store the passing values while calling the filesystem constructor
    
    //constructor
    public addHRemployee(String ahrid,String ahrname,String ahrgender,String ahrusername,String ahrpassword){
        this.ahrid=ahrid;
        this.ahrname=ahrname;
        this.ahrgender=ahrgender;
        this.ahrusername=ahrusername;
        this.ahrpassword=ahrpassword;
          
        
        
    }
//getters and setter
    public String getAhrid() {
        return ahrid;
    }

    public void setAhrid(String ahrid) {
        this.ahrid = ahrid;
    }

    public String getAhrname() {
        return ahrname;
    }

    public void setAhrname(String ahrname) {
        this.ahrname = ahrname;
    }

    public String getAhrgender() {
        return ahrgender;
    }

    public void setAhrgender(String ahrgender) {
        this.ahrgender = ahrgender;
    }

    public String getAhrusername() {
        return ahrusername;
    }

    public void setAhrusername(String ahrusername) {
        this.ahrusername = ahrusername;
    }

    public String getAhrpassword() {
        return ahrpassword;
    }

    public void setAhrpassword(String ahrpassword) {
        this.ahrpassword = ahrpassword;
    }

    public FileSystem getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
    
     public boolean addadminHR() {
        
        if(!fileSystem.createA_Newfile())//createA_Newfile() will be updated along with calling the method
        {
          String record = ahrid+" - "+ahrname+" - "+ahrgender+" - "+ahrusername+" - "+ahrpassword;          
          return fileSystem.writeDataToFile(record);//passing the values while calling the method to write in the file
        }

        return false;
     }
}
