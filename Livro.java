public class Livro extends ItemBiblioteca {
    private String autor;
    private int edicao;

    public Livro(String codigo, String titulo, String autor, int edicao) {
        super(codigo, titulo);
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public int getPrazoDias() { return 14; }

    @Override
    public double getValorMultaDiaria() { return 0.50; }
}