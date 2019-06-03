package model.DAO;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import contract.main.IMain;
import mobile.Block;
import mobile.Diamond;
import mobile.Dirt;
import mobile.Rock;
import mobile.Sprite;

/**
 * <h1>The Class DAOMap provides the code of the model component.</h1>
 *
 * @author Victor Massotte
 */
public class DAOMap {

	private final Connection connection;
	private static int x = 0, y = 0;

	public DAOMap(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	protected Connection getConnection() {
		return this.connection;
	}

	public static final Map downloadMap(int level) throws IOException {
		Map map = null;
		try {
			final String sql = "call level" + level;
			final CallableStatement call = prepareCall(sql);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			map = resultToMap(resultSet, level);
			return map;

		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Map resultToMap(final ResultSet result, int level) throws SQLException, IOException {

		Map tempMap = new Map(level);

		while (result.next()) {

			for (int y = 0; y < 30; y++) {
				for (int x = 0; x < 30; x++) {
					Sprite sprite = null;

					switch (x = 30) {
					case 0:
						sprite = new Block();
						break;
					case 1:
						sprite = new Dirt();
						break;
					case 3:
						sprite = new Rock();
						break;
					case 4:
						sprite = new Diamond();
						break;
					}
					sprite.setPosX(x * IMain.TILESIZE);
					sprite.setPosY(y * IMain.TILESIZE);

				}
			}
		}

		return tempMap;
	}

	public static CallableStatement prepareCall(final String query) throws SQLException {
		return DBConnection.getInstance().getConnection().prepareCall(query);
	}

}