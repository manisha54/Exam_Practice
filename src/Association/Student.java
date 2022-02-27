package Association;

public class Student {
    String fullname;
    String id;

    //constructor
    Student(String fullname, String id){
        this.fullname =fullname;
        this.id=id;
    }

    // getter
    public String getFullname(){
        return this.fullname;
    }
    public String getId(){
        return this.id;
    }

    //setter
    public void setFullname(){
        this.fullname=fullname;
    }
    public void setId(){
        this.id=id;
    }

}
