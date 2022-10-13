package Hilos2;

public class SynchronizatedCount {

    protected int count = 0;

    public SynchronizatedCount(){
        this.count = 0;
    }

    public SynchronizatedCount(int num){
        this.count = num;
    }

    public synchronized void add(int valor){
        this.count = this.count + valor;
    }

    public int get(){
        return this.count;
    }
}
