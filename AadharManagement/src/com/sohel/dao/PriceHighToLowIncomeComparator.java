package com.sohel.dao;

import java.util.Comparator;

import com.sohel.dto.Aadhar;

public class PriceHighToLowIncomeComparator implements Comparator<Aadhar> {

	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		if(o1.getAadharHolderIncome()>o2.getAadharHolderIncome())
		return -1;
		else if(o1.getAadharHolderIncome()<o2.getAadharHolderIncome())
			return 1;
		else
			return 0;
	}

	

}
