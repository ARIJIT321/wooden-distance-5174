package com.arijit.dao;

import java.util.List;

import com.arijit.beans.Buyer;
import com.arijit.beans.Product;
import com.arijit.exceptions.BuyerException;
import com.arijit.exceptions.ProductException;

public interface BuerDao {

	public void registerAsBuyer(Buyer user) throws BuyerException;
	
	public Buyer loginAsBuyer(String username , String password) throws BuyerException;
	
	public List<Product> viewByCategory(String cate) throws ProductException;
	
	public void buyProduct(int product_id) throws ProductException;
	
	public List<Buyer> viewAllBuyers() throws BuyerException;
	
}
