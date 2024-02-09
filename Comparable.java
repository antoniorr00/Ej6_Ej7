package Ej6;

class Rectangulo implements Comparable<Rectangulo>{
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

        public double getAncho() {
            return ancho;
        }

        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public double getAlto() {
            return alto;
        }

        public void setAlto(double alto) {
            this.alto = alto;
        }

        public double getArea() {
            return ancho*alto*0.5;
        }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
    @Override
    public int compareTo(Rectangulo r) {
            int resultado=0;
            if (this.getArea()<r.getArea()){
                resultado=-1;
            }
            else if (this.getArea()>r.getArea()){
                resultado=1;
            }
            else {
                resultado=0;
            }
            return resultado;
        }
}




