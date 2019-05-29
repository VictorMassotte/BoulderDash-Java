package model.DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;

public abstract class DAO {

	protected static ResultSet executeQuery(final String query) {
		return DBConnection.getInstance().executeQuery(query);
	}

	protected static int executeUpdate(final String query) {
		return DBConnection.getInstance().executeUpdate(query);
	}

	protected static CallableStatement prepareCall(final String query) {
		return DBConnection.getInstance().prepareCall(query);
	}

}
