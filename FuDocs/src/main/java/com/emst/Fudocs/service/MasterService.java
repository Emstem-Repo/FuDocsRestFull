package com.emst.Fudocs.service;

import java.util.List;

import com.emst.Fudocs.dto.AcademicYearDTO;
import com.emst.Fudocs.model.AcademicYear;

public interface MasterService {
	
	public AcademicYearDTO addAcademicYear(AcademicYearDTO academicYear);
	
	public List<AcademicYearDTO> findAllAcademicYear();
	
	public AcademicYearDTO updateAcademicYear(AcademicYearDTO academicYear);
	
	public AcademicYear findById(Long id);
	
	public void deleteAcademicYearById(Long id);
	

}
