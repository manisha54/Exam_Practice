package Association;

public class Address {
    private String country;
    private int wardno;

    //constructor
    Address(String country, int wardno){
        this.country =country;
        this.wardno=wardno;
    }

    //getter
    public String getCountry(){
        return this.country;
    }

    public String getWardno(){
        return this.country;
    }
    //setter
    public void setCountry(){
        this.country =country;
    }
    public void setWardno(){
        this.wardno =wardno;
    }
}
