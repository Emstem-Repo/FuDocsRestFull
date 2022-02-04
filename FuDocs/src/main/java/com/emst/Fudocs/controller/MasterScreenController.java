package com.emst.Fudocs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emst.Fudocs.dto.AcademicYearDTO;
import com.emst.Fudocs.model.AcademicYear;
import com.emst.Fudocs.service.MasterService;

@RestController
@RequestMapping("/academicYearMaster")
public class MasterScreenController {
	
	private Logger log = LoggerFactory.getLogger(MasterScreenController.class);
	
	@Autowired
	private MasterService masterService;
	
	@PostMapping("/addAcademicYear")
	public ResponseEntity<AcademicYearDTO> AddAcademicYear(@RequestBody AcademicYearDTO academicYear){
		log.info("inside add academicyear");
		
		AcademicYearDTO acYear=masterService.addAcademicYear(academicYear);
		//AcademicYearDTO acYear=new AcademicYearDTO();
		return ResponseEntity.ok().body(acYear);
		
	}
	
	@GetMapping("/getAcademicYear")
	public ResponseEntity<List<AcademicYearDTO>> getEmployee(){
		log.info("inside getEmployee() in EmployeeController class");
		List<AcademicYearDTO> emp = masterService.findAllAcademicYear();
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	@PostMapping("/updateAcademicYear")
	public ResponseEntity<AcademicYearDTO> updateAcademicYear(@RequestBody AcademicYearDTO academicYear){
		log.info("inside addacademicyear");
		
		AcademicYearDTO acYear=masterService.updateAcademicYear(academicYear);
		return ResponseEntity.ok().body(acYear);
		
	}
	@PostMapping("/deleteAcademicYear/{id}")
	public ResponseEntity<?> deleteAcademicYear(@PathVariable Long id){
		log.info("inside add deleteAcademicYear");
		
		masterService.deleteAcademicYearById(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
