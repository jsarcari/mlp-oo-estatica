package main.java.tipagemestatica;

import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Action {

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void limparActionPerformed(java.awt.event.ActionEvent evt, ArrayList<JTextField> listField, JLabel mensagemLabel) {
        for (JTextField field : listField) {
            field.setText("");
        }
        mensagemLabel.setText("");
    }

    public void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt, ArrayList<JTextField> listField, JLabel mensagemJLabel) {
        Aluno aluno = new Aluno();
        try {
            aluno.setNome(listField.get(0).getText());
            aluno.setDt_nascimento(listField.get(2).getText());
            aluno.setGenero(listField.get(1).getText());
            aluno.setMatricula(listField.get(3).getText());
            aluno.setNivel(listField.get(4).getText());
            aluno.setDt_matricula(listField.get(5).getText());
            alunos.add(aluno);
            limparActionPerformed(evt, listField, mensagemJLabel);
        } catch (DataException e) {
            mensagemJLabel.setText(e.getMessage());
        } catch (MatriculaSemOitoDigitosException e) {
            mensagemJLabel.setText(e.getMessage());
        } catch (ParseException pe) {
            mensagemJLabel.setText("Formato da data inválido.");
        }
    }

    public void printAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }
    
}
