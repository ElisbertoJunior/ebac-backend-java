package br.com.elisbjr.exeptions;

public class ClienteNaoEncontrado2Exception extends Exception{
    private Exception ex;
    public ClienteNaoEncontrado2Exception(String msg, Throwable ex) {
        super(msg, ex);
    }
}
