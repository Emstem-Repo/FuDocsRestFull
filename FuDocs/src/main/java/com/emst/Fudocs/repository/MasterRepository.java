package com.emst.Fudocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emst.Fudocs.model.AcademicYear;

@Repository
public interface MasterRepository extends JpaRepository<AcademicYear, Long> {

	AcademicYear findById(long id);
	//public AcademicYear findAcademicYear(Long id);

	//public void deleteAcademicYearById(Long id);

}
