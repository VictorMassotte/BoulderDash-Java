package modelle;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The DAOEntity is a class in model
 * 
 * @author Victor Massotte
 *
 */
public abstract class DAOEntity<E> {

	private final Connection connection;

	public DAOEntity(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	protected Connection getConnection() {
		return this.connection;

	}

	public abstract boolean create(E entity);

	public abstract boolean update(E entity);

	public abstract boolean delete(E entity);

	public abstract E find(int id);

}
