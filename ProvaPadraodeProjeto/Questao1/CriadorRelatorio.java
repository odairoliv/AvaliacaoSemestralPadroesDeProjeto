public abstract class CriadorRelatorio {

    public abstract Relatorio criarRelatorio();
    public void processarEGerarRelatorio() {
        Relatorio relatorio = criarRelatorio();

        System.out.println("--- Processando Lógica Comum do Criador ---");
        relatorio.gerar();
        System.out.println("--- Processamento Concluído ---");
    }
}