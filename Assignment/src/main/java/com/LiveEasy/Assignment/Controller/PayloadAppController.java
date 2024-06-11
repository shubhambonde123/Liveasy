package com.LiveEasy.Assignment.Controller;


import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.LiveEasy.Assignment.Sevice.PayloadServiceImpl;
import com.LiveEasy.Assignment.model.Payload;

@RestController 
@RequestMapping("/Liveasy")
public class PayloadAppController {
	
	@Autowired
	private PayloadServiceImpl payloadServiceImpl;
	
	
	
	@PostMapping("/load")
	public ResponseEntity<String> savedata(@RequestBody Payload payload){
//		UUID uuid=UUID.randomUUID();
//		payload.setShipperid(uuid);
		Payload p=payloadServiceImpl.PayloadGetdata(payload);
		return ResponseEntity.ok("payload data added sucessfully......");
	}
		
	
	
	@PutMapping("/load/{id}")
	public ResponseEntity<Payload> Updatedata(@RequestBody Payload payload){
		Payload v=payloadServiceImpl.Updatedata(payload);
		return ResponseEntity.ok().body(v);
	}
	
	
	
	
	@GetMapping("/load/{id}")
	public ResponseEntity<Optional<Payload>> findbyid(@PathVariable ("id") Integer id){
		Optional<Payload> p= payloadServiceImpl.getbyid(id);
		return ResponseEntity.ok().body(p);
	}
	
	@DeleteMapping("/load/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Integer vid) {
		payloadServiceImpl.DeleteId(vid);
		return ResponseEntity.ok().body("Sucessfully Deleted By Id .........! ");
	}
	
	@GetMapping("/loading/{id}")
	public ResponseEntity<Optional<Payload>> findbyShipperid(@PathVariable ("id") String id){
		Optional<Payload> p= payloadServiceImpl.getByShipperId(id);
		return ResponseEntity.ok().body(p);
	}
	
}
