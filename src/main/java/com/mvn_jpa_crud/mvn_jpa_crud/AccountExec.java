package com.mvn_jpa_crud.mvn_jpa_crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountExec {

	@Autowired
	private AccountDao accountDao;
	
	public void AccList() {
        try {
        	//accountDao = new AccountDao();
        	System.out.println("Getting all accounts...");
        	System.out.println("accDao is" + accountDao);
        	//AccountDao accDao;
        	List<Account> accList = accountDao.findAll();
        	
        	
        	System.out.println(accList.size());
        	
        	/*
        	
        	for (Account acc : accList) {
        		acc.toString();
        	}
        	
        	*/
        	
        }
        catch (Exception ex) {
            System.out.println("Error listing accounts: " + ex.toString());
        }
	}
	
}
