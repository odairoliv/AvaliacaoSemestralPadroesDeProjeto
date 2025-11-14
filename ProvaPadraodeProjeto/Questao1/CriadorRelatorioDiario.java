public class CriadorRelatorioDiario extends CriadorRelatorio {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}