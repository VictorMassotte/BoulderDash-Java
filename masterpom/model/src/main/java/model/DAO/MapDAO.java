package model.DAO;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.mysql.jdbc.Connection;

import contract.main.IMain;
import factory.Empty;
import factory.End;
import mobile.Block;
import mobile.Diamond;
import mobile.Dirt;
import mobile.Hero;
import mobile.Rock;
import mobile.Sprite;
import motionless.GameMap;
import view.PanneauMap;

public class MapDAO extends DAO<GameMap> {

	private GameMap obj;

	public MapDAO(Connection conn) throws SQLException {
		super(conn);
	}

	@Override
	public boolean create(GameMap obj) {
		return false;
	}

	@Override
	public boolean delete(GameMap obj) {
		return false;
	}

	@Override
	public boolean update(GameMap obj) {
		return false;
	}

	final ResultSet resultSet;
	public int map_number = 1;

	public GameMap find(final int id) {


        try {
            final String sql = "SELECT map FROM map WHERE id ="+ map_number ;
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.execute();
            if (resultSet.next()) {
                try {
                    this.resultSet;
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

	public void init() {
		Hero hero = new Hero();
		PanneauMap.add(hero);

		for (int y = 0; y < 30; y++) {
			for (int x = 0; x < 30; x++) {
				Sprite sprite;

				switch (map[y][x]) {
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
				case 6:
					sprite = new End();
					break;
				default:
					sprite = new Empty();
					if (map[y][x] == 2) {
						hero.setPosX(x * IMain.TILESIZE);
						hero.setPosY(y * IMain.TILESIZE);
					}
					break;
				}
				sprite.setPosX(x * IMain.TILESIZE);
				sprite.setPosY(y * IMain.TILESIZE);
				PanneauMap.add(sprite);
			}
		}
	}
}
