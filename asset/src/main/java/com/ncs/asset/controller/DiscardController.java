package com.ncs.asset.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.asset.model.Asset;
import com.ncs.asset.repository.AssetsRepository;

@RestController
@RequestMapping("/asset")

public class DiscardController {
	
	@Autowired
	private AssetsRepository repo;
	
       @PostMapping(value = "/discard")
	
     public Asset discard( @Valid @RequestBody Asset asset)
	{
		   asset.setStatus(asset.getStatus());  
		   asset.setReason(asset.getReason());
           Asset upatedStatus = repo.save(asset);
	       return upatedStatus;
	}
	/*@GetMapping("/get")
 public List<Asset> getAll()
 {
	return repo.findAll();
	 
	 
 }*/
	
}
