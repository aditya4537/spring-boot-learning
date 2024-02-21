package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MobileData;
import com.example.demo.repository.MobileRepository;

@Service
public class MobileImpl implements Mobile {

	@Autowired
	private MobileRepository mr;

	@Override
	public List<MobileData> details() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public void save(MobileData mobile) {
		// TODO Auto-generated method stub
		System.out.println(mobile);
		mr.save(mobile);
	}

	@Override
	public void delete(int imei) {
		// TODO Auto-generated method stub
		mr.deleteById(imei);
	}
	
	@Override
	public Map<String, Object> edit(Integer imei) {
		MobileData md = mr.findById(imei).get();
		
		Map<String, Object> mobiles = new HashMap<String, Object>();
		
		mobiles.put("imei", md.getImei());
		mobiles.put("name", md.getName());
		mobiles.put("company", md.getCompany());
		mobiles.put("campix", md.getCampix());
		mobiles.put("ram", md.getRam());
		mobiles.put("rom", md.getRom());
		mobiles.put("processor", md.getProcessor());
		mobiles.put("display", md.getDisplay());
	
		System.err.println(mobiles);
		
		return mobiles;
	}

//	@Override
//	public MobileData get(int imei) {
//		// TODO Auto-generated method stub
//		return mr.findById(imei).get();
//	}

}
