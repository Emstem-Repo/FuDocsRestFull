package com.emst.Fudocs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emst.Fudocs.dto.AcademicYearDTO;
import com.emst.Fudocs.exception.BusinessBusiness;
import com.emst.Fudocs.model.AcademicYear;
import com.emst.Fudocs.repository.MasterRepository;
import com.emst.Fudocs.service.MasterService;


@Service
public class MasterServiceImpl implements MasterService {
	private Logger log = LoggerFactory.getLogger(MasterServiceImpl.class);
	
	@Autowired
	private MasterRepository masterRepo;
	
	@Override
	public AcademicYearDTO addAcademicYear(AcademicYearDTO dto) {
		log.info("inside addAcademicYear() in MasterServiceImpl class");
		AcademicYear acYear=null;
		AcademicYearDTO to=new AcademicYearDTO();
		try {
			AcademicYear bo=new AcademicYear();
				bo.setDataEntries(dto.getDataEntries());
				bo.setYear(dto.getYear());
				acYear=masterRepo.save(bo);
				if (acYear!=null) {
					
					to.setId(acYear.getId());
					to.setDataEntries(acYear.getDataEntries());
					to.setYear(acYear.getYear());
				}
				
		} catch (Exception e) {
			throw new BusinessBusiness(e.getMessage());
		}
				
		return to;
	}

	@Override
	public List<AcademicYearDTO> findAllAcademicYear() {
		log.info("inside findAllAcademicYear() in MasterServiceImpl class");
		List<AcademicYear> acyearList=new ArrayList();
		List<AcademicYearDTO> dtoList=new ArrayList();
		try {
			acyearList=masterRepo.findAll();
			//BeanUtils.copyProperties(acyearList, dtoList);
			/*
			 * acyearList.forEach(obj ->{ AcademicYearDTO newobj=new AcademicYearDTO();
			 * newobj.setId(obj.getId()); newobj.setDataEntries(obj.getDataEntries());
			 * newobj.setYear(obj.getYear()); });
			 */
			for (AcademicYear bo : acyearList) {
				AcademicYearDTO dto=new AcademicYearDTO();
				dto.setId(bo.getId());
				dto.setDataEntries(bo.getDataEntries());
				dto.setYear(bo.getYear());
				dtoList.add(dto);
			}
			
		} catch (Exception e) {
			throw new BusinessBusiness(e.getMessage());
		}
		
		return dtoList;
	}

	@Override
	public AcademicYearDTO updateAcademicYear(AcademicYearDTO dto) {
		log.info("inside updateAcademicYear() in MasterServiceImpl class");
		AcademicYear acYear=null;
		AcademicYearDTO to=new AcademicYearDTO();
		try {
				AcademicYear bo=masterRepo.findById(dto.getId());
				bo.setId(dto.getId());
				bo.setDataEntries(dto.getDataEntries());
				bo.setYear(dto.getYear());
				acYear=masterRepo.save(bo);
				if (acYear!=null) {
					
					to.setId(acYear.getId());
					to.setDataEntries(acYear.getDataEntries());
					to.setYear(acYear.getYear());
				}
				
		} catch (Exception e) {
			throw new BusinessBusiness(e.getMessage());
		}
				
		return to;
	}

	@Override
	public AcademicYear findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAcademicYearById(Long id) {
		log.info("inside deleteAcademicYearById() in MasterServiceImpl class");
		try {
			masterRepo.deleteById(id);
		} catch (Exception e) {
			throw new BusinessBusiness(e.getMessage());
		}

	}

}
