
  package model.DAO;
  
  import java.io.IOException; 
  import java.sql.ResultSet; 
  import java.sql.SQLException; 
  import java.util.Map;
  
  import com.mysql.jdbc.CallableStatement;
  
  import contract.model.IElement; 
  import factory.ElementFactory; 
  import mobile.Boulder; 
  import mobile.Diamond;
  
  public class MapDAO extends DAO {
  
  private static String sqlMapById = "call getMapByID(?)"; private static int
  widthColumnIndex = 2; private static int heightColumnIndex = 3; private
  static int mapColumnIndex = 4;
  
  public static Map getMapById(int id) throws SQLException, IOException {
  CallableStatement callStatement = (CallableStatement)
  prepareCall(sqlMapById); callStatement.setInt(1, id); int width = 0; int
  height = 0; Map tempMap = null;
  
  if (callStatement.execute()) { ResultSet result =
  callStatement.getResultSet();
  
  if (result.first()) { width = result.getInt(widthColumnIndex); height =
  result.getInt(heightColumnIndex);
  
  try { MapDAO.testCorrectLevel(width, height,
  result.getString(mapColumnIndex)); } catch (Exception e) {
  System.out.println(e.getMessage());
  
  }
  
  tempMap = new Map(width, height, new IElement[width][height]);
  
  MapDAO.placePawnsOnMap(result, tempMap, width);
  
  } else { System.out.println("Not find Map !"); System.out.println(1); }
  result.close(); }
  
  return tempMap;
  
  }
  
  private static void placePawnsOnMap(final ResultSet result, final Map
  tempMap, int width) throws SQLException, IOException {
  
  int currentXToWrite = 0; int currentYToWrite = 0; boolean skipNext = false;
  
  for (char r : result.getString(mapColumnIndex).toCharArray()) { if
  (!skipNext) { tempMap.setOnTheMapXY(currentXToWrite, currentYToWrite,
  ElementFactory.getFromFileSymbol(r));
  
  if (r == 'O') tempMap.addPawn(new Boulder(currentXToWrite, currentYToWrite,
  tempMap)); else if (r == 'D') { tempMap.addPawn(new Diamond(currentXToWrite,
  currentYToWrite, tempMap)); tempMap.addDiamondCount(); }
  
  currentXToWrite++; } else { skipNext = false; } if (currentXToWrite % width
  == 0 && currentXToWrite != 0) { currentXToWrite = 0; currentYToWrite++;
  skipNext = true; } } }
  
  private static void testCorrectLevel(int width, int height, String mapString)
  throws Exception { if (width * height + height != mapString.length()) { throw
  new Exception("Is not good : x :" + width + " y: " + height + " size: " +
  mapString.length());
  
  }
  
  } 
  }
 