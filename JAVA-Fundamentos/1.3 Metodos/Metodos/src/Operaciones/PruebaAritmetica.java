
package Operaciones;

public class PruebaAritmetica {
    
    public static void main(String[] args){
        
            Aritmetica aritmetica = new Aritmetica();
            aritmetica.a = 2;
            aritmetica.b = 4;
            aritmetica.sumar();
            
            var resultado = aritmetica.sumarConRetorno();
            System.out.println("resultado con retorno = " + resultado);
            
            resultado = aritmetica.sumarConArgumentos(4 , 8);
            System.out.println("resultado suma con argumentos = " + resultado + "\n"); 
            
    ////////////////////////////////////////////////////////////////////////////
            //Constructor vacio
            Aritmetica aritmetica1 = new Aritmetica();
            System.out.println("Aritmetica1 a = " + aritmetica1.a);
            System.out.println("Aritmetica1 b = " + aritmetica1.b);
            
            //Constructor con Argumentos
            Aritmetica aritmetica2 = new Aritmetica(4, 3);
            System.out.println("Aritmetica1 a = " + aritmetica2.a);
            System.out.println("Aritmetica1 b = " + aritmetica2.b);
    }
    
}
