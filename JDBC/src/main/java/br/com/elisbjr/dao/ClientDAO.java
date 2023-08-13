/**
 * 
 */
package br.com.elisbjr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.elisbjr.domain.Client;
import br.com.elisbjr.dao.jdbc.ConnectionFactory;

/**;
 * 
 */
public class ClientDAO implements IClientDAO {

	@Override
	public Integer registerClient(Client client) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql  = "INSERT INTO tb_cliente_2 (CODE, NAME) VALUES (?, ?)";
			stm = connection.prepareStatement(sql);
			stm.setString(1, client.getCode());
			stm.setString(2, client.getName());
			return stm.executeUpdate();
			
		} catch (Exception e) {
			
			throw e;
			
		} finally {
			if(stm != null && !stm.isClosed()) {
				stm.close();
			}
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		
	}

	@Override
	public Client consult(String code) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Client client = null;
		try {
			
			connection = ConnectionFactory.getConnection();
			String sql  = "SELECT * FROM tb_cliente_2 WHERE CODE = ? ";	
			stm = connection.prepareStatement(sql);
			stm.setString(1, code);
			rs = stm.executeQuery();
			
			if(rs.next()) {
				client = new Client();
				client.setId(rs.getLong("ID"));
				client.setCode(rs.getString("CODE"));
				client.setName(rs.getString("NAME"));
				
			}
			
			
			return client;
		} catch (Exception e) {
			
			throw e;
			
		} finally {
			if(stm != null && !stm.isClosed()) {
				stm.close();
			}
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
			
			
		}
		
		
	}

	@Override
	public Integer delete(Client client) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			
			connection = ConnectionFactory.getConnection();
			String sql  = "DELETE FROM tb_cliente_2 WHERE CODE = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, client.getCode());
			return stm.executeUpdate();
			
		} catch (Exception e) {
			
			throw e;
			
		} finally {
			if(stm != null && !stm.isClosed()) {
				stm.close();
			}
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		
	}

	@Override
	public Integer updateClient(Client client) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			
			connection = ConnectionFactory.getConnection();
			String sql  = "UPDATE tb_cliente_2 SET CODE = ?, NAME = ? WHERE ID = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, client.getCode());
			stm.setString(2, client.getName());
			stm.setLong(3, client.getId());
			return stm.executeUpdate();
			
		} catch (Exception e) {
			
			throw e;
			
		} finally {
			if(stm != null && !stm.isClosed()) {
				stm.close();
			}
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public List<Client> searchAll() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		List<Client> list = new ArrayList<>();
		Client client = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM tb_cliente_2";
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while (rs.next()) {
				client = new Client();
				Long id = rs.getLong("ID");
				String name = rs.getString("NAME");
				String code = rs.getString("CODE");
				client.setId(id);
				client.setName(name);
				client.setCode(code);
				list.add(client);
			}
			
		} catch (Exception e) {
			
			throw e;
			
		} finally {
			
			if(stm != null && !stm.isClosed()) {
				stm.close();
			}
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		} 
		
		return list;
	}

}
