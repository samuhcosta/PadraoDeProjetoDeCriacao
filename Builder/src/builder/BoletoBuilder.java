package builder;

import java.util.Calendar;

public interface BoletoBuilder{
    void buildSacado(String sacado);
    void buildCedente(String Cedente);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildNossoNumero(int nossoNumero);

    public Boleto getBoleto();
}
