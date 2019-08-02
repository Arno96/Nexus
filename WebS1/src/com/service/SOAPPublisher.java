package com.service;
import javax.xml.ws.Endpoint;
public class SOAPPublisher {
	
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:7777/ws/myperson", new PersonSvcImpl());  
	}

}
