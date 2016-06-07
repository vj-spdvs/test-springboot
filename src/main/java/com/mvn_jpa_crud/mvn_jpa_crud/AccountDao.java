package com.mvn_jpa_crud.mvn_jpa_crud;


import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
//import org.springframework.stereotype.Repository;

@Transactional
public interface AccountDao extends CrudRepository<Account, Integer> {

	public Account findById(Integer id);
	
	public List<Account> findAll();
	
}
