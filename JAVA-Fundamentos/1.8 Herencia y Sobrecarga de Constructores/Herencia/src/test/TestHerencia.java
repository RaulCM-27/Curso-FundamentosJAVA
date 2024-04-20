
package test;

import domain.*;
import java.util.Date;

public class TestHerencia {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1 + "\n");
        
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Juan", 'M', 28, "Saturno 15" );
        System.out.println("cliente1 = " + cliente1);
    }
}
