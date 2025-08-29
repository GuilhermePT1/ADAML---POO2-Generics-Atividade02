public class RepositorioDeProdutos implements Repositorio<Produto> {

    @Override
    public void salvar(Produto produto) {
        System.out.println("Salvando produto: " + produto.getNome() + " com preço: R$" + produto.getPreco());
    }
}