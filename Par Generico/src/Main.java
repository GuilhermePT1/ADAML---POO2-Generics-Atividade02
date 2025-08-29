
public class Main {

    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Idade", 30);
        System.out.println("Chave: " + par1.getChave() + ", Valor: " + par1.getValor());

        Par<String, String> par2 = new Par<>("Nome", "João");
        System.out.println("Chave: " + par2.getChave() + ", Valor: " + par2.getValor());
    }
}