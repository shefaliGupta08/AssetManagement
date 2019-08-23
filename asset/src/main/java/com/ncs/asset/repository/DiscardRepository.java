package com.ncs.asset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.ncs.asset.model.Asset;

@Service

public interface DiscardRepository extends JpaRepository<Asset, Long>{
	
	
	

}


