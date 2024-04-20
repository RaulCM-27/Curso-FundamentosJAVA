
public class pruebaCaja {

    public static void main(String[] args) {
        caja c = new caja();
        c.ancho = 3;
        c.alto = 2;
        c.profundida = 6;
        c.mostrarVolumen();
        
        var resultado = c.VolumenConlArgumento(2, 2, 6);
        System.out.println("Volume con Argumento = " + resultado);

    }
    
}
