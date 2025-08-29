
public class Main {

    public static void main(String[] args) {

        Caixa<String> caixas = new Caixa<>();
        caixas.guardar("Caixa Salva");
        System.out.println("Caixa de String: " + caixas.getObjeto());

        Caixa<Integer> caixas2 = new Caixa<>();
        caixas2.guardar(123);
        System.out.println("Caixa de Integer: " + caixas2.getObjeto());
    }
}