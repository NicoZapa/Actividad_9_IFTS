package Param_JVM;

public class Main {
    public static void main(String[] args) {

        desbordePila(10);

    }

    //ERROR STACK OVER FLOW
    public static void desbordePila(int n){
        if(n < n+1){
            desbordePila(n*10);
        }

    }
}
