

public class Main {
    
    public static void main(String[] args) {
            
        //series documentais
        Documental doc = new Documental();
        doc.setTitulo("Nosso planeta");
        doc.setSinopse("A serie documental faz uma viagem por 50 paises e mostra a diversidade da natureza ao redor do mundo, dedoce o Artico, passando pelas selvas da America do sul e pelas profundezas dos oceanos, ate as paisagens Africanas.");
        doc.setTema("Natureza");
        doc.setAnoLancamento(2019);

        AvaliacaoSerie avalDoc = new AvaliacaoSerie();

        avalDoc.setNota(5);
        avalDoc.setCritica("Nenhuma critica, otimo documentario!");

        doc.setAs(avalDoc);
 //------------------------------------------------------------------       
        //series dramaticas
        Dramatica drama = new Dramatica();
        drama.setTitulo("Vis a vis");
        drama.setSinopse("Se passa nume prisao espanhola e mostra como uma garota, Macarena, que foi presa por roubar para seu amante, lida com a situacao.");
        drama.setGenero("Suspense/criminal");
        
        Temporada dramaTemp1 = new Temporada();
        Temporada dramaTemp2 = new Temporada();
        Temporada dramaTemp3 = new Temporada();
        Temporada dramaTemp4 = new Temporada();
        Temporada dramaTemp5 = new Temporada();
        
        dramaTemp1.setNumero(1);
        dramaTemp1.setQuantidadeEp(11);
        dramaTemp2.setNumero(2);
        dramaTemp2.setQuantidadeEp(13);
        dramaTemp3.setNumero(3);
        dramaTemp3.setQuantidadeEp(8);
        dramaTemp4.setNumero(4);
        dramaTemp4.setQuantidadeEp(8);
        dramaTemp5.setNumero(5);
        dramaTemp5.setQuantidadeEp(8);
        drama.setAnoLancamento(2015);
       
        AvaliacaoSerie avalDrama = new AvaliacaoSerie();
        
        avalDrama.setNota(4);
        avalDrama.setCritica("Muito bom o contexto, atrizes muito dedicadas! ");

        drama.setCt(dramaTemp1);
        drama.setCt(dramaTemp2);
        drama.setCt(dramaTemp3);
        drama.setCt(dramaTemp4);
        drama.setCt(dramaTemp5);
        drama.setAs(avalDrama);

//--------------------------------------------------------------------------------        
        System.out.printf("---------------------------------------------\n");
        System.out.printf("Serie dramatica:\n" + drama.imprimirDrama());
        System.out.printf("\n---------------------------------------------\n");
        System.out.printf("\nSerie documental:\n" + doc.imprimirDoc());
        System.out.printf("\n---------------------------------------------");

        
    }
    
}


