
package test;

import dominio.*;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", 5000, false);
        System.out.println("Nombre: " + persona1.getNombre());
        
        persona1.setNombre("Juan Carlos");
        System.out.println("Persona Nombre con Cambio: " + persona1.getNombre());
        System.out.println("Sueldo: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado = " + persona1.isEliminado());
    }
}
