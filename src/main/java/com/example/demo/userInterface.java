package com.example.demo;

import java.util.List;

public interface userInterface {

	public List<User> findByName(String name);
	public List<Product> getProducts();

}
