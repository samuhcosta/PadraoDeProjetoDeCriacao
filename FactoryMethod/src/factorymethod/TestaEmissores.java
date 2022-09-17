package factorymethod;

public class TestaEmissores {
    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();
        
        //SMS
        Emissor emissor1 = new EmissorSMS();
        emissor1.envia("K19 Treinamentos");
        
        //EMAIL
        Emissor emissor2 = new EmissorEmail();
        emissor2.envia("K19 Treinamentos");
        
        //JMS
        Emissor emissor3 = new EmissorJMS();
        emissor3.envia("K19 Treinamentos");
    }
}
