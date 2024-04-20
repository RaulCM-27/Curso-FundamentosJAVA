
public class caja {
    int ancho;
    int alto;
    int profundida;
    
    public caja(){
        
    }
    
    public caja(int a, int h, int p){
        this.ancho = a;
        this.alto = h;
        this.profundida = p;
    }
    
    public int calcularVolumen(){
        return (ancho * alto * profundida);
    }
    
    public int VolumenConlArgumento(int a, int h, int p){
        ancho = a;
        alto = h;
        profundida = p;
        return calcularVolumen();
    }
    
    public void mostrarVolumen(){
        System.out.println("El Volumen de la Caja es: " + calcularVolumen());
    }
}
