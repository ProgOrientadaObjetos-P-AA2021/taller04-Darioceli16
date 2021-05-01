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
        
        
         String nombre1 = "Dario";
        String apellido1 = "Celi";
        double sueldoBasico1 = 350.00;
        String cedula1 = "1101245896";

        profesores profIns2 = new profesores(nombre1,apellido1, sueldoBasico1, cedula1);

        profIns2.establecerNombre(nombre1);
        profIns2.establecerApellido(apellido1);
        profIns2.establecerSueldoBasico(sueldoBasico1);
        profIns2.establecerSueldoTotal();

        System.out.println(profIns2);

    }
}
