import java.util.Random;

public class TiposAutorizacao {
    private static int nAutoriazacoesCortesia = 0;
    private static int nAutoriazacoesConvenio = 0;
    private Random gerador = new Random();

    public boolean autorizaCortesia(){
        nAutoriazacoesCortesia++;

        if (nAutoriazacoesCortesia == 5){
            nAutoriazacoesCortesia = 0;
            return false;
        } else
            return true;
    }

    public boolean autorizaCheque(){
        return sorteio();
    }

    public boolean autorizaCartao(){
        return true;
    }
    
    public boolean autorizaConvenio(){
        nAutoriazacoesConvenio++;

        if (nAutoriazacoesConvenio == 10){
            nAutoriazacoesConvenio = 0;
            return sorteio();
        } else
            return true;
    }

    public boolean autorizaDinheiro(){
        return true; //Não entendi se sempre libera ou se a gente pode escolher
    }

    public boolean sorteio(){
        if(gerador.nextInt(2) == 0){
            return false;
        } else
            return true;
    }
}