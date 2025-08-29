public class Main {

    public static void main(String[] args) {

        System.out.println("- Repositório de Alunos -");
        Repositorio<String> Aluno = new RepositorioDeAlunos();
        Aluno.salvar("Guilherme");
        Aluno.salvar("Ana");

        System.out.println("- Repositório de Produtos -");
        Repositorio<Produto> Produtos = new RepositorioDeProdutos();
        Produto produto1 = new Produto("Macbook", 13000.00);
        Produto produto2 = new Produto("Iphone", 7000.00);
        Produtos.salvar(produto1);
        Produtos.salvar(produto2);
    }
}