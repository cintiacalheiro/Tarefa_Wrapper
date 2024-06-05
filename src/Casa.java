import java.net.spi.InetAddressResolver;

/**
 * @author cintia
 */

public class Casa {

    private int numero;
    private String cor;

    public Casa(int numero, String cor) {
        this.numero = numero;
        this.cor = cor;
    }

    public int getNumero() {
        return numero;
    }

    public String getCor() {
        return cor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void converteNumeroParaWrapper(){
        Integer num = numero;
        System.out.println("Numero convertido para Wrapper: " + num);
    }

}
