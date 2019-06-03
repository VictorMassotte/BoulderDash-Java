package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h1>The Class Map provides the code of the model component.</h1>
 *
 * @author Victor Massotte
 */

public class Map {

	public Map(int level) {
		super();
	}

	/**
	 * Execute a static SQL request
	 * 
	 * @param level
	 * 
	 */
	public ResultSet executeMapQuery(ResultSet result, Statement statement, int level) {
		try {
			switch (level) {
			case 1:
				result = statement.executeQuery("call `Contentlevel1`");
				break;
			case 2:
				result = statement.executeQuery("call `Contentlevel2`");
				break;
			case 3:
				result = statement.executeQuery("call `Contentlevel3`");
				break;
			case 4:
				result = statement.executeQuery("call `Contentlevel4`");
				break;
			case 5:
				result = statement.executeQuery("call `Contentlevel5`");
				break;
			default:
				System.out.print("System error");
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public void setMapQueryIntoTable(ResultSet result, char[][] tab) {
		try {
			int ligne = 0;
			while (result.next()) {
				for (int colonne = 0; colonne < result.getObject(2).toString().length(); colonne++) {
					tab[ligne][colonne] = result.getObject(2).toString().charAt(colonne);
				}
				ligne++;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
