package Red;
import java.util.Random;
public class GeneradorCodigos {

	Random aleatorio = new Random();

    String alfa = "ABCDEFGHIJKLMNOPQRSTVWXYZ";

    String cadena = "";    //Inicializamos la Variable//

    int numero;

    int forma;
    
    public String getCode()
    {
    	//Método para el Cálculo de Código//

        this.forma=(int)(this.aleatorio.nextDouble() * this.alfa.length()-1+0);

        //Definimos la cantidad máxima de números aleatorios (99) y sumamos 100 para mantener 3 números cada vez//

        this.numero=(int)(this.aleatorio.nextDouble() * 99+100);

        return this.cadena=this.cadena+this.alfa.charAt(forma)+this.numero;
    }
}
