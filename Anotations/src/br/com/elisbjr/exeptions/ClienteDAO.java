package br.com.elisbjr.exeptions;

public class ClienteDAO {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        boolean isCardastro = false;
        if(!isCardastro) {
            throw new ClienteNaoEncontradoException("Cliente nao foi encontrado!");
        }
    }
}
