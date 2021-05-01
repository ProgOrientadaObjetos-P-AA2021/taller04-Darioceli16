package automotor;

public class Automotor {

    private String marca;
    private double valorV;
    private int año;
    private double matricula;
    private String cedula;

    public Automotor(String nom, double valor,int a, String ced) {
        marca = nom;
        valorV = valor;
        cedula = ced;
        año = a;

    }

    public void establecerMarca(String nom) {
        marca = nom;
    }

    public void establecerValorV(double valor) {
        valorV = valor;
    }

    public void establecerAño(int n) {
        año = n;
    }

    public void establecerMatricula() {
        matricula = (valorV * 0.002) * (2021-año);
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerValorV() {
        return valorV;
    }

    public double obtenerMatricula() {
        return matricula;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public int obteneraño() {
        return año;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valores del automotor\n\n"
                + "Marca: %s\n"
                + "Cedula: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerMarca(),
                obtenerCedula(),
                obteneraño(),
                obtenerValorV(),
                obtenerMatricula());
        return cadena;
    }
}
