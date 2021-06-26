public class Documental extends Serie {
    private String tema;
    private AvaliacaoSerie as; //Faz associação com classe avaliação série

    public Documental(){

    }

    public Documental(String tema, String titulo, String sinopse, int anoLancamento){
        super(titulo, sinopse, anoLancamento);
        this.tema = tema;
    }

    public Documental(String tema, String titulo, String sinopse, int anoLancamento, AvaliacaoSerie as){
        super(titulo, sinopse, anoLancamento);
        this.tema = tema;
        this.as = as;
    }

    public String getTema(){
        return tema;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public AvaliacaoSerie getAs(){
        return as;
    }

    public void setAs(AvaliacaoSerie as){
        this.as = as;
    }
    // metodo imprimir 
    public String imprimirDoc(){
        return ("Titulo:" + getTitulo() + "\nSinopse:" + getSinopse() + "\n" + getTema() + "-" + getAnoLancamento() + as.avaliacaoDocumental());
    }
}
