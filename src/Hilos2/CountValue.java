package Hilos2;

public class CountValue {

    protected int count = 0;

    public CountValue(){
        this.count = 0;
    }

    public CountValue(int num) {
        this.count = num;
    }

    public void add(int value){
        this.count = this.count + value;
    }

    public int get(){
        return this.count;
    }
}