public class Dramatica extends Serie {
    private String genero;
    private Temporada ct; //Faz associação com classe temporada
    private AvaliacaoSerie as; //Faz associação com classe avaliação série

    public Dramatica(){

    }

    public Dramatica(String genero, String titulo, String sinopse, int anoLancamento){
        super(titulo, sinopse, anoLancamento);
        this.genero = genero;
    }

    public Dramatica(String genero, String titulo, String sinopse, int anoLancamento, AvaliacaoSerie as, Temporada ct){
        super(titulo, sinopse, anoLancamento, as);
        this.genero = genero;
        this.as =as;
        this.ct = ct;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public AvaliacaoSerie getAs(){
        return as;
    }

    public void setAs(AvaliacaoSerie as){
        this.as = as;
    }

    public Temporada getCt(){
        return ct;
    }

    public void setCt(Temporada ct){
        this.ct = ct;
    }
    //método imprimir
    public String imprimirDrama(){
        return ("Titulo: " + getTitulo() + "\nSinopse: " + getSinopse() + "\n" + getGenero() + " - " + ct.imprimirTemporada() + "\n" + getAnoLancamento() + as.avaliacaoDramatica());

    }


}
