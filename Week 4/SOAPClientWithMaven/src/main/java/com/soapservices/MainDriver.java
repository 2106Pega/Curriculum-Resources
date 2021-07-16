package com.soapservices;

public class MainDriver {

	public static void main(String[] args) {

		HelloGeneratorService hGenService = new HelloGeneratorService();
		
		HelloGenerator hello = hGenService.getHelloGeneratorPort();
		
		String response = hello.hello("Bob");
		
		System.out.println(response);
		
	}

}
