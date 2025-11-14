public class RelatorioSemanal implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando Relatório Semanal...");
        System.out.println("[SEMANAL] Conectando ao Data Warehouse.");
        System.out.println("[SEMANAL] Agregando métricas de performance da semana.");
        System.out.println("[SEMANAL] Formato: PDF consolidado.");
    }
}