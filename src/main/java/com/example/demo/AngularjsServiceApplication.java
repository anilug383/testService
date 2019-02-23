package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages= {"com.example.demo"})
public class AngularjsServiceApplication {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private userInterface userInterface;

	public static void main(String[] args) {
		SpringApplication.run(AngularjsServiceApplication.class, args);
	}
	

	@PostMapping("/postData")
	public void postData(@RequestBody User user) {
		System.out.println(user.getName()+" "+user.getEmail());
		
	}
	@GetMapping("/getSqaure")
	public int getSquare(@RequestParam("number") int n) {
		return n*n;
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		List<User> userList =  (List<User>) userRepo.findAll();
		return userList;
		
	}
	@GetMapping("/findByName")
	public List<User> findByName(@RequestParam("name") String name){
		return userInterface.findByName(name);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){
		return userInterface.getProducts();
	}

}

