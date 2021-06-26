public class AppColecaoSerie {

    public static void main(String[] args) {

        SerieDocumental sd = new SerieDocumental();
        AvaliacaoSerie sdas = new AvaliacaoSerie();
        sd.setTitulo("Nosso planeta");
        sd.setSinopse("A serie documental faz uma viagem por 50 paises e mostra a diversidade da natureza ao redor do mundo, desde o Artico, passando pelas selvas da America do sul e pelas profundezas dos oceanos, ate as paisagens Africanas.");
        sd.setTema("Natureza");
        sd.setAnoLancamento(2019);
        sdas.setNota(5);
        sdas.setCritica("Nenhuma critica, otimo documentario!");

        sd.setAs(sdas);

        SerieDramatica sdr = new SerieDramatica();
        ConceitoTemporada sdrc1 = new ConceitoTemporada();
        ConceitoTemporada sdrc2 = new ConceitoTemporada();
        ConceitoTemporada sdrc3 = new ConceitoTemporada();
        ConceitoTemporada sdrc4 = new ConceitoTemporada();
        ConceitoTemporada sdrc5 = new ConceitoTemporada();
        AvaliacaoSerie sdras = new AvaliacaoSerie();
        sdr.setTitulo("Vis a vis");
        sdr.setSinopse("Se passa nume prisao espanhola e mostra como uma garota, Macarena, que foi presa por roubar para seu amante, lida com a situacao.");
        sdr.setGenero("Suspense/criminal");
        sdrc1.setNumero(1);
        sdrc1.setQuantidadeEp(11);
        sdrc2.setNumero(1);
        sdrc2.setQuantidadeEp(13);
        sdrc3.setNumero(1);
        sdrc3.setQuantidadeEp(8);
        sdrc4.setNumero(1);
        sdrc4.setQuantidadeEp(8);
        sdrc5.setNumero(1);
        sdrc5.setQuantidadeEp(8);
        sdr.setAnoLancamento(2015);
        sdras.setNota(4);
        sdras.setCritica("Muito bom o contexto, atrizes muito dedicadas! ");

        sdr.setCt(sdrc1);
        sdr.setCt(sdrc2);
        sdr.setCt(sdrc3);
        sdr.setCt(sdrc4);
        sdr.setCt(sdrc5);
        sdr.setAs(sdras);

        System.out.printf("Serie dramatica:\n" + sdr.imprimir());
        System.out.printf("\n\nSerie documental:\n" + sd.imprimir());
        
    }
    
}
