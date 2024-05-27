package com.sohel.sevice;

import java.util.List;

import com.sohel.dto.Aadhar;

public interface AadharService {
	public void saveAadharService(Aadhar aadhar);
	public Aadhar selectAadharByIdService(int aadharId);
	public Aadhar selectAadharByNameService(String aadharName);
	public List<Aadhar> selectAllAadharByService();
	public List<Aadhar> selectAllAadharIncomeByPriceLowToHighService();
	public List<Aadhar> selectAllAadharIncomeByPriceHightToLowService();
	public void deleteAadharByIdService(int AadharId);
	public Aadhar updateAadharService(Aadhar aadhar);

}
