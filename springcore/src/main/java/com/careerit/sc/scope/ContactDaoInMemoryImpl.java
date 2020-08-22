package com.careerit.sc.scope;

import java.util.List;

public class ContactDaoInMemoryImpl implements ContactDao{

	@Override
	public List<String> getContactNames() {
		return List.of("Manoj", "Krish");
	}

}
