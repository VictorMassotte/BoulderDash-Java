package model.DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import factory.End;
import mobile.*;
import view.PanneauMap;
import motionless.GameMap; 


public class MapDAO extends DAO<GameMap>{

	//private Map obj;

	public MapDAO(Connection conn) throws SQLException
	{
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
	
	public GameMap find(int id)
	{
		GameMap map = new GameMap();
		
		try {
			final String sql = "{call helloworldById(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				map = new GameMap(id, resultSet.getString("content"));
			}
			return map;
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
                case 1:
                    sprite = new Block();
                    break;
                case 2:
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
                    if (map[y][x] == 5) {
                        hero.setPosX(x * Main.TILESIZE);
                        hero.setPosY(y * Main.TILESIZE);
                    }
                    break;
                }
                sprite.setPosX(x * Main.TILESIZE);
                sprite.setPosY(y * Main.TILESIZE);
                pan.add(sprite);
            }
        }
}