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
    	//M�todo para el C�lculo de C�digo//

        this.forma=(int)(this.aleatorio.nextDouble() * this.alfa.length()-1+0);

        //Definimos la cantidad m�xima de n�meros aleatorios (99) y sumamos 100 para mantener 3 n�meros cada vez//

        this.numero=(int)(this.aleatorio.nextDouble() * 99+100);

        return this.cadena=this.cadena+this.alfa.charAt(forma)+this.numero;
    }
}
