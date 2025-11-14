public class PerfilCliente {
    private double totalInvestido;
    private int idade;

    public PerfilCliente(double totalInvestido, int idade) {
        this.totalInvestido = totalInvestido;
        this.idade = idade;
    }

    public double getTotalInvestido() {
        return totalInvestido;
    }

    public int getIdade() {
        return idade;
    }
}