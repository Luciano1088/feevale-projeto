public class SerieDramatica extends ConceitoSerie {
    private String genero;
    private ConceitoTemporada ct;
    private AvaliacaoSerie as;

    public SerieDramatica(){

    }

    public SerieDramatica(String genero, String titulo, String sinopse, int anoLancamento){
        super(titulo, sinopse, anoLancamento);
        this.genero = genero;
    }

    public SerieDramatica(String genero, String titulo, String sinopse, int anoLancamento, AvaliacaoSerie as, ConceitoTemporada ct){
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

    public ConceitoTemporada getCt(){
        return ct;
    }

    public void setCt(ConceitoTemporada ct){
        this.ct = ct;
    }

    public String imprimir(){
        return ("Titulo: " + getTitulo() + "\nSinopse: " + getSinopse() + "\n" + getGenero() + " - " + ct.imprimir() + "\n" + getAnoLancamento() + as.imprimir());

    }


}
