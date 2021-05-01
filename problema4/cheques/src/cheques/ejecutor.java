package cheques;

public class ejecutor {

    public static void main(String[] args) {

        String nombre = "Dario";
        String banco = "Banco de Loja";
        double precio = 1500;
        String cedula = "11042892157";

        Cheques c = new Cheques(nombre, banco, precio);

        c.establecerNombre(nombre);
        c.establecerBanco(banco);
        c.establecerValor(precio);
        c.establecerComision();

        System.out.printf("%s\n", c);
        
        
        String nombre1 = "Juan";
        String banco1 = "Banco de Pichincha";
        double precio1 = 1000;
        String cedula1 = "11024325862";

        Cheques c2 = new Cheques(nombre1, banco1, precio1);

        c2.establecerNombre(nombre1);
        c2.establecerBanco(banco1);
        c2.establecerValor(precio1);
        c2.establecerComision();

        System.out.printf("%s\n", c2);
    }
}
