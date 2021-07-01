package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Fruit;
import com.revature.util.ConnectionFactory;

public class FruitDaoImpl implements FruitDAO {

	@Override
	public boolean insertFruit(Fruit f) {
		
		
		
		
		//Created a sql query in terrible fashion
		String sql = "INSERT INTO fruit_table (fruit_name,fruit_description,fruit_price) VALUES(?,?,?)";
		
		//Created a connection
		try(Connection conn = ConnectionFactory.getConnection();) {
			
			//created a prepared statement object to be sent to our db
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, f.getName());
			ps.setString(2, f.getDescription());
			ps.setInt(3, (int) f.getPrice());
			
			//execute the query
			ps.execute();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return true;
	}

	@Override
	public Fruit selectFruitById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fruit> selectFruitsByName(String name) {

		List<Fruit> databaseFruits = new ArrayList<>();
		
		//This time we're using a prepared statement. 
		//prepared statements protect us from sql injections 
		//    (SQL injection is where we send sql commands pretending to be values. 
//				e.g. insert into tables values (delete from table fruits;)
		// (they're easier for visualization of sql commands) 
		
		
		String sql = "select * from fruit_table where fruit_name = ? ;";
		
		//try with resources syntax 
		try(Connection conn = ConnectionFactory.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			//we expect rows and columns back from our db 
			ResultSet rs = ps.executeQuery();
			
			//we want to convert those columsn and rows into objects. 
			while(rs.next()) {
				databaseFruits.add(new Fruit(
						rs.getInt("fruit_id"),
						rs.getString("fruit_name"),
						rs.getString(3),
						rs.getDouble(4)
						));
			}
			
			
			
		}catch (SQLException e) {
			
		}
		
		return databaseFruits;
	}

	@Override
	public List<Fruit> selectAllFruits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateFruit(Fruit f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFruit(Fruit f) {
		// TODO Auto-generated method stub

	}

}
