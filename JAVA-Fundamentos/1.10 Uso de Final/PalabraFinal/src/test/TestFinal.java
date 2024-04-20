
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        
        final int miVariable = 10; //final en VARIABLES evita cambiar el valor que almacena la variable
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
        
        //no podemos crear otra refenrencia de un nuevo objeto
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); 
        persona1.setNombre("Juan");
        System.out.println("Persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("Persona1 nombre = " + persona1.getNombre());
    }
}
