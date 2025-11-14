public class Main {
    public static void main(String[] args) {

        AnalisadorDeRisco analisador = new AnalisadorDeRisco();
        PerfilCliente cliente1 = new PerfilCliente(100000.0, 30);

        analisador.setEstrategia(new CalculoRiscoConservador());
        analisador.executarAnalise(cliente1);

        analisador.setEstrategia(new CalculoRiscoAgressivo());
        analisador.executarAnalise(cliente1);

        PerfilCliente cliente2 = new PerfilCliente(20000.0, 65);
        
        analisador.setEstrategia(new CalculoRiscoModerado());
        analisador.executarAnalise(cliente2);
    }
}