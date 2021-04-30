package problema2;

public class ejecutor {

    public static void main(String[] args) {

        String nombre = "Jose";
        String apellido = "Enriquez";
        double sueldoBasico = 400.00;
        String cedula = "1150582755";

        profesores profIns = new profesores(nombre,apellido, sueldoBasico, cedula);

        profIns.establecerNombre(nombre);
        profIns.establecerApellido(apellido);
        profIns.establecerSueldoBasico(sueldoBasico);
        profIns.establecerSueldoTotal();

        System.out.println(profIns);

    }
}
