package cadastrocliente.dao.generic;

import cadastrocliente.domain.Client;
import cadastrocliente.domain.Persistance;
import cadastrocliente.domain.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistance> implements IGenericDAO<T>{
    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getClassType();

    public abstract void updateData(T entity, T registerObj);

    public GenericDAO() {
      if(this.map == null) {
          this.map = new HashMap<>();

      }
    }


    @Override
    public Boolean register(T entity) {
        Map<Long, T> internalMap = this.map.get(getClassType());
        if(internalMap.containsKey(entity.getCode())) {
            return false;
        }
        internalMap.put(entity.getCode(), entity);
        return true;
    }

    @Override
    public void delete(Long code) {
        Map<Long, T> internalMap = this.map.get(getClassType());
        T registerObj = internalMap.get(code);

        if(registerObj != null) {
            this.map.remove(code, registerObj);
        }
    }

    @Override
    public void modify(T entity) {
        Map<Long, T> internalMap = this.map.get(getClassType());
        T registerObj = internalMap.get(entity.getCode());

        if(registerObj != null) {
            updateData(entity, registerObj);
        }

    }

    @Override
    public T consult(Long code) {
        Map<Long, T> internalMap = this.map.get(getClassType());
        return internalMap.get(code);
    }

    @Override
    public Collection<T> searchAll() {
        Map<Long, T> internalMap = this.map.get(getClassType());
        return internalMap.values();
    }
}
