package Stack;

public class Main {
    public static void main(String[] args) {

        llamada1();
        desbordePila(5);
    }

    public static void llamada1(){
        int n1 = 1;
        String s1 = "Uno";

        llamada2();
    }

    public static void llamada2(){
        int n2 = 2;
        String s2 = "Dos";

        llamada3();
    }

    public static void llamada3(){
        int n3 = 3;
        String s3 = "Tres";

        //Muestra un error ArrayIndexOuyOfBoundsException
        /*ERROR
        * at Stack.Main.llamada3(Main.java:38)
	      at Stack.Main.llamada2(Main.java:21)
	      at Stack.Main.llamada1(Main.java:14)
	      at Stack.Main.main(Main.java:6)
        * */
        int[] numeros = {1, 2};

       for(int i = 0; i < numeros.length;i++){
            System.out.println(numeros[i+1]);
        }
    }

    //ERROR STACK OVER FLOW
    public static void desbordePila(int n){
        if(n < n+1){
            desbordePila(n*10);
        }
    }
}
