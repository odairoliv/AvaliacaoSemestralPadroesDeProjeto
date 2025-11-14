public class RelatorioDiario implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Diário...");
        System.out.println("[DIÁRIO] Conectando à fonte de dados operacional.");
        System.out.println("[DIÁRIO] Priorizando métricas de entrega em tempo real.");
        System.out.println("[DIÁRIO] Formato: Dashboard Web.");
    }
}