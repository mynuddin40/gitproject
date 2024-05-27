package com.sohel.sevice;

import java.util.List;

import com.sohel.dao.AadharDao;
import com.sohel.dao.AadharDaoImpl;
import com.sohel.dto.Aadhar;

public class AadharServiceImpl implements  AadharService{
	AadharDaoImpl aadharDao = new AadharDaoImpl();
	@Override
	public void saveAadharService(Aadhar aadhar) {
		aadharDao.saveAadharDao(aadhar);
		double taxAmount=taxCalulater(aadhar.getAadharHolderIncome());
 		aadhar.setAadharHolderIncome(taxAmount);
	}

	private double taxCalulater(double aadharHolderIncome) {	
		return 0;
	}

	@Override
	public Aadhar selectAadharByIdService(int aadharId) {
	   Aadhar aadhar=  aadharDao.selectAadharByIdDa0(aadharId);
	     
		return aadhar;
	}

	@Override
	public Aadhar selectAadharByNameService(String aadharName) {
     Aadhar aadhar =  aadharDao.selectAadharByNameDao(aadharName);
		return aadhar;
	}
	@Override
	public List<Aadhar> selectAllAadharByService() {
		 List<Aadhar> aadharList=aadharDao.selectAllAadharDao();
			return aadharList;
	}
	

	@Override
	public List<Aadhar> selectAllAadharIncomeByPriceLowToHighService() {
		   List<Aadhar> listAadhar= aadharDao.selectAllAadharIncomeByPriceLowToHighDao();
		return listAadhar;
	}

	@Override
	public List<Aadhar> selectAllAadharIncomeByPriceHightToLowService() {
       List<Aadhar> laa= aadharDao.selectAllAadharIncomeByPriceHightToLowDao();
		return laa;
	}

	@Override
	public void deleteAadharByIdService(int AadharId) {
		aadharDao.deleteAadharByIdDao(AadharId);
	}

	@Override
	public Aadhar updateAadharService(Aadhar aadhar) {
	     aadharDao.updateAadharDao(aadhar);
		return aadhar;
	}

	

}
