package com.Sapient.Shapes;

import java.math.BigDecimal;

public class Circle {

	
	public BigDecimal calculateArea(BigDecimal r)
	{
		return ((r.multiply(r)).multiply(new BigDecimal(3.14)));
	}

}
