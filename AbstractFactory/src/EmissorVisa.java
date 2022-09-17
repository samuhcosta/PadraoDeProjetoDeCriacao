public class EmissorVisa implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando a seguinte mensagem para Visa.");
        System.out.println(mensagem);
    }
}