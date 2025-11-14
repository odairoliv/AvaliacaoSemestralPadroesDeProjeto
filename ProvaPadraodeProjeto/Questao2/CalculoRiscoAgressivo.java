public class CalculoRiscoAgressivo implements EstrategiaCalculoRisco {

    @Override
    public double calcular(PerfilCliente cliente) {
        System.out.println("[CÁLCULO] Usando modelo Agressivo:");
        double score = (cliente.getTotalInvestido() * 0.8) + (cliente.getIdade() * 0.2);
        System.out.printf(" - Score de Risco Agressivo: %.2f\n", score);
        return score;
    }
}