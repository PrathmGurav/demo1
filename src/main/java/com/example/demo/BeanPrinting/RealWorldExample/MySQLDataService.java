package com.example.demo.BeanPrinting.RealWorldExample;

import org.springframework.stereotype.Repository;

@Repository
//@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
