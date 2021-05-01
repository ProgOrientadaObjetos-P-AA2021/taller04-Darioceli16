/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

/**
 *
 * @author Smart
 */
public class ejecutor {

    public static void main(String[] args) {
        
        String nom = "Dario Celi";
        double c1 = 8.5;
        double c2 = 7.2;
        double c3 = 10.0;
        Calificaciones a = new Calificaciones(nom, c1, c2,
                c3);
        a.establecerPromedio();

        System.out.printf("%s\n", a);

        String nombre = "Dario Celi";
        double ca1 = 6.5;
        double ca2 = 7.5;
        double ca3 = 7.1;
        Calificaciones a2 = new Calificaciones(nombre, ca1, ca2,
                ca3);
        a2.establecerPromedio();

        System.out.printf("%s\n", a2);
    }

}
