package Ej7;

public class Estudiante implements  Comparable<Estudiante> {
    String nombre;
    int altura;
    int edad;


    public Estudiante(String nombre,  int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Estudiante e) {
        int resultado = 0;
        if (this.altura < e.altura) {
            resultado = 1;
        }
        else if (this.altura > e.altura) {
            resultado = -1;
        }
        else {
            if (this.edad < e.edad) {
                resultado = 1;
            }
            else if (this.edad > e.edad) {
                resultado = -1;
            }
            else {
                resultado = 0;
            }
        }
        return resultado;
    }
}

