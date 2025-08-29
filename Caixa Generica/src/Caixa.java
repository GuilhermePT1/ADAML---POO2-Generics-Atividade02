public class Caixa<T> {
    private T objeto;

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

}
