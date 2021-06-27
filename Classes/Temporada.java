public class Temporada {

    private int numero;
    private int quantidadeEp;

    //default
    public Temporada(){

    }
    
    //construtor
    public Temporada(int numero, int quantidadeEp){
        this.numero = numero;
        this.quantidadeEp = quantidadeEp;
    }

    //metodos getters e setters
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
         this.numero = numero;  
    }

    public int getQuantidadeEp(){
        return quantidadeEp;
    }

    public void setQuantidadeEp(int quantidadeEp){
        this.quantidadeEp = quantidadeEp;
    }

    //impressão serie dramatica
    public String imprimirTemporada(){
        return ("Temporadas: " + numero);
    }

}
