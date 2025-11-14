public class AnalisadorDeRisco {
    private EstrategiaCalculoRisco estrategia;

    public void setEstrategia(EstrategiaCalculoRisco estrategia) {
        System.out.println("\n[SISTEMA] Trocando a estratégia de cálculo...");
        this.estrategia = estrategia;
    }

    public void executarAnalise(PerfilCliente cliente) {
        if (estrategia == null) {
            System.out.println("Erro: Nenhuma estratégia de cálculo foi definida.");
            return;
        }
        
        System.out.println("Iniciando análise com o perfil do cliente...");
        
        double scoreFinal = estrategia.calcular(cliente);
        System.out.println("Análise concluída. Score final: " + scoreFinal);
    }
}