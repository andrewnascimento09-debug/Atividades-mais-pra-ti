public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String codigo, String titulo, int edicao) {
        super(codigo, titulo);
        this.edicao = edicao;
    }

    @Override
    public int getPrazoDias() { return 7; }

    @Override
    public double getValorMultaDiaria() { return 1.00; }
}