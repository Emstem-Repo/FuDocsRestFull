package com.emst.Fudocs.service;

import java.util.List;

import com.emst.Fudocs.dto.CriteriaOneNaacDTO;


public interface FirstCriteriaService {
	
	public CriteriaOneNaacDTO addCriteria(CriteriaOneNaacDTO firstCriteria);
	
	public List<CriteriaOneNaacDTO> findAllCriteria();
	
	public CriteriaOneNaacDTO updateCriteria(CriteriaOneNaacDTO firstCriteria);
	
	public CriteriaOneNaacDTO findById(Long id);
	
	public void deleteCriteriaById(Long id);
	

}
