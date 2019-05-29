/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacomplejos;

/**
 *
 * @author FABIO
 * @version 29.5.2019
 */
public class NumComplejo {

    private double pReal;
    private double pImaginaria;

    /**
     *
     */
    public NumComplejo() {

    }

    /**
     * Constructor.
     *
     * @param pReal Parte Real
     * @param pImaginaria Parte Imaginaria.
     *
     */
    public NumComplejo(double pReal, double pImaginaria) {
        this.pReal = pReal;
        this.pImaginaria = pImaginaria;
    }

    /**
     * Getter.
     *
     * @return Parte Real.
     */
    public double getpReal() {
        return pReal;
    }

    /**
     * Setter.
     *
     * @param pReal
     * @ Parte Real.
     */
    public void setpReal(double pReal) {
        this.pReal = pReal;
    }

    /**
     * Getter.
     *
     * @return Parte Imaginaria.
     */
    public double getpImaginaria() {
        return pImaginaria;
    }

    /**
     * Setter.
     *
     * @param pImaginaria
     * @ Parte Imaginaria.
     */
    public void setpImaginaria(double pImaginaria) {
        this.pImaginaria = pImaginaria;
    }

    /**
     * Calcula la suma de dos numeros complejos.
     *
     * @param c1
     * @param c2
     * @return result.
     */
    public static NumComplejo sumarComplejos(NumComplejo c1, NumComplejo c2) {
        NumComplejo result = new NumComplejo();

        result.setpReal(c1.getpReal() + c2.getpReal());
        result.setpImaginaria(c1.getpImaginaria() + c2.getpImaginaria());

        return result;
    }

    /**
     * Calcula la resta de dos numeros complejos.
     *
     * @param c1
     * @param c2
     * @return result.
     */
    public static NumComplejo restarComplejos(NumComplejo c1, NumComplejo c2) {
        NumComplejo result = new NumComplejo();

        result.setpReal(c1.getpReal() - c2.getpReal());
        result.setpImaginaria(c1.getpImaginaria() - c2.getpImaginaria());

        return result;
    }

    /**
     * Calcula la multiplicacion de dos numeros complejos.
     *
     * @param c1
     * @param c2
     * @return result.
     */
    public static NumComplejo multiplicarComplejos(NumComplejo c1, NumComplejo c2) {
        NumComplejo result = new NumComplejo();

        double a = c1.getpReal();
        double b = c1.getpImaginaria();
        double c = c2.getpReal();
        double d = c2.getpImaginaria();

        result.setpReal((a * c) - (b * d));
        result.setpImaginaria((a * d) + (b * c));

        return result;
    }

    /**
     * Calcula la division de dos numeros complejos.
     *
     * @param c1
     * @param c2
     * @return result.
     */
    public static NumComplejo dividirComplejos(NumComplejo c1, NumComplejo c2) {
        NumComplejo result = new NumComplejo();

        double a = c1.getpReal();
        double b = c1.getpImaginaria();
        double c = c2.getpReal();
        double d = c2.getpImaginaria();

        double dividendoReal = (a * c) + (b * d);
        double dividendoImaginario = (b * c) - (a * d);
        double divisor = (Math.pow(c, 2) + Math.pow(d, 2));

        result.setpReal(dividendoReal / divisor);
        result.setpImaginaria(dividendoImaginario / divisor);

        return result;
    }

    /**
     * Calcula el modulo de un numero complejo.
     *
     * @param numComplejo
     * @return modulo.
     */
    public static double modulo(NumComplejo numComplejo) {
        double real = numComplejo.getpReal();
        double imaginaria = numComplejo.getpImaginaria();

        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginaria, 2));
    }

    @Override
    public String toString() {

        String mostrar = "";
        if (pReal != 0) {
            mostrar += pReal;
        }
        if (pImaginaria >= 0) {
            mostrar = mostrar + "+" + pImaginaria + "i";
        } else {
            mostrar = mostrar + "-" + (pImaginaria * (-1)) + "i";
        }
        return mostrar;
    }
}
