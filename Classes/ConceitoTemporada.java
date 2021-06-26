public class ConceitoTemporada {

    private int numero;
    private int quantidadeEp;

    //default
    public ConceitoTemporada(){

    }
    
    //construtor
    public ConceitoTemporada(int numero, int quantidadeEp){
        this.numero = 0;
        this.quantidadeEp = 0;
    }

    //metodos
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero + numero;
    }

    public int getQuantidadeEp(){
        return quantidadeEp;
    }

    public void setQuantidadeEp(int quantidadeEp){
        this.quantidadeEp = quantidadeEp + quantidadeEp;
    }

    public String imprimir(){
        return ("Temporada: " + numero + " Quantidade de episodios: " + quantidadeEp);
    }
}
