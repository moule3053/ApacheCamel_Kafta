package com.kafka.service;

public class ServiceImpl {

	public String getSampleString(){
		System.out.println("========getSampleString=============");
		return "THIS IS A SAMPLE MESSAGE FOR TOPIC3";
	}
	
	public void displayMessage(String message){
		System.out.println("MESSAGE : "+message);
	}
}
