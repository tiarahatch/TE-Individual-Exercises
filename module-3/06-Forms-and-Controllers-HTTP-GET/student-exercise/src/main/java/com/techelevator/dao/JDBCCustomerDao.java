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

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
		
		List<Customer> matchingCustomers = new ArrayList<>();
//        String customerSearchSql = "SELECT last_name, email FROM customer WHERE last_name ILIKE ? order by last_name DESC";
//        SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search + "%");
//        while (results.next()) {
//            matchingCustomers.add(mapRowToCustomer(results));
		if(sort.equals("lastName")){
			String customerSearchSql = "SELECT * FROM customer WHERE first_name ILIKE ? or last_name ILIKE ? order by last_name";
			SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search + "%" , "%" + search + "%") ;
			while (results.next()) {
	            matchingCustomers.add(mapRowToCustomer(results));
        }
		}
		if(sort.equals("firstName")){
			String customerSearchSql = "SELECT * FROM customer WHERE first_name ILIKE ? or last_name ILIKE ? order by first_name";
			SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search + "%" , "%" + search + "%") ;
			while (results.next()) {
	            matchingCustomers.add(mapRowToCustomer(results));
        }
		}
		if(sort.equals("email")){
			String customerSearchSql = "SELECT * FROM customer WHERE first_name ILIKE ? or last_name ILIKE ? order by email";
			SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%" + search + "%" , "%" + search + "%") ;
			while (results.next()) {
	            matchingCustomers.add(mapRowToCustomer(results));
        }
		}
        return matchingCustomers;
	}
	private Customer mapRowToCustomer(SqlRowSet results) {
        return new Customer(results.getString("last_name"), results.getString("email"));
    }
}
