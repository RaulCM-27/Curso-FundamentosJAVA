package sentecias.de.control;

public class SentenciasDeControl {

    public static void main(String[] args) {
        SentenciasDeControl sentencia = new SentenciasDeControl();

        System.out.println("SENTENCIA IF-ELSE");
        sentencia.if_Else();
        
        System.out.println("\nSENTENCIA SWITCH");
        sentencia.Switch();

    }

    public void if_Else() {
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion Verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }

        ///////////////////////////////////////////////////
        var numero = 14;
        var numeroTexto = "Numero Desconocido";

        if (numero == 1) {
            numeroTexto = "Numero Uno";
        } 
        
        else if (numero == 2) {
            numeroTexto = "Numero Dos";
        }

        else if (numero == 3) {
            numeroTexto = "Numero Tres";
        }
        
        else if (numero == 4) {
            numeroTexto = "Numero Cuatro";
        }
        
        else {
            numeroTexto = "Numero no Encontrado";
        }
             
        System.out.println("NumeroTexto = " + numeroTexto);
    }

    //////////////////////////////////////////////////////
    public void Switch(){
        var mes = 13;
        var estacion = "Estacon Desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
                
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
                
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }
        System.out.println("estacion = " + estacion);       
    }
}


























