package Heap;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Tres variables con tres objetos distintos
        Obj1 var1 = new Obj1();
        Obj2 var2 = new Obj2();
        Obj3 var3 = new Obj3();

        //Tras variables que apuntan al mismo objeto
        Obj1 mismo1 = new Obj1();
        Obj1 mismo2 = new Obj1();
        Obj1 mismo3 = new Obj1();

        //Una variable que tiene tres objetos distintos sucesivos
        Object[] suce1 = {new Abuelo(), new Padre(), new Hijo()};

        //Objeto que sera recolectado por el GC
        Basura basu = new Basura();

        //Mil objetos que no seran colectados por el GC
        LinkedList<MilObj> Obj_List= new LinkedList<MilObj>();

        for(int i = 0; i < 1000; i++){
            MilObj obj1 = new MilObj(i);
            Obj_List.add(obj1);
        }

        //Eliminacion manualmente
        LinkedList<MilObj> Obj_List2= new LinkedList<MilObj>();

        for(int j = 0; j < 1000; j++){
            MilObj obj2 = new MilObj(j);
            Obj_List.add(obj2);
        }
        System.gc();

        //Un codigo sin fin: OutOfMemoryError
        while(true){
            int n=0;
            MilObj obj3 = new MilObj(10+n);
            MilObj obj4 = new MilObj(n+10);
            MilObj obj5 = new MilObj(n+100);
            MilObj obj6 = new MilObj(n*10);
            MilObj obj7 = new MilObj(n*20);
            MilObj obj8 = new MilObj(n+200);
            MilObj obj9 = new MilObj(430+n);
            MilObj obj10 = new MilObj(n+231);
            MilObj obj11 = new MilObj(n+643);
            Obj_List.add(obj3);
            Obj_List.add(obj4);
            Obj_List.add(obj5);
            Obj_List.add(obj6);
            Obj_List.add(obj7);
            Obj_List.add(obj8);
            Obj_List.add(obj9);
            Obj_List.add(obj10);
            Obj_List.add(obj11);
            n++;
            //Permite que nunca se rompa
            System.gc();
        }

    }


}
