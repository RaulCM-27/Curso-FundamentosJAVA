
package domain;

//la clase final Persona evita que se creen subclases
public final class Persona {
    public final static int MI_CONSTANTE = 1;
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Las clases hijas no van a poder modificar el comportamiento
    public final void imprimir(){ 
        System.out.println("Metodo Imprimir");
    }
}
