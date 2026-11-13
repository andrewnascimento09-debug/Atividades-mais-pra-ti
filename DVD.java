public class DVD extends ItemBiblioteca {
    private int duracaoMinutos;

    public DVD(String codigo, String titulo, int duracaoMinutos) {
        super(codigo, titulo);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public int getPrazoDias() { return 3; }

    @Override
    public double getValorMultaDiaria() { return 2.00; }
}