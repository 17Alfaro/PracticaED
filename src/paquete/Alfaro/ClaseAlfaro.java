/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.Alfaro;

/**
 *
 * @author alfar
 */
public class ClaseAlfaro {
    
    private int edad;
    private String nombre;
    private String fechaNac;
    
    public ClaseAlfaro(int edad, String nombre, String fechaNac)
    {
        this.edad = edad;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public void muestraSaludo()
    {
        System.out.println("Hola, bienvenido al programa " + nombre);
    }
    
    public void muestraDespedida()
    {
        System.out.println("Hasta la próxima " + nombre);
    }
    
    public void calculaLaSuma (int num1, int num2)
    {
        int suma = num1 + num2;
        System.out.println("El resultado es = " + suma);
    }
    
    public void calculaDivision (int num1, int num2)
    {
        int division = num1/num2;
        System.out.println("El resultado es = " + division);
    }
    
    public void calculaMultiplicacion (int num1, int num2)
    {
        int multiplicacion = num1*num2;
        System.out.println("El resultado es = " + multiplicacion);
    }
    
}
