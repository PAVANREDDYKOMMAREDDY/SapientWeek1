package com.Sapient.Shapes;

import java.math.BigDecimal;

public class Triangle {

	
	public BigDecimal calculateArea(BigDecimal r)
	{
		return ((r.multiply(r)).multiply(new BigDecimal(0.433)));
	}

}
