package modelle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Maps;

/**
 * The DAOMaps is a class in model
 * 
 * @author Victor Massotte
 *
 */
public class DAOMaps extends DAOEntity<Maps> {

	public DAOMaps(final Connection connection) throws SQLException {
		super(connection);
	}

	@Override
	public Maps find(final int code) {
		Maps maps = new Maps();

		try {
			final String sql = "{call MapsById(?)}";
			final CallableStatement call = (CallableStatement) this.getConnection().prepareCall(sql);
			call.setInt(1, code);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				maps = new Maps(code, resultSet.getInt("diamond"), resultSet.getInt("time"),
						resultSet.getString("map"));
			}
			return maps;

		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean create(Maps entity) {
		return false;
	}

	@Override
	public boolean update(Maps entity) {
		return false;
	}

	@Override
	public boolean delete(Maps entity) {
		return false;
	}

}
