package cadastrocliente.dao;

import cadastrocliente.dao.generic.GenericDAO;
import cadastrocliente.domain.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO extends GenericDAO<Client> implements IClientDAO {
    public ClientMapDAO() {
        super();
        Map<Long, Client> internalMap = this.map.get(getClassType());
        if(internalMap == null) {
            internalMap = new HashMap<>();
            this.map.put(getClassType(), internalMap);
        }
    }

    @Override
    public Class<Client> getClassType() {
        return Client.class;
    }

    @Override
    public void updateData(Client entity, Client registerObj) {
        registerObj.setName(entity.getName());
        registerObj.setTel(entity.getTel());
        registerObj.setNumber(entity.getNumber());
        registerObj.setAddress(entity.getAddress());
        registerObj.setCity(entity.getCity());
        registerObj.setState(entity.getState());
    }
//    private Map<Long, Client> map;
//    public ClientMapDAO() {
//        this.map = new HashMap<>();
//    }
//    @Override
//    public Boolean register(Client client) {
//        if(this.map.containsKey(client.getCpf())) {
//            return false;
//        }
//        this.map.put(client.getCpf(), client);
//        return true;
//    }
//
//    @Override
//    public void delete(Long cpf) {
//        Client registeredClient = this.map.get(cpf);
//
//        if(registeredClient != null) {
//            this.map.remove(registeredClient.getCpf(), registeredClient);
//        }
//    }
//
//    @Override
//    public void modify(Client client) {
//        Client registeredClient = this.map.get(client.getCpf());
//
//        if(registeredClient != null) {
//            registeredClient.setName(client.getName());
//            registeredClient.setTel(client.getTel());
//            registeredClient.setNumber(client.getNumber());
//            registeredClient.setAddress(client.getAddress());
//            registeredClient.setCity(client.getCity());
//            registeredClient.setState(client.getState());
//        }
//    }
//
//    @Override
//    public Client consult(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Client> searchAll() {
//        return this.map.values();
//    }
}
