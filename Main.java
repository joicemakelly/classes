public class Main {

    private String nome;
    private int numeroFuncionarios;

    public Main(String nome, int numeroFuncionarios) {
        this.nome = nome;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Diva comésticos", 150);
        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());
    }
}
