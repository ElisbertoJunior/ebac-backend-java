/**
 * 
 */
package br.com.elisbjr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.elisbjr.dao.jdbc.ConnectionFactory;
import br.com.elisbjr.domain.Product;

/**
 * 
 */
public class ProductDAO implements IProductDAO {

	@Override
	public Integer registerProduct(Product product) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();	
			String sql = "INSERT INTO tb_produto (CODE, NAME, VALUE) VALUES(?, ?, ?)";
			stm = connection.prepareStatement(sql);
			stm.setString(1, product.getCode());
			stm.setString(2, product.getName());
			stm.setDouble(3, product.getValue());
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		
		
	}

	@Override
	public Integer updateProduct(Product product) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();	
			String sql = "UPDATE tb_produto SET CODE = ?, NAME = ?, VALUE = ? WHERE ID = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, product.getCode());
			stm.setString(2, product.getName());
			stm.setDouble(3, product.getValue());
			stm.setLong(4, product.getId());
			return stm.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Product consultProduct(String code) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Product product = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM tb_produto WHERE CODE = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, code);
			rs = stm.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				product.setId(rs.getLong("ID"));
				product.setCode(rs.getString("CODE"));
				product.setName(rs.getString("NAME"));
				product.setValue(rs.getInt("VALUE"));
				
			}
			
			return product;
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public List<Product> consultAllProducts() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Product product = null;
		List<Product> list = new ArrayList<>();
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM tb_produto";
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				Long id = rs.getLong("ID");
				String code = rs.getString("CODE");
				String name = rs.getString("NAME");
				Integer value = rs.getInt("VALUE");
				product.setId(id);
				product.setCode(code);
				product.setName(name);
				product.setValue(value);
				list.add(product);
				
			}
			
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
			
			
			
		}
		 
		return list;

			
	}

	@Override
	public Integer deleteProduct(Product product) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();	
			String sql = "DELETe FROM tb_produto WHERE CODE = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, product.getCode());
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

}
