/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacomplejos;

/**
 *
 * @author FABIO
 */
public class ProgramaComplejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /**
        * Ejemplo: ProgramaComplejos.
        *
        * @author Fabio Benitez Ramirez
        * @version 29.5.2019
        */
         
        NumComplejo num1 = new NumComplejo(2, 3);
        NumComplejo num2 = new NumComplejo(2, 1);
        NumComplejo res = new NumComplejo();

        System.out.println("Programa que opera con números complejos");
        System.out.println("========================================");

        System.out.println("Suma:");
        res = NumComplejo.sumarComplejos(num1, num2);
        System.out.println(res);

        System.out.println("Resta:");
        res = NumComplejo.restarComplejos(num1, num2);
        System.out.println(res);

        System.out.println("Multiplicación:");
        res = NumComplejo.multiplicarComplejos(num1, num2);
        System.out.println(res);

        System.out.println("División:");
        res = NumComplejo.dividirComplejos(num1, num2);
        System.out.println(res);
    }

}
