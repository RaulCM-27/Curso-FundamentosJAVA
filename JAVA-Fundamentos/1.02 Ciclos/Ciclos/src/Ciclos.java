
public class Ciclos {

    public static void main(String[] args) {

        Ciclos ciclos = new Ciclos();

        System.out.println("Ciclo While");
        ciclos.CicloWhile();

        System.out.println("\nCiclo Do-While");
        ciclos.CicloDoWhile();

        System.out.println("\nCiclo For");
        ciclos.CicloFor();
        
        System.out.println("\nPrimer Numero Par - Palabra Break");
        ciclos.CicloFor_Break();
        
        System.out.println("\nNumeros Pares - Palabra Continue");
        ciclos.CicloFor_Continue();
    }

    public void CicloWhile() {
        var contador = 0;
        while (contador < 3) {
            System.out.println("Contador = " + contador);
            contador++;
        }
    }

    public void CicloDoWhile() {
        var contador = 0;
        do {
            System.out.println("Contador = " + contador);
            contador++;
        } while (contador < 3);
    }

    public void CicloFor() {
        for (int contador = 0; contador < 3; contador++) {
            System.out.println("Contador = " + contador);
        }
    }

    public void CicloFor_Break() {
        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("Contador = " + contador);
                break; //break termina el ciclo al encontrar la primera condicion verdedera.
            }
        }
    }
    
    public void CicloFor_Continue() {
        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue; //Ir a la siguiente Iteracion.
            }
            System.out.println("Contador = " + contador);
        }
    }
    
}
