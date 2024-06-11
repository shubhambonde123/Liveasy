package com.LiveEasy.Assignment.Dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.LiveEasy.Assignment.model.Payload;

@Repository
public interface PayLoadRepo extends JpaRepository<Payload, Integer>{

	
	  Optional<Payload> findByShipperid(String shipperid);
}
