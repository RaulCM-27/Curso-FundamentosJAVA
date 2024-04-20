
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado + "\n");
        
        var resultado2 = Operaciones.sumar(2.0, 3.5);
        System.out.println("resultado = " + resultado2 + "\n");
        
        var resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3 + "\n");
    }
}
