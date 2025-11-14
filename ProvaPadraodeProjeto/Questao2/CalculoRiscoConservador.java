public class CalculoRiscoConservador implements EstrategiaCalculoRisco {

    @Override
    public double calcular(PerfilCliente cliente) {
        System.out.println("[CÁLCULO] Usando modelo Conservador:");
        double score = (cliente.getTotalInvestido() * 0.2) + (cliente.getIdade() * 0.8);
        System.out.printf(" - Score de Risco Conservador: %.2f\n", score);
        return score;
    }
}