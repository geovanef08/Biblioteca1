public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               ", matricula='" + matricula + '\'' +
               '}';
    }
    public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 20, "2025001");
        System.out.println(aluno1);

        aluno1.setIdade(21);
        System.out.println("Idade atualizada: " + aluno1.getIdade());
    }
}

}
