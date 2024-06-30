package exceptions;

public class RegistroNaoEncontradoException extends Exception {
    public RegistroNaoEncontradoException() {
    
    }
    
    public RegistroNaoEncontradoException(String msg) {
        super(msg);
    }
}