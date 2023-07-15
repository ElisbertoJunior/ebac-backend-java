package cadastrocliente.dao;

import cadastrocliente.domain.Client;

import java.util.Collection;

public interface IClientDAO {
    public Boolean register(Client client);
    public void delete(Long cpf);
    public void modify(Client client);
    public Client consult(Long cpf);
    public Collection<Client> searchAll();
}
