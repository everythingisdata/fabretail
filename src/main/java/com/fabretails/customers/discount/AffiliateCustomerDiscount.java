/**
 * 
 */
package com.fabretails.customers.discount;

import com.fabretails.discounts.impl.DiscountByPercentage;

/**
 * @author b.singh
 *
 */
public class AffiliateCustomerDiscount extends DiscountByPercentage {
	private static final double DISCOUNT = 0.1;

	public AffiliateCustomerDiscount() {
		super(DISCOUNT);
	}

}
