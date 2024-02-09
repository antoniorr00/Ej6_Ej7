package Ej7;

import java.util.Arrays;

public class MainEj7 {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("Patri", 170,12);
        Estudiante e2=new Estudiante("Manuel", 173,43);
        Estudiante e3=new Estudiante("Javier",189,72);
        Estudiante e4=new Estudiante("Alicia",168,52);
        Estudiante e5=new Estudiante("Alberto", 189,35);
        Estudiante[] arrayEstudiante={e1,e2,e3,e4,e5};
        System.out.println("Estudiantes sin ordenar:");
        for (Estudiante value: arrayEstudiante){
            System.out.println(value.toString());
        }
        System.out.println();
        System.out.println("Estudiantes ordenados:");
        Arrays.sort(arrayEstudiante);
        for (Estudiante estudiante:arrayEstudiante){
            System.out.println(estudiante.toString());
        }
    }
}
