package com.htc.exc.fifteen;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		return new Double(arg0.getPrice()).compareTo(new Double(arg1.getPrice()));
	}

}
