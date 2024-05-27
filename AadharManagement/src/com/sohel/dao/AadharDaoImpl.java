package com.sohel.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sohel.dto.Aadhar;
import com.sohel.dto.Address;

import com.sohel.util.ConnectionUtil;

public class AadharDaoImpl implements AadharDao{

	@Override
	public void saveAadharDao(Aadhar aadhar) {
		
		Connection connection = ConnectionUtil.getConnection();
		try {
			Statement stmt = connection.createStatement();
			String insertAadharQuery = "insert into aadhar1 values(" + 
			                             aadhar.getAadharId() + ",'" +
					                     aadhar.getAadharHolderName() + "',"+
					                     aadhar.getAadharHolderAge()+ ",'" +
					                     aadhar.getAadharHolderGender() + "'," +
			                             aadhar.getMobileNumder()+","+
			                             aadhar.getAadharHolderIncome()+ ",'" +
					                     aadhar.getAddress().getVillage() + "','"+
			                             aadhar.getAddress().getMandal() + "','" +
					                     aadhar.getAddress().getDistrict() + "','"+
					                     aadhar.getAddress().getState()+"',"+
					                     aadhar.getAddress().getPincode()+")";                             
			stmt.execute(insertAadharQuery);
			ConnectionUtil.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	@Override
	public Aadhar selectAadharByIdDa0(int aadharId) {
		Connection connection = ConnectionUtil.getConnection();
		Aadhar dummyAadhar = new Aadhar();
		Address dummyaddress = new Address();
		try {
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from aadhar1 where aadharId = "+ aadharId;
			ResultSet rs = stmt.executeQuery(selectQuery);
		
			while(rs.next())
			{
				dummyAadhar.setAadharId(rs.getInt(1));
				dummyAadhar.setAadharHolderName(rs.getString(2));
				dummyAadhar.setAadharHolderAge(rs.getInt(3));
				dummyAadhar.setAadharHolderGender(rs.getString(4).charAt(0));
				dummyAadhar.setMobileNumder(rs.getLong(5));
				dummyAadhar.setAadharHolderIncome(rs.getDouble(6));
				dummyaddress.setVillage(rs.getString(7));
				dummyaddress.setMandal(rs.getString(8));
				dummyaddress.setDistrict(rs.getString(9));
				dummyaddress.setState(rs.getString(10));
				dummyaddress.setPincode(rs.getLong(11));
				dummyAadhar.setAddress(dummyaddress);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dummyAadhar;
	}

	@Override
	public Aadhar selectAadharByNameDao(String aadharName) {
	
		Connection connection = ConnectionUtil.getConnection();
		Aadhar dummyAadhar = new Aadhar();
		Address dummyaddress = new Address();
		try {
			Statement stmt = connection.createStatement();
			String selectQuery = "select * from aadhar1 where AadharHolderName = " + "'"+ aadharName +"'";
			ResultSet rs = stmt.executeQuery(selectQuery);
		
			while(rs.next())
			{
				dummyAadhar.setAadharId(rs.getInt(1));
				dummyAadhar.setAadharHolderName(rs.getString(2));
				dummyAadhar.setAadharHolderAge(rs.getInt(3));
				dummyAadhar.setAadharHolderGender(rs.getString(4).charAt(0));
				dummyAadhar.setMobileNumder(rs.getLong(5));
				dummyAadhar.setAadharHolderIncome(rs.getDouble(6));
				dummyaddress.setVillage(rs.getString(7));
				dummyaddress.setMandal(rs.getString(8));
				dummyaddress.setDistrict(rs.getString(9));
				dummyaddress.setState(rs.getString(10));
				dummyaddress.setPincode(rs.getLong(11));
				dummyAadhar.setAddress(dummyaddress);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dummyAadhar;
	}
	@Override
	public List<Aadhar> selectAllAadharDao() {
		Connection connection = ConnectionUtil.getConnection();
		List<Aadhar> aadList = new ArrayList<Aadhar>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from Aadhar1");
			while(rs.next())
			{
				
				Aadhar dummyAadhar = new Aadhar();
				Address dummyaddress = new Address();
				dummyAadhar.setAadharId(rs.getInt(1));
				dummyAadhar.setAadharHolderName(rs.getString(2));
				dummyAadhar.setAadharHolderAge(rs.getInt(3));
				dummyAadhar.setAadharHolderGender(rs.getString(4).charAt(0));
				dummyAadhar.setMobileNumder(rs.getLong(5));
				dummyAadhar.setAadharHolderIncome(rs.getDouble(6));
				dummyaddress.setVillage(rs.getString(7));
				dummyaddress.setMandal(rs.getString(8));
				dummyaddress.setDistrict(rs.getString(9));
				dummyaddress.setState(rs.getString(10));
				dummyaddress.setPincode(rs.getLong(11));
				dummyAadhar.setAddress(dummyaddress);
				aadList.add(dummyAadhar);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aadList;
	
	}

	@Override
	public List<Aadhar> selectAllAadharIncomeByPriceLowToHighDao() {
		List<Aadhar> aadLHList =selectAllAadharDao();
		 Collections.sort(aadLHList, new PriceLowToHighIncomeComparator());
		return aadLHList;	
	}
	@Override
	public List<Aadhar> selectAllAadharIncomeByPriceHightToLowDao() {
		// TODO Auto-generated method stub
		List<Aadhar> aadHLList=selectAllAadharDao();
		 Collections.sort(aadHLList, new PriceHighToLowIncomeComparator());
		return aadHLList;
		
	}

	@Override
	public void deleteAadharByIdDao(int AadharId) {
		Connection connection = ConnectionUtil.getConnection();
			try {
				Statement stmt = connection.createStatement();
				String deleteQuery = "delete from aadhar1 where aadharId = " + AadharId;
				stmt.execute(deleteQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public Aadhar updateAadharDao(Aadhar aadhar) {
		try {
			Connection connection =ConnectionUtil.getConnection();
			

			Statement stmt = connection.createStatement();
			String updateQuery = "update aadhar1 set aadharholdername = " + "'" + aadhar.getAadharHolderName()+ "'," 
                    + " aadharHolderage ="+aadhar.getAadharHolderAge() +
     " where aadharid = " + aadhar.getAadharId();

			stmt.execute(updateQuery);
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aadhar ;
		
	}

}
