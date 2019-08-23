package com.ncs.asset.repository;

import com.ncs.asset.model.Asset;
import com.ncs.asset.model.Location;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository  extends JpaRepository<Asset, Long> {
	
   //List<Asset> findAllById(Iterable<Integer> assetId); 
}
