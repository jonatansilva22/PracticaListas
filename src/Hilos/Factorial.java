package Hilos;

public class Factorial implements Runnable{
    int fact;
    public Factorial (int n){
        this.fact = n;
    }
    public void run(){
        int total;
        total = fact;
        if(fact > 0){
            for (int i = fact-1; i >= 1; i--){
                total = total * i;
            }
        }
        System.out.println(Thread.currentThread().getName() + ": " + total);
    }
}
