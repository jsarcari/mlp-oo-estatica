package main.java.tipagemestatica;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pessoa {
    
    public enum GENERO { INDEFINIDO, HOMEM_CIS, MULHER_CIS, NAO_BINARIO, TRANSGENERO };

    private String nome;
    private Date dt_nascimento;
    private GENERO genero;

    public Pessoa() {
        this.nome = "<Indefinido>";
        this.genero = GENERO.INDEFINIDO;
        this.dt_nascimento = new Date();
    }

    @Override
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        resultado.append("Pessoa {") 
                .append(String.format("\n\tNome: %s", this.getNome()))
                .append(String.format("\n\tNascimento: %s", DateFormat.getDateInstance(DateFormat.SHORT).format(this.dt_nascimento)))
                .append(String.format("\n\tSexo: %s", this.getGenero()))
                .append("\n}");
        return resultado.toString();
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public final String getNome() {
        return nome;
    }  

    public final void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }
    
    public final void setDt_nascimento(String dt_nascimento) throws ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        if (df.parse(dt_nascimento).after(new Date())) {
            throw new DataMaiorQueAtualException("Data de nascimento maior que a data atual");
        }
        this.setDt_nascimento(df.parse(dt_nascimento)); // converte a data digitada para um objeto date e passa para a pessoa        
    }
    
    public final void setDt_nascimento(int dd, int mm, int yyyy){
        Calendar c = Calendar.getInstance();
        c.set(yyyy, mm, dd);
        this.dt_nascimento.setTime(c.getTimeInMillis());		
    }
    
    public final Date getDt_nascimento() {
        return (Date)dt_nascimento.clone();
    }

    public final void setGenero(String genero) {        
        for(GENERO g:GENERO.values()){
            if(genero.equalsIgnoreCase(g.toString())){
                this.genero = g;
                break;
            }
        }
    }
    
    public final void setGenero(GENERO genero) {
        this.genero = genero;
    }
    
    public final GENERO getGenero() {
        return genero;
    }
}
