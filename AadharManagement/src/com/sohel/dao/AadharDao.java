package com.sohel.dao;

import java.util.List;

import com.sohel.dto.Aadhar;


public interface AadharDao {

	public void saveAadharDao(Aadhar aadhar);
	public Aadhar selectAadharByIdDa0(int aadharId);
	public Aadhar selectAadharByNameDao(String aadharName);
	public List<Aadhar> selectAllAadharDao();
	public List<Aadhar> selectAllAadharIncomeByPriceLowToHighDao();
	public List<Aadhar> selectAllAadharIncomeByPriceHightToLowDao();
	public void deleteAadharByIdDao(int AadharId);
	public Aadhar updateAadharDao(Aadhar aadhar);
}
