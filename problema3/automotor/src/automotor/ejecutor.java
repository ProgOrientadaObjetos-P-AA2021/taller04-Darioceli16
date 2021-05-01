/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotor;

/**
 *
 * @author Smart
 */
public class ejecutor {

    public static void main(String[] args) {

        String marca = "Hyunday";
        int año = 2000;
        double precio = 15000;
        String cedula = "1150582755";

        Automotor a = new Automotor(marca, precio, año, cedula);

        a.establecerMarca(marca);
        a.establecerAño(año);
        a.establecerValorV(precio);
        a.establecerCedula(cedula);
        a.establecerMatricula();

        System.out.printf("%s\n", a);

        
        
        String marca1 = "Chevrolet";
        int año1 = 2004;
        double precio1 = 12500;
        String cedula1 = "11025242525";

        Automotor a2 = new Automotor(marca1, precio1, año1, cedula1);

        a2.establecerMarca(marca1);
        a2.establecerAño(año1);
        a2.establecerValorV(precio1);
        a2.establecerCedula(cedula1);
        a2.establecerMatricula();

        System.out.printf("%s\n", a2);
    }
}
