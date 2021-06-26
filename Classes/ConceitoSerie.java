public class ConceitoSerie {

    //atributos.
    private String titulo;
    private String sinopse;
    private int anoLancamento;
    private AvaliacaoSerie as;

    //default
    public ConceitoSerie(){
        
    }
    //construtores
    public ConceitoSerie(String titulo, String sinopse, int anoLancamento){
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.anoLancamento = anoLancamento;
    }

    public ConceitoSerie(String titulo, String sinopse, int anoLancamento, AvaliacaoSerie as){
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.anoLancamento = anoLancamento;
        this.as = as;
    }

    //metodos de acesso
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getSinopse(){
        return sinopse;
    }

    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public AvaliacaoSerie getAs(){
        return as;
    }

    public void setAs(AvaliacaoSerie as){
        this.as = as;
    }

    public String imprimir(){
        return ("\n\nTitulo: " + titulo + "\nSinopse: " + sinopse + "\n" + anoLancamento + as.imprimir());
    }

    
}
