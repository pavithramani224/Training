package com.example.demo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.DriverDTO;

public class ClientContorller {
	@RestController
	@RequestMapping(path = "/api/v1")
	public class ClientController {

		@Autowired
		RestTemplate template;
		
		@GetMapping(path = "/client/srch/drivers")
		public DriverDTO[] getDrivers() {
			return template.getForObject("http://DRIVER-SERVICE/api/v1/drivers",DriverDTO[].class);
		}
	}
}