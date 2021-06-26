public class AvaliacaoSerie {

    //atributos
    private int nota;
    private String critica;
    
   
    //default
    public AvaliacaoSerie(){

    }

    public AvaliacaoSerie(int nota, String critica){
        this.nota = nota;
        this.critica = critica;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        if(nota <0 || nota > 5){
            System.out.println("Erro! Nota invalida!");
        }else{
            this.nota = nota; 
        }
        
    }

    public String getCritica(){
        return critica;
    }

    public void setCritica(String critica){
        this.critica = critica;
    }

    public String imprimir(){
        return ("-Nota: " + nota + "\nCritica:\n" + critica);
    }

    public String imprimir2(){
        return ("\nCritica:\n" + critica + "\nNota:" + nota);
    }

}
