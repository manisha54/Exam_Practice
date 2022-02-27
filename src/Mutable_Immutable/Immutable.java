package Mutable_Immutable;

public class Immutable {
    private int first;
    private int second;

    //constructor
    public Immutable(int first, int second){
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
    //behaviour
    public int add(){
        return this.first + this.second;
    }

}
