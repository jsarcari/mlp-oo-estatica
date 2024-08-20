package main.java.tipagemestatica;

import java.util.Date;

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
}
