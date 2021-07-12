package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class PlanetDaoImpl implements PlanetDao {

	@Override
	public List<Planet> selectAllPlanets() {
		List<Planet> databasePlanets = new ArrayList<>();
		
		//This time we're using a prepared statement. 
		//prepared statements protect us from sql injections 
		//    (SQL injection is where we send sql commands pretending to be values. 
//				e.g. insert into tables values (delete from table fruits;)
		// (they're easier for visualization of sql commands) 
		
		
		String sql = "SELECT * FROM planets;";
		
		//try with resources syntax 
		try(Connection conn = ConnectionFactory.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//we expect rows and columns back from our db 
			ResultSet rs = ps.executeQuery();
			
			//we want to convert those columsn and rows into objects. 
			while(rs.next()) {
				databasePlanets.add(new Planet(
						rs.getInt("planet_id"),
						rs.getString("planet_name"),
						rs.getString("planet_description"),
						rs.getBoolean("has_rings"),
						rs.getInt("number_of_moons")
						));
			}
			
			
			
		}catch (SQLException e) {
			
		}
		
		return databasePlanets;
	}

	@Override
	public boolean insertPlanet(Planet p) {
		
		String sql = "CALL insert_into_planets(?,?,?);";

		try(Connection conn = ConnectionFactory.getConnection()){
			
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, p.getName());
			cs.setString(2, p.getDescription());
			cs.setBoolean(3, p.isRings());
			
			cs.execute();
		
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Planet> ringedPlanetsOnlu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Planet selectPlanetByName(String name) {
		String sql = "SELECT * FROM planets where planet_name = ?;";
		
		//creating a List, so we can handle multiple entries with the same name. 
		List<Planet> pList = new ArrayList<>();
		
		//try with resources syntax 
		try(Connection conn = ConnectionFactory.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			//we expect rows and columns back from our db 
			ResultSet rs = ps.executeQuery();
			
			
			//we want to convert those columsn and rows into objects. 
			while(rs.next()) {
				pList.add(new Planet(
						rs.getInt("planet_id"),
						rs.getString("planet_name"),
						rs.getString("planet_description"),
						rs.getBoolean("has_rings"),
						rs.getInt("number_of_moons")
						));
			}
			
		}catch (SQLException e) {
			
		}
		
		return pList.get(0); //we'll just return the first one we can get. 
	}

	@Override
	public Planet selectPlanetById(int id) {
		String sql = "SELECT * FROM planets where plnaet_id = ?;";
		
		Planet planet = null;
		
		//try with resources syntax 
		try(Connection conn = ConnectionFactory.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			//we expect rows and columns back from our db 
			ResultSet rs = ps.executeQuery();
			
			//we want to convert those columsn and rows into objects. 
			while(rs.next()) {
				planet = new Planet(
						rs.getInt("planet_id"),
						rs.getString("planet_name"),
						rs.getString("planet_description"),
						rs.getBoolean("has_rings"),
						rs.getInt("number_of_moons")
						);
			}
			
		}catch (SQLException e) {
			
		}
		
		return planet;
	
	}

	@Override
	public boolean updatePlanetsRings(boolean ringStatus, int planetId) {
		
		String sql = "UPDATE planets SET has_rings = ? WHERE planet_id =?";
		
		//try with resources syntax 
				try(Connection conn = ConnectionFactory.getConnection()){
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setBoolean(1, ringStatus);
					ps.setInt(2, planetId);
					
					ps.execute();
					
				}catch (SQLException e) {
					return false;
				}
		
		
		return true;
	}

	@Override
	public boolean deletePlanet(Planet p) {
		String sql = "DELETE FROM planets WHERE planet_id =?";
		
		//try with resources syntax 
				try(Connection conn = ConnectionFactory.getConnection()){
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setInt(1, p.getId());
					
					ps.execute();
					
				}catch (SQLException e) {
					return false;
				}
		
		
		return true;
	}

	@Override
	public boolean updatePlanet(Planet p) {
		String sql = "UPDATE planets SET has_rings = ? WHERE planet_id =?";
		
		//try with resources syntax 
				try(Connection conn = ConnectionFactory.getConnection()){
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setBoolean(1, p.isRings());
					ps.setInt(2, p.getId());
					
					ps.execute();
					
				}catch (SQLException e) {
					return false;
				}
		
		
	
		return true;
	}

}
