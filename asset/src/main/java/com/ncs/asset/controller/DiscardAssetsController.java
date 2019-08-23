package com.ncs.asset.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.asset.model.Asset;
import com.ncs.asset.repository.AssetsRepository;
import com.ncs.asset.services.implementation.DiscardImpl;

@RestController
public class DiscardAssetsController {
	
	@Autowired
	private DiscardImpl impl;

	
	@PutMapping(value = "/assets/{assetId}")
	public ResponseEntity<Asset> discradAsset(@Valid @RequestBody Asset asset, @PathVariable Long assetId)
	{
		asset = impl.updateStatus(asset, assetId);
		return ResponseEntity.ok(asset);
		
	}
}

	
//	 @PutMapping("/assetTransfers/{id}")
//     public ResponseEntity<AssetTransfer> approveAssetTransfer(@Valid @RequestBody AssetTransfer asset,@PathVariable Long id)
//    
//     {
//        //  id=asset.getAssetId();
//         asset=assetTransfer.approveAssetTransfer(asset, id);
//         return ResponseEntity.ok(asset);
//       
//         //return assetTransfer.getAllAssetData();
//        
//     }