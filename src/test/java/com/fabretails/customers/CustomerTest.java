/**
 * 
 */
package com.fabretails.customers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

/**
 * @author b.singh
 *
 */

public class CustomerTest {

	Customer customer;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		customer = new Customer();
		LocalDate registrationDate = LocalDate.parse("2017-03-16");
		customer.setCustomerRegistrationDate(registrationDate);
	}

	/**
	 * Test for customer loyalty
	 */
	@Test
	public void customerHasLoyaltyYears() {
		assertEquals(3, customer.getTotalYears());
	}

}
