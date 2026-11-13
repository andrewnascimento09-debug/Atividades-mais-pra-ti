public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);

        ItemBiblioteca livro = new Livro("L001", "O peso da mochila", "Cristian Cavalheiro", 1);
        ItemBiblioteca revista = new Revista("R001", "Mais pra ti", 450);
        ItemBiblioteca dvd = new DVD("D001", "Interestelar", 169); // Testando categoria extra

        biblioteca.adicionarItem(livro);
        biblioteca.adicionarItem(revista);
        biblioteca.adicionarItem(dvd);

        biblioteca.listarAcervo();

        Usuario aluno = new Aluno("Andrew Nascimento");

        // Teste de empréstimo bem-sucedido
        biblioteca.emprestar(aluno, livro);

        // Simulando limite atingido para teste de recusa
        aluno.incrementarEmprestimo();
        aluno.incrementarEmprestimo();
        biblioteca.emprestar(aluno, revista); // Deve recusar por limite

        biblioteca.listarAcervo();
    }
}