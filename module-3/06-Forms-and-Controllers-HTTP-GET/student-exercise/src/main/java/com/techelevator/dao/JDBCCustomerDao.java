package com.techelevator.dao;

import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


@Component
public class JDBCCustomerDao implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCCustomerDao(DataSource dataSource) {
	jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
	List<Customer> customers = new ArrayList<>();
	String filmSearchSql = "SELECT * FROM customer WHERE first_name ILIKE ? OR last_name ILIKE ? ORDER BY " + sort;
	System.out.println(sort);
	SqlRowSet results = jdbcTemplate.queryForRowSet(filmSearchSql, "%" + search + "%", "%" + search + "%");

	 while(results.next()) {
	     customers.add(mapRowToCustomer(results));
	 }
	 return customers;
	}
	

	private Customer mapRowToCustomer(SqlRowSet results) {
	Customer customer;
	customer = new Customer(null, null);
	customer.setActive(results.getBoolean("activebool"));
	customer.setEmail(results.getString("email"));
	customer.setFirstName(results.getString("first_name"));
	customer.setLastName(results.getString("last_name"));
	return customer;
	}

	}


	
