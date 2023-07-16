package cadastrocliente.dao.generic;

import cadastrocliente.domain.Persistance;
import cadastrocliente.domain.Product;

import java.util.Collection;

public interface IGenericDAO <T extends Persistance> {
    public Boolean register(T entity);
    public void delete(Long code);
    public void modify(T entity);
    public T consult(Long code);
    public Collection<T> searchAll();
}
