package cadastrocliente.dao;

import cadastrocliente.dao.generic.GenericDAO;
import cadastrocliente.domain.Product;


import java.util.HashMap;
import java.util.Map;

public class ProductMapDAO extends GenericDAO<Product> implements IProductDAO {
    public ProductMapDAO() {
        super();
        Map<Long, Product> internalMap = this.map.get(getClassType());
        if(internalMap == null) {
            internalMap = new HashMap<>();
            this.map.put(getClassType(), internalMap);
        }
    }
    @Override
    public Class<Product> getClassType() {
        return Product.class;
    }

    @Override
    public void updateData(Product entity, Product registerObj) {
        registerObj.setName(entity.getName());
        registerObj.setCode(entity.getCode());
    }

}
