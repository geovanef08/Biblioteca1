public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // padrão
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // toString
    @Override
    public String toString() {
        return "Livro{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", anoPublicacao=" + anoPublicacao +
               ", disponivel=" + disponivel +
               '}';
    }
    public class Main {
    public static void main(String[] args) {
        // Teste da classe Aluno
        Aluno aluno1 = new Aluno("João", 20, "2025001");
        System.out.println(aluno1);
        aluno1.setIdade(21);
        System.out.println("Idade atualizada: " + aluno1.getIdade());

        // Teste da classe Livro
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        System.out.println(livro1);
        livro1.setDisponivel(false);
        System.out.println("Disponibilidade atualizada: " + livro1.isDisponivel());
    }
}

}
