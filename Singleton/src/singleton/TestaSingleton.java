package singleton;

public class TestaSingleton {
    public static void main(String[] args) {
        Configuracao configuracao = Configuracao.getInstance();
        System.err.println(configuracao.getPropriedade("time-zone"));
        System.err.println(configuracao.getPropriedade("currency-code"));
    }
}
