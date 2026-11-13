public abstract class Usuario {
    protected String nome;
    protected int quantidadeEmprestada;

    public Usuario(String nome) {
        this.nome = nome;
        this.quantidadeEmprestada = 0;
    }

    public String getNome() { return nome; }
    public int getQuantidadeEmprestada() { return quantidadeEmprestada; }

    public void incrementarEmprestimo() { this.quantidadeEmprestada++; }
    public void decrementarEmprestimo() { if (this.quantidadeEmprestada > 0) this.quantidadeEmprestada--; }

    public abstract int getLimiteItens();
}