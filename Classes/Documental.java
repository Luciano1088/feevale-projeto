public class Documental extends Serie { //herança classe serie
    private String tema;
    private AvaliacaoSerie as; //Faz associação com classe avaliação série

    //default
    public Documental(){

    }

    //construtores
    public Documental(String tema, String titulo, String sinopse, int anoLancamento){
        super(titulo, sinopse, anoLancamento);
        this.tema = tema;
    }

    public Documental(String tema, String titulo, String sinopse, int anoLancamento, AvaliacaoSerie as){
        super(titulo, sinopse, anoLancamento);
        this.tema = tema;
        this.as = as;
    }

    //metodos getters e setters
    public String getTema(){
        return tema;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    //metodo associação 
    public AvaliacaoSerie getAs(){
        return as;
    }

    public void setAs(AvaliacaoSerie as){
        this.as = as;
    }
    // metodo imprimir serie documental
    public String imprimirDoc(){
        return ("Titulo: " + getTitulo() + "\nSinopse: " + getSinopse() + "\n" + getTema() + " - " + getAnoLancamento() + as.avaliacaoDocumental());
    }
}
