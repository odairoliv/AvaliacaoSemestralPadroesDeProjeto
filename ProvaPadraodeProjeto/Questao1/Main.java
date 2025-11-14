public class Main {

    public static void main(String[] args) {
        CriadorRelatorio fabricaDiaria = new CriadorRelatorioDiario();

        System.out.println("Solicitação do Núcleo: Gerar Relatório Diário");
        fabricaDiaria.processarEGerarRelatorio();

        System.out.println("\n===========================================\n");

        CriadorRelatorio fabricaSemanal = new CriadorRelatorioSemanal();

        System.out.println("Solicitação do Núcleo: Gerar Relatório Semanal");
        fabricaSemanal.processarEGerarRelatorio();
    }
}