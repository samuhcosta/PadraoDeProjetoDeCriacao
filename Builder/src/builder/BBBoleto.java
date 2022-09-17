package builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BBBoleto implements Boleto{
    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;
    
    public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero){
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
        this.vencimento = vencimento;
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String getSacado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCedente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Calendar getVencimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNossoNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Boleto BB");
        stringBuilder.append("\n");
        
        stringBuilder.append("Sacado: " + this.sacado);
        stringBuilder.append("\n");
        
        stringBuilder.append("Cedente: " + this.cedente);
        stringBuilder.append("\n");
        
        stringBuilder.append("Valor: " + this.valor);
        stringBuilder.append("\n");
        
        stringBuilder.append("Vencimento: " + this.vencimento);
        stringBuilder.append("\n");
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(this.vencimento.getTime());
        stringBuilder.append("Vencimento" + format);
        stringBuilder.append("\n");
        
        stringBuilder.append("Nosso número: " + this.nossoNumero);
        stringBuilder.append("\n");
                
                
        return stringBuilder.toString();
    }
    
}
