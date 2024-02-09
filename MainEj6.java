package Ej6;

import Ej7.Estudiante;

import java.util.Arrays;

public class MainEj6 {
    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo(8,4);
        Rectangulo r2=new Rectangulo(8,3);
        Rectangulo r3=new Rectangulo(10,5);
        Rectangulo[] arrayRectangulo={r1,r2,r3};
        System.out.println("Rectángulos ordenados de mayor a menor área:");
        Arrays.sort(arrayRectangulo);
        for (Rectangulo rectangulo: arrayRectangulo){
            System.out.println(rectangulo.toString());
        }
    }
}
