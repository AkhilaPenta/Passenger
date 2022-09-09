package com.mt.pkg;

import com.mt.pkg2.*;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class PassengerApplication {
	@GetMapping("/Passenger Management")
	public String welcome()
	{
		return "Passenger Management";
	}


	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
		ArrayList<Passenger>per=new ArrayList<>();
		per.add(new Passenger(105,"Sony",25,"Female"));
		per.add(new Passenger(109,"Akhila",27,"Female"));
		per.add(new Passenger(101,"Sushma",21,"Female"));
		per.add(new Passenger(106,"Sriya",22,"Female"));
		per.add(new Passenger(104,"Pranay",26,"Male"));
		per.add(new Passenger(107,"Priya",28,"Female"));
		per.add(new Passenger(100,"Akhil",20,"Male"));
		per.add(new Passenger(103,"Karthik",23,"Male"));
		per.add(new Passenger(102,"Sahana",24,"Female"));
		per.add(new Passenger(108,"Kalyani",30,"Female"));
		for(Passenger p:per)
		{
			System.out.println(p);
		 }
		
	}

}
