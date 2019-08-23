package com.ncs.asset.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncs.asset.model.Asset;
import com.ncs.asset.repository.AssetsRepository;
import com.ncs.asset.repository.DiscardRepository;
import com.ncs.asset.services.interfaces.DiscardAssets;

@Service
public class DiscardImpl implements DiscardAssets {
	
	
	@Autowired
	private AssetsRepository repo;
	
//	public Asset discardAsset(Asset asset, Long assetId)
//	
//	
//    {
//		
//		if(repo.findById(assetId).isPresent())
//		{
//			Asset a = repo.findById(assetId).get();
//			a.setReason(a.getReason());
//			a.setStatus(a.getStatus());
//			
//			Asset updateAsset = repo.save(a);
//			return updateAsset;
//		}
//		return null;
//		
//   
//		
//
//    }

	@Override
	public Asset updateStatus(Asset assets, Long assetId) {
		
		Asset asset1 = repo.findById(assetId).get();
		asset1.setStatus(assets.getStatus());
		asset1.setReason(assets.getReason());
		
		Asset asset2 = repo.save(asset1);
		
		
		
		return asset2;
	}
	
	
//	public AssetTransfer approveAssetTransfer(AssetTransfer ast1,Long id)
//    {
//   Long id1=ast1.getAssetId();
//  
//   //if (asset.findById(id1).isPresent()){
//       AssetTransfer ast=asset.findById(id).get();
//       ast.setStatus("approved");
//        
//       AssetTransfer ast2=asset.save(ast);
//       
//   return ast2;
//       
//   }

}
