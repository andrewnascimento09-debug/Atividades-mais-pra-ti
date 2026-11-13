public class Biblioteca {
    private ItemBiblioteca[] acervo;
    private int totalItens;

    public Biblioteca(int capacidade) {
        acervo = new ItemBiblioteca[capacidade];
        totalItens = 0;
    }

    public boolean adicionarItem(ItemBiblioteca item) {
        if (totalItens < acervo.length) {
            acervo[totalItens++] = item;
            return true;
        }
        return false;
    }

    public void emprestar(Usuario usuario, ItemBiblioteca item) {
        if (!item.isDisponivel()) {
            System.out.println("❌ Empréstimo recusado: O item '" + item.getTitulo() + "' já está emprestado.");
            return;
        }
        if (usuario.getQuantidadeEmprestada() >= usuario.getLimiteItens()) {
            System.out.println("❌ Empréstimo recusado para " + usuario.getNome() + ": Limite de " + usuario.getLimiteItens() + " itens atingido.");
            return;
        }

        item.disponivel = false;
        usuario.incrementarEmprestimo();
        System.out.println("✅ Empréstimo bem-sucedido: '" + item.getTitulo() + "' para " + usuario.getNome());
    }

    public void devolver(Usuario usuario, ItemBiblioteca item) {
        item.disponivel = true;
        usuario.decrementarEmprestimo();
        System.out.println("🔄 Devolução realizada para o item: '" + item.getTitulo() + "'");
    }

    // Percorre o array em um único laço, sem nenhum if verificando o tipo (Polimorfismo puro)
    public void listarAcervo() {
        System.out.println("\n--- ACERVO DA BIBLIOTECA ---");
        for (int i = 0; i < totalItens; i++) {
            ItemBiblioteca item = acervo[i];
            String status = item.isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println("- [" + item.getCodigo() + "] " + item.getTitulo() + " | Status: " + status + " | Prazo: " + item.getPrazoDias() + " dias | Multa/dia: R$ " + item.getValorMultaDiaria());
        }
        System.out.println("---------------------------\n");
    }
}