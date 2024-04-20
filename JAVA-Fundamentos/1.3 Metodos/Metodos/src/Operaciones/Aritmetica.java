
package Operaciones;

public class Aritmetica {
    //Atributos
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor Vacio");
    }
    
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("Constructor con Argumentos");
    }
    
    //Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return a + b;
    }
    
}
