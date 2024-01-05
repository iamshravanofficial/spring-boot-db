package com.springboot.springbootdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import com.springboot.springbootdb.entity.StoreInfo;
import com.springboot.springbootdb.repo.StoreRepository;

@SpringBootApplication
public class SpringBootDbApplication implements CommandLineRunner{

	@Autowired
	StoreRepository storerepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) {
		StoreInfo storeInfo1 = new StoreInfo
				("Amazon","bags store","91xxxxxxxx");
		storerepo.save(storeInfo1);
		
		StoreInfo storeInfo2 = new StoreInfo
				("Flipkart","books store","92xxxxxxxx");
		storerepo.save(storeInfo2);
		
		StoreInfo storeInfo3 = new StoreInfo
				("Ajio","Cloth store","93xxxxxxxx");
		storerepo.save(storeInfo3);
		
		StoreInfo storeInfo4 = new StoreInfo
				("Myntra","Fashion store","94xxxxxxxx");
		storerepo.save(storeInfo4);
		
		StoreInfo storeInfo5 = new StoreInfo
				("Meesho","Appliances store","95xxxxxxxx");
		storerepo.save(storeInfo5);
		
		System.out.println(storerepo.count());
	}
}
