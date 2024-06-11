package com.LiveEasy.Assignment.Sevice;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveEasy.Assignment.Dao.PayLoadRepo;
import com.LiveEasy.Assignment.model.Payload;

@Service
public class PayloadServiceImpl implements PayLoadService{
	@Autowired
	private PayLoadRepo payLoadRepo;
	
//post
	@Override
	public Payload PayloadGetdata(Payload payload) {
		
		return payLoadRepo.save(payload);
	}

//put
	@Override
	public Payload Updatedata(Payload payload) {
		Optional<Payload> vel= payLoadRepo.findById(payload.getId());
		if(vel.isPresent()) {
			Payload UpdateData=vel.get();
			UpdateData.setLoadingpoint(payload.getLoadingpoint());
			UpdateData.setUnloadingPoint(payload.getUnloadingPoint());
			UpdateData.setProductType(payload.getProductType());
			UpdateData.setTruckType(payload.getTruckType());
			UpdateData.setNoOfTrucks(payload.getNoOfTrucks());
			UpdateData.setWeight(payload.getWeight());
			UpdateData.setComment(payload.getComment());
			UpdateData.setShipperid(payload.getShipperid());
			UpdateData.setDate(payload.getDate());
			return payLoadRepo.save(UpdateData);
		}else {
			throw new IllegalArgumentException("Payload Not Found with id" +payload.getId());
		}
	}
//get 

	@Override
	public Optional<Payload> getbyid(Integer id) {
		
		return payLoadRepo.findById(id);
	}
	
	//delete
	@Override
	public void DeleteId(Integer id) {
		payLoadRepo.deleteById(id);
	}

	//get by shipperId

	@Override
	public Optional<Payload> getByShipperId(String ShipperId) {
		
		return payLoadRepo.findByShipperid(ShipperId);
	}


	

	
	
	

}
