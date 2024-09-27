package main.java.tipagemestatica.excessoes;

public class MatriculaSemOitoDigitosException extends RuntimeException {
    private String mensagem;

    public MatriculaSemOitoDigitosException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return this.mensagem;
    }

}
