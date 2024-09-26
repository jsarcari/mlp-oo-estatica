package main.java.tipagemestatica;

public class DataMaiorQueAtualException extends RuntimeException {
    private String mensagem;

    public DataMaiorQueAtualException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return this.mensagem;
    }
}
