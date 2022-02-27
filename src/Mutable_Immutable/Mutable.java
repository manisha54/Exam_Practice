package Mutable_Immutable;

public class Mutable {
    private int first;
    private int second;

    //constructor
    public Mutable(int first, int second){
        this.first=first;
        this.second=second;
    }

    //Getter
    public int getFirst(){
        return this.first;
    }
    public int getSecond(){
        return this.first;
    }

    //Setter
    public void setFirst(int first){
        this.first = first;
    }
    public void setSecond(int second){
        this.first = first;
    }

    //behaviour
    public int add(){
        return this.first + this.second;
    }
}
