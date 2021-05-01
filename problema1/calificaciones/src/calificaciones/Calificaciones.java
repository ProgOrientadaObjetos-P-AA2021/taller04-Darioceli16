package calificaciones;

public class Calificaciones {

    private String nombre;
    private double Materia1;
    private double Materia2;
    private double Materia3;
    private double promedio;

    public Calificaciones(String nom, double n1, double n2, double n3) {
        nombre = nom;
        Materia1 = n1;
        Materia2 = n2;
        Materia3 = n3;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerMateria1(double n1) {
        Materia1 = n1;
    }

    public void establecerMateria2(double n2) {
       Materia2 = n2;
    }

    public void establecerMateria3(double n3) {
        Materia3 = n3;
    }

    public void establecerPromedio() {
        promedio = (Materia1
                + Materia2 + Materia3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateria1() {
        return Materia1;
    }

    public double obtenerMateria2() {
        return Materia2;
    }

    public double obtenerMateria3() {
        return Materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nEstudiante: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n", obtenerNombre(),
                obtenerMateria1(), obtenerMateria2(),
                obtenerMateria3(), obtenerPromedio());
        return cadena;
    }
}
