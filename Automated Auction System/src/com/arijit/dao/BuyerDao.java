package com.arijit.dao;

import java.util.List;

import com.arijit.bean.Buyer;
import com.arijit.bean.Product;
import com.arijit.exception.BuyerException;

public interface BuyerDao {
	
	public void registerAsBuyer(Buyer user);
	
	public Buyer loginAsBuyer(String username , String password) throws BuyerException;
	
	public List<Product> viewByCategory(String cate);
	
	public void buyProduct(int product_id);
	
	public List<Buyer> viewAllBuyers();
}
