public class CalculoRiscoModerado implements EstrategiaCalculoRisco {

    @Override
    public double calcular(PerfilCliente cliente) {
        System.out.println("[CÁLCULO] Usando modelo Moderado:");
        double score = (cliente.getTotalInvestido() * 0.5) + (cliente.getIdade() * 0.5);
        System.out.printf(" - Score de Risco Moderado: %.2f\n", score);
        return score;
    }
}