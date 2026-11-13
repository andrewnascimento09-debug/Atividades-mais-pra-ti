public abstract class ItemBiblioteca {
    protected String codigo;
    protected String titulo;
    protected boolean disponivel;

    public ItemBiblioteca(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public boolean isDisponivel() { return disponivel; }

    // Métodos abstratos (prazo e multa variam por tipo de item)
    public abstract int getPrazoDias();
    public abstract double getValorMultaDiaria();

    public static void main(String[] args) {
        Main.main(args);
    }
}