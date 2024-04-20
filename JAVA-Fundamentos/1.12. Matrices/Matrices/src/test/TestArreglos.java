
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        //MODIFICAR LOS VALORES DE CADA INDICE
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        
        edades[1] = 8;
        System.out.println("edades = " + edades[1]);
        
        edades[2] = 11;
        System.out.println("edades = " + edades[2] + "\n");
        
        //CICLO FOR PARA IMPRIMIR TODOS LOS VALORES DEL ARREGLO
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades elementos " + i + ": " + edades[i]);
        }
        
        //Sintaxis resumida
        String frutas[] = {"Naranja" , "Manzana" , "Pera" };
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta = " + frutas[i]);            
        }
    }
}






















