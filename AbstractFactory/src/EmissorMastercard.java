public class EmissorMastercard implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando a seguinte mensagem para Mastercard.");
        System.out.println(mensagem);
    }
}