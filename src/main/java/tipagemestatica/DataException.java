package main.java.tipagemestatica;

public class DataException extends RuntimeException {
    private String mensagem;

    public DataException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return this.mensagem;
    }
}
