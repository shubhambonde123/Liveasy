package com.LiveEasy.Assignment.Sevice;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.LiveEasy.Assignment.model.Payload;


public interface PayLoadService {
	
	public Payload PayloadGetdata(Payload payload);	//for add data into Mysql Table using Save method
	
	public Payload Updatedata(Payload payload);
	
	public Optional<Payload> getbyid(Integer id);
	
	
	public void DeleteId(Integer id) ;
	
	public Optional<Payload> getByShipperId(String ShipperId);
		
}
