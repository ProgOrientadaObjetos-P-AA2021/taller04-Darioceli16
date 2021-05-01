package cheques;

public class Cheques {

    private String nombre;
    private String banco;
    private double valorC;
    private double comision;

    public Cheques(String nom, String ban, double bas) {
        nombre = nom;
        banco = ban;
        valorC = bas;

    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerBanco(String ban) {
        banco = ban;
    }

    public void establecerValor(double bas) {
        valorC = bas;
    }

    public void establecerComision() {
        comision = (valorC * 0.003);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValor() {
        return valorC;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cheques Banco De Loja\n\n"
                + "Nombre: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del banco: %.2f\n",
                obtenerNombre(),
                obtenerBanco(),
                obtenerValor(),
                obtenerComision());
        return cadena;
    }

}
