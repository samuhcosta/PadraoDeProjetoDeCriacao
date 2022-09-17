package factorymethod;

public class EmissorEmail implements Emissor {
    @Override
    public void envia(String message){
        System.out.println("Enviando por EMAIL a mensagem: ");
        System.out.println(message);
    }
}
