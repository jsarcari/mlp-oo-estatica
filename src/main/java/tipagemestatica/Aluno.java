package main.java.tipagemestatica;

import java.util.ArrayList;

import java.text.DateFormat;

public class Aluno extends Pessoa {
    
    public enum NIVEL { INDEFINIDO, GRADUACAO, ESPECIALIZACAO, MESTRADO, DOUTORADO };

    private String matricula;
    private NIVEL nivel;

    public Aluno() {
        this.nivel = NIVEL.INDEFINIDO;
        this.matricula = "<Indefinida>";
    }

    @Override
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        resultado.append("Aluno {") 
                .append(String.format("\n\tNome: %s", this.getNome()))
                .append(String.format("\n\tNascimento: %s", DateFormat.getDateInstance(DateFormat.SHORT).format(this.getDt_nascimento())))
                .append(String.format("\n\tSexo: %s", this.getGenero()))
                .append(String.format("\n\tMatricula: %s", this.getMatricula()))
                .append(String.format("\n\tNivel: %s", this.getNivel()))
                .append("\n}");
        return resultado.toString();
    }

    public final void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public final String getMatricula() {
        return matricula;
    }

    public final void setNivel(String nivel) {
        for(NIVEL n:NIVEL.values()){
            if(nivel.equalsIgnoreCase(n.toString())){
                this.nivel = n;
                break;
            }
        }
    }

    public final void setNivel(NIVEL nivel) {
        this.nivel = nivel;
    }

    public final NIVEL getNivel() {
        return nivel;
    }

    public final ArrayList<Aluno> addAluno(ArrayList<Aluno> list, Aluno aluno) {
        list.add(aluno);
        return list;
    }
}
