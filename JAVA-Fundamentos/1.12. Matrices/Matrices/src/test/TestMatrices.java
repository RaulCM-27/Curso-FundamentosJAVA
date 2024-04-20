package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 4;
        edades[1][1] = 8;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1] + "\n");

        for (int renglon = 0; renglon < edades.length; renglon++) {
            for (int columnas = 0; columnas < edades[renglon].length; columnas++) {
                System.out.println("edades " + renglon + "-" + columnas + ": " + edades[renglon][columnas]);
            }

        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Naranja", "Pera"}};
        imprimir(frutas);
        
        //MARTIZ DE OBJETOS
        Persona persona[][] = new Persona[2][3];
        persona [0][0] = new Persona("Juan");
        persona [0][1] = new Persona("Pedro");
        persona [0][2] = new Persona("Karla");
        persona [1][0] = new Persona("Jose");
        persona [1][1] = new Persona("Pepe");
        persona [1][2] = new Persona("Maria");
        imprimir(persona);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int renglon = 0; renglon < matriz.length; renglon++) {
            for (int columnas = 0; columnas < matriz[renglon].length; columnas++) {
                System.out.println("matriz " + renglon + "-" + columnas + ": " + matriz[renglon][columnas]);
            }

        }
    }
}
