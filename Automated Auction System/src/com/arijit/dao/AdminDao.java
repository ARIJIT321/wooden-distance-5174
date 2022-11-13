package com.arijit.dao;

import java.util.List;

import com.arijit.bean.Admin;
import com.arijit.bean.Buyer;
import com.arijit.bean.Product;
import com.arijit.bean.Seller;

public interface AdminDao {
	
	public Admin adminLogIn(String username , String password);
	
	public List<Product> viewProductsDetails();
	
	public List<Buyer> viewRegisteredBuyers();
	
	public List<Seller> viewRegisterdSellers();
	
	public void viewDailyTotalSales();
	
}
