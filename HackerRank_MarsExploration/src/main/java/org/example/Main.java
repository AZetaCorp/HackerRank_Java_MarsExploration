package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("La cantidad de errores en el mensaje (DDDSPSSQSSOR) son: "+marsExploration("DDDSPSSQSSOR") );
    }

    public static int marsExploration(String s) {
        int errorsCount = 0;
        int j = 0;

        for(int i = 0; i<s.length()/3; i++){
            System.out.println("Voy a analizar:" + s.charAt(j) + s.charAt(j+1) + s.charAt(j+2));
            System.out.println("Las posiciones actuales son: "+ (j) + " "+ (j+1) + " "+ (j+2) + " ");

            if( s.charAt(j) != 'S') {
                errorsCount++;
                System.out.println("Hay un error en la pos:"+j + "Donde " + s.charAt(j) + " es distinto a S" );

            }
            if( s.charAt(j+1) != 'O'){
                errorsCount++;
                System.out.println("Hay un error en la pos:"+(j+1) + "Donde " + s.charAt(j+1) + " es distinto a O" );
            }
            if( s.charAt(j+2) != 'S') {
                errorsCount++;
                System.out.println("Hay un error en la pos:"+(j+2) + "Donde " + s.charAt(j+2) + " es distinto a S" );
            }


            j+=3;
            System.out.println("Cantidad de errores actuales: "+errorsCount);
            System.out.println();System.out.println();
        }
        return errorsCount;
    }


}