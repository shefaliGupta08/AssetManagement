package com.ncs.asset.controller;

import java.util.List;
import java.util.Optional;

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

import com.ncs.asset.model.AssetGroup;
import com.ncs.asset.repository.AssetGroupRepository;

@RestController
public class AssetGroupController {
	
	@Autowired
	private AssetGroupRepository repo;
	
	@GetMapping(value = "/assetGroups")
	public List<AssetGroup> getGroupAsset()
	{
		return repo.findAll();
	}
	
	@PostMapping(value = "/assetGroups")
	public AssetGroup createGroupList(@RequestBody AssetGroup asset)
	{
		return repo.save(asset);
	}
	
	@DeleteMapping(value = "/assetGroups/{groupId}")
	public void deleteAssetGroup(@PathVariable Long groupId)
	{
		repo.deleteById(groupId);
	}
	
	@PutMapping(value = "/assetGroups/{groupId}")
	public ResponseEntity<AssetGroup> updateAssetGroup(@RequestBody AssetGroup assetGroup, @PathVariable long groupId )
	{
		 Optional<AssetGroup> asset = repo.findById(groupId);
		 
		 if(! asset.isPresent())
			 return ResponseEntity.notFound().build();
		 
		 assetGroup.setGroupName(assetGroup.getGroupName());
		 
		 repo.save(assetGroup);
		 
		 return ResponseEntity.ok(assetGroup);
		
}
	
	
	

	
	
}
