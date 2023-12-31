package br.com.elisbjr.dao;

import br.com.elisbjr.domain.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO implements IClientDAO{
    private Map<Long, Client> map;

    public ClientMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean register(Client client) {
        if(this.map.containsKey(client.getCpf())) {
            return false;
        }
        this.map.put(client.getCpf(), client);
        return true;
    }

    @Override
    public void delete(Long cpf) {
        Client registeredClient = this.map.get(cpf);

        if(registeredClient != null) {
            this.map.remove(registeredClient.getCpf(), registeredClient);
        }
    }

    @Override
    public void modify(Client client) {
        Client registeredClient = this.map.get(client.getCpf());

        if(registeredClient != null) {
            registeredClient.setName(client.getName());
            registeredClient.setTel(client.getTel());
            registeredClient.setNumber(client.getNumber());
            registeredClient.setAddress(client.getAddress());
            registeredClient.setCity(client.getCity());
            registeredClient.setState(client.getState());
        }
    }

    @Override
    public Client consult(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> searchAll() {
        return this.map.values();
    }

}
