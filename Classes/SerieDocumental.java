public class SerieDocumental extends ConceitoSerie {
    private String tema;
    private AvaliacaoSerie as;

    public SerieDocumental(){

    }

    public SerieDocumental(String tema, String titulo, String sinopse, int anoLancamento){
        super(titulo, sinopse, anoLancamento);
        this.tema = tema;
    }

    public SerieDocumental(String tema, String titulo, String sinopse, int anoLancamento, AvaliacaoSerie as){
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

    public String imprimir(){
        return ("Titulo:" + getTitulo() + "\nSinopse:" + getSinopse() + "\n" + getTema() + "-" + getAnoLancamento() + as.imprimir2());
    }
}
