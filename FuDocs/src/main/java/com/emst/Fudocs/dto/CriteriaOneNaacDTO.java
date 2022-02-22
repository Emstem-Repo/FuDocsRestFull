package com.emst.Fudocs.dto;

import java.io.File;
import java.util.List;

public class CriteriaOneNaacDTO {
	
	private String description;
	private String minutesOfMeetingCurriculamCommiteeLink;
	private File minutesOfMeetingCurriculamCommiteeFile;
	private String curriculamPlanningReleventInfoLink;
	private File curriculamPlanningReleventInfoFile;
	//component 1.1.2
	public String noofTeacher1;
    public String noofTeacher2;
    public String noofTeacher3;
    public String noofTeacher4;
    public String noofTeacher5;
    private File teacherBosParticipatedInbos;
    private List<Object> teacherBosParticipatedInbonum;
    private File teacherparticipatedinAcademiccouncil;
    private List<Object> teacherparticipatedinAcademiccouncilnum;
    private File participationreleventInfo;
    
    //component 1.2
    public String coursesOfferedDuringLastYear;
    public String trainingOfferedLastFiveYear;
    private File institutionalDataPrescribed;
    private List<Object> institutionalData;
    private File listOfProgrammesDuringLastFiveYears; 
    private List<Object> programInfo;
    private File listOfCoursesTrainingWereOfferedYarWise;
    private File minutesOfRelevantAcademicCouncilMeetings; 
    private File departmentTrainingOtherRelevantInfo;
    
    //component 1.2.2
    private List<Object> coursesvstotalstudents;
    private File studentsEnrolledInTheValueAddedCourses;
    private File coursesvstotalstudentsReleventInfo;
    
    //component 1.3.1
    private String curriculamEnrichmentDescription; 
    private String curriculamEnrichListOfCoursesLink; 
    private File curriculamEnrichListOfCoursesFile;
    private String curriculamEnrichmentReleventInfoLink; 
    private File curriculamEnrichListOfReleventInfoFile;
    
    //component 1.3.2
    private String[] valueaddedOffered;
    private File valueAddedCoureseInstitutionalFile;
    private List<Object> valueAddedCoureseInstitutionalList;
    private File brochureOrOtherDocumentsOfvalueAddedCourses;
    private File valueAddedCouresesLastFiveYear;
    private File valueAddedCouresesStudentList;
    private File valueAddedCouresesReleventInfo;
    
    //component 1.3.3
    
    private String[] nOfStudentsOfavrgValueAdded;
    private String[] totalNOfStudentsOfavrgValueAdded;
    private String[] nOfStudentsOfavrgValueAddedLink;
    private File detailsOfstudentsEnrolledInValueAdded;
    private File detailsOfstudentsEnrolledInValueAddedreleventInfo;
    
    //component 1.3.4
    private File percentageOfStudentsFieldVisitFile;
    private List<Object> fieldVisitList;
    public List<Object> program;
    private String totalNostudUndertakingVisits;
    private  String totalNostudUndertakingClinicaalVisits;
    private String totalNostudUndertakingResearchProject;
    private String totalNostudUndertakingIndustryVisits;
    private String totalNostudUndertakingCommunityPosting;
    private String totalNostudUndertakingInAll;
    private File docShownostudUndertakingInAll;
    private File nostudUndertakingInAll;
    private File fieldVisitReleventInfo;
    
    //component 1.4..1
    private boolean structerdFeedBackStudent;
    private boolean structeredFeedBackTeachers;
    private boolean structeredFeedBackEmployers;
    private boolean structeredFeedBackAlumni;
    private boolean structeredFeedBackProfessionals;
    private String structeredFeeBackLink;
    private File structeredFeeBackFile;
    private File structeredFeeBackRelevent;
    
    //component 1.4.2
    private boolean feedBackwebSite;
    private boolean feedbackCollectAnalyzeAction;
    private boolean feedbackCollectAnalyze;
    private boolean feedbackCollect;
    private String optionsBasedFeeBackLink;
    private File optionsBasedFeeBackFile;
    private File optionsBasedFeeBackRelevent;
    
    
    
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMinutesOfMeetingCurriculamCommiteeLink() {
		return minutesOfMeetingCurriculamCommiteeLink;
	}
	public void setMinutesOfMeetingCurriculamCommiteeLink(String minutesOfMeetingCurriculamCommiteeLink) {
		this.minutesOfMeetingCurriculamCommiteeLink = minutesOfMeetingCurriculamCommiteeLink;
	}
	public File getMinutesOfMeetingCurriculamCommiteeFile() {
		return minutesOfMeetingCurriculamCommiteeFile;
	}
	public void setMinutesOfMeetingCurriculamCommiteeFile(File minutesOfMeetingCurriculamCommiteeFile) {
		this.minutesOfMeetingCurriculamCommiteeFile = minutesOfMeetingCurriculamCommiteeFile;
	}
	public String getCurriculamPlanningReleventInfoLink() {
		return curriculamPlanningReleventInfoLink;
	}
	public void setCurriculamPlanningReleventInfoLink(String curriculamPlanningReleventInfoLink) {
		this.curriculamPlanningReleventInfoLink = curriculamPlanningReleventInfoLink;
	}
	public File getCurriculamPlanningReleventInfoFile() {
		return curriculamPlanningReleventInfoFile;
	}
	public void setCurriculamPlanningReleventInfoFile(File curriculamPlanningReleventInfoFile) {
		this.curriculamPlanningReleventInfoFile = curriculamPlanningReleventInfoFile;
	}
	public String getNoofTeacher1() {
		return noofTeacher1;
	}
	public void setNoofTeacher1(String noofTeacher1) {
		this.noofTeacher1 = noofTeacher1;
	}
	public String getNoofTeacher2() {
		return noofTeacher2;
	}
	public void setNoofTeacher2(String noofTeacher2) {
		this.noofTeacher2 = noofTeacher2;
	}
	public String getNoofTeacher3() {
		return noofTeacher3;
	}
	public void setNoofTeacher3(String noofTeacher3) {
		this.noofTeacher3 = noofTeacher3;
	}
	public String getNoofTeacher4() {
		return noofTeacher4;
	}
	public void setNoofTeacher4(String noofTeacher4) {
		this.noofTeacher4 = noofTeacher4;
	}
	public String getNoofTeacher5() {
		return noofTeacher5;
	}
	public void setNoofTeacher5(String noofTeacher5) {
		this.noofTeacher5 = noofTeacher5;
	}
	public File getTeacherBosParticipatedInbos() {
		return teacherBosParticipatedInbos;
	}
	public void setTeacherBosParticipatedInbos(File teacherBosParticipatedInbos) {
		this.teacherBosParticipatedInbos = teacherBosParticipatedInbos;
	}
	public List<Object> getTeacherBosParticipatedInbonum() {
		return teacherBosParticipatedInbonum;
	}
	public void setTeacherBosParticipatedInbonum(List<Object> teacherBosParticipatedInbonum) {
		this.teacherBosParticipatedInbonum = teacherBosParticipatedInbonum;
	}
	public File getTeacherparticipatedinAcademiccouncil() {
		return teacherparticipatedinAcademiccouncil;
	}
	public void setTeacherparticipatedinAcademiccouncil(File teacherparticipatedinAcademiccouncil) {
		this.teacherparticipatedinAcademiccouncil = teacherparticipatedinAcademiccouncil;
	}
	public List<Object> getTeacherparticipatedinAcademiccouncilnum() {
		return teacherparticipatedinAcademiccouncilnum;
	}
	public void setTeacherparticipatedinAcademiccouncilnum(List<Object> teacherparticipatedinAcademiccouncilnum) {
		this.teacherparticipatedinAcademiccouncilnum = teacherparticipatedinAcademiccouncilnum;
	}
	public File getParticipationreleventInfo() {
		return participationreleventInfo;
	}
	public void setParticipationreleventInfo(File participationreleventInfo) {
		this.participationreleventInfo = participationreleventInfo;
	}
	public String getCoursesOfferedDuringLastYear() {
		return coursesOfferedDuringLastYear;
	}
	public void setCoursesOfferedDuringLastYear(String coursesOfferedDuringLastYear) {
		this.coursesOfferedDuringLastYear = coursesOfferedDuringLastYear;
	}
	public String getTrainingOfferedLastFiveYear() {
		return trainingOfferedLastFiveYear;
	}
	public void setTrainingOfferedLastFiveYear(String trainingOfferedLastFiveYear) {
		this.trainingOfferedLastFiveYear = trainingOfferedLastFiveYear;
	}
	public File getInstitutionalDataPrescribed() {
		return institutionalDataPrescribed;
	}
	public void setInstitutionalDataPrescribed(File institutionalDataPrescribed) {
		this.institutionalDataPrescribed = institutionalDataPrescribed;
	}
	public List<Object> getInstitutionalData() {
		return institutionalData;
	}
	public void setInstitutionalData(List<Object> institutionalData) {
		this.institutionalData = institutionalData;
	}
	public File getListOfProgrammesDuringLastFiveYears() {
		return listOfProgrammesDuringLastFiveYears;
	}
	public void setListOfProgrammesDuringLastFiveYears(File listOfProgrammesDuringLastFiveYears) {
		this.listOfProgrammesDuringLastFiveYears = listOfProgrammesDuringLastFiveYears;
	}
	public List<Object> getProgramInfo() {
		return programInfo;
	}
	public void setProgramInfo(List<Object> programInfo) {
		this.programInfo = programInfo;
	}
	public File getListOfCoursesTrainingWereOfferedYarWise() {
		return listOfCoursesTrainingWereOfferedYarWise;
	}
	public void setListOfCoursesTrainingWereOfferedYarWise(File listOfCoursesTrainingWereOfferedYarWise) {
		this.listOfCoursesTrainingWereOfferedYarWise = listOfCoursesTrainingWereOfferedYarWise;
	}
	public File getMinutesOfRelevantAcademicCouncilMeetings() {
		return minutesOfRelevantAcademicCouncilMeetings;
	}
	public void setMinutesOfRelevantAcademicCouncilMeetings(File minutesOfRelevantAcademicCouncilMeetings) {
		this.minutesOfRelevantAcademicCouncilMeetings = minutesOfRelevantAcademicCouncilMeetings;
	}
	public File getDepartmentTrainingOtherRelevantInfo() {
		return departmentTrainingOtherRelevantInfo;
	}
	public void setDepartmentTrainingOtherRelevantInfo(File departmentTrainingOtherRelevantInfo) {
		this.departmentTrainingOtherRelevantInfo = departmentTrainingOtherRelevantInfo;
	}
	public List<Object> getCoursesvstotalstudents() {
		return coursesvstotalstudents;
	}
	public void setCoursesvstotalstudents(List<Object> coursesvstotalstudents) {
		this.coursesvstotalstudents = coursesvstotalstudents;
	}
	public File getStudentsEnrolledInTheValueAddedCourses() {
		return studentsEnrolledInTheValueAddedCourses;
	}
	public void setStudentsEnrolledInTheValueAddedCourses(File studentsEnrolledInTheValueAddedCourses) {
		this.studentsEnrolledInTheValueAddedCourses = studentsEnrolledInTheValueAddedCourses;
	}
	public File getCoursesvstotalstudentsReleventInfo() {
		return coursesvstotalstudentsReleventInfo;
	}
	public void setCoursesvstotalstudentsReleventInfo(File coursesvstotalstudentsReleventInfo) {
		this.coursesvstotalstudentsReleventInfo = coursesvstotalstudentsReleventInfo;
	}
	public String getCurriculamEnrichmentDescription() {
		return curriculamEnrichmentDescription;
	}
	public void setCurriculamEnrichmentDescription(String curriculamEnrichmentDescription) {
		this.curriculamEnrichmentDescription = curriculamEnrichmentDescription;
	}
	public String getCurriculamEnrichListOfCoursesLink() {
		return curriculamEnrichListOfCoursesLink;
	}
	public void setCurriculamEnrichListOfCoursesLink(String curriculamEnrichListOfCoursesLink) {
		this.curriculamEnrichListOfCoursesLink = curriculamEnrichListOfCoursesLink;
	}
	public File getCurriculamEnrichListOfCoursesFile() {
		return curriculamEnrichListOfCoursesFile;
	}
	public void setCurriculamEnrichListOfCoursesFile(File curriculamEnrichListOfCoursesFile) {
		this.curriculamEnrichListOfCoursesFile = curriculamEnrichListOfCoursesFile;
	}
	public String getCurriculamEnrichmentReleventInfoLink() {
		return curriculamEnrichmentReleventInfoLink;
	}
	public void setCurriculamEnrichmentReleventInfoLink(String curriculamEnrichmentReleventInfoLink) {
		this.curriculamEnrichmentReleventInfoLink = curriculamEnrichmentReleventInfoLink;
	}
	public File getCurriculamEnrichListOfReleventInfoFile() {
		return curriculamEnrichListOfReleventInfoFile;
	}
	public void setCurriculamEnrichListOfReleventInfoFile(File curriculamEnrichListOfReleventInfoFile) {
		this.curriculamEnrichListOfReleventInfoFile = curriculamEnrichListOfReleventInfoFile;
	}
	public String[] getValueaddedOffered() {
		return valueaddedOffered;
	}
	public void setValueaddedOffered(String[] valueaddedOffered) {
		this.valueaddedOffered = valueaddedOffered;
	}
	public File getValueAddedCoureseInstitutionalFile() {
		return valueAddedCoureseInstitutionalFile;
	}
	public void setValueAddedCoureseInstitutionalFile(File valueAddedCoureseInstitutionalFile) {
		this.valueAddedCoureseInstitutionalFile = valueAddedCoureseInstitutionalFile;
	}
	public List<Object> getValueAddedCoureseInstitutionalList() {
		return valueAddedCoureseInstitutionalList;
	}
	public void setValueAddedCoureseInstitutionalList(List<Object> valueAddedCoureseInstitutionalList) {
		this.valueAddedCoureseInstitutionalList = valueAddedCoureseInstitutionalList;
	}
	public File getBrochureOrOtherDocumentsOfvalueAddedCourses() {
		return brochureOrOtherDocumentsOfvalueAddedCourses;
	}
	public void setBrochureOrOtherDocumentsOfvalueAddedCourses(File brochureOrOtherDocumentsOfvalueAddedCourses) {
		this.brochureOrOtherDocumentsOfvalueAddedCourses = brochureOrOtherDocumentsOfvalueAddedCourses;
	}
	public File getValueAddedCouresesLastFiveYear() {
		return valueAddedCouresesLastFiveYear;
	}
	public void setValueAddedCouresesLastFiveYear(File valueAddedCouresesLastFiveYear) {
		this.valueAddedCouresesLastFiveYear = valueAddedCouresesLastFiveYear;
	}
	public File getValueAddedCouresesStudentList() {
		return valueAddedCouresesStudentList;
	}
	public void setValueAddedCouresesStudentList(File valueAddedCouresesStudentList) {
		this.valueAddedCouresesStudentList = valueAddedCouresesStudentList;
	}
	public File getValueAddedCouresesReleventInfo() {
		return valueAddedCouresesReleventInfo;
	}
	public void setValueAddedCouresesReleventInfo(File valueAddedCouresesReleventInfo) {
		this.valueAddedCouresesReleventInfo = valueAddedCouresesReleventInfo;
	}
	public String[] getnOfStudentsOfavrgValueAdded() {
		return nOfStudentsOfavrgValueAdded;
	}
	public void setnOfStudentsOfavrgValueAdded(String[] nOfStudentsOfavrgValueAdded) {
		this.nOfStudentsOfavrgValueAdded = nOfStudentsOfavrgValueAdded;
	}
	public String[] getTotalNOfStudentsOfavrgValueAdded() {
		return totalNOfStudentsOfavrgValueAdded;
	}
	public void setTotalNOfStudentsOfavrgValueAdded(String[] totalNOfStudentsOfavrgValueAdded) {
		this.totalNOfStudentsOfavrgValueAdded = totalNOfStudentsOfavrgValueAdded;
	}
	public String[] getnOfStudentsOfavrgValueAddedLink() {
		return nOfStudentsOfavrgValueAddedLink;
	}
	public void setnOfStudentsOfavrgValueAddedLink(String[] nOfStudentsOfavrgValueAddedLink) {
		this.nOfStudentsOfavrgValueAddedLink = nOfStudentsOfavrgValueAddedLink;
	}
	public File getDetailsOfstudentsEnrolledInValueAdded() {
		return detailsOfstudentsEnrolledInValueAdded;
	}
	public void setDetailsOfstudentsEnrolledInValueAdded(File detailsOfstudentsEnrolledInValueAdded) {
		this.detailsOfstudentsEnrolledInValueAdded = detailsOfstudentsEnrolledInValueAdded;
	}
	public File getDetailsOfstudentsEnrolledInValueAddedreleventInfo() {
		return detailsOfstudentsEnrolledInValueAddedreleventInfo;
	}
	public void setDetailsOfstudentsEnrolledInValueAddedreleventInfo(
			File detailsOfstudentsEnrolledInValueAddedreleventInfo) {
		this.detailsOfstudentsEnrolledInValueAddedreleventInfo = detailsOfstudentsEnrolledInValueAddedreleventInfo;
	}
	public File getPercentageOfStudentsFieldVisitFile() {
		return percentageOfStudentsFieldVisitFile;
	}
	public void setPercentageOfStudentsFieldVisitFile(File percentageOfStudentsFieldVisitFile) {
		this.percentageOfStudentsFieldVisitFile = percentageOfStudentsFieldVisitFile;
	}
	public List<Object> getFieldVisitList() {
		return fieldVisitList;
	}
	public void setFieldVisitList(List<Object> fieldVisitList) {
		this.fieldVisitList = fieldVisitList;
	}
	public List<Object> getProgram() {
		return program;
	}
	public void setProgram(List<Object> program) {
		this.program = program;
	}
	public String getTotalNostudUndertakingVisits() {
		return totalNostudUndertakingVisits;
	}
	public void setTotalNostudUndertakingVisits(String totalNostudUndertakingVisits) {
		this.totalNostudUndertakingVisits = totalNostudUndertakingVisits;
	}
	public String getTotalNostudUndertakingClinicaalVisits() {
		return totalNostudUndertakingClinicaalVisits;
	}
	public void setTotalNostudUndertakingClinicaalVisits(String totalNostudUndertakingClinicaalVisits) {
		this.totalNostudUndertakingClinicaalVisits = totalNostudUndertakingClinicaalVisits;
	}
	public String getTotalNostudUndertakingResearchProject() {
		return totalNostudUndertakingResearchProject;
	}
	public void setTotalNostudUndertakingResearchProject(String totalNostudUndertakingResearchProject) {
		this.totalNostudUndertakingResearchProject = totalNostudUndertakingResearchProject;
	}
	public String getTotalNostudUndertakingIndustryVisits() {
		return totalNostudUndertakingIndustryVisits;
	}
	public void setTotalNostudUndertakingIndustryVisits(String totalNostudUndertakingIndustryVisits) {
		this.totalNostudUndertakingIndustryVisits = totalNostudUndertakingIndustryVisits;
	}
	public String getTotalNostudUndertakingCommunityPosting() {
		return totalNostudUndertakingCommunityPosting;
	}
	public void setTotalNostudUndertakingCommunityPosting(String totalNostudUndertakingCommunityPosting) {
		this.totalNostudUndertakingCommunityPosting = totalNostudUndertakingCommunityPosting;
	}
	public String getTotalNostudUndertakingInAll() {
		return totalNostudUndertakingInAll;
	}
	public void setTotalNostudUndertakingInAll(String totalNostudUndertakingInAll) {
		this.totalNostudUndertakingInAll = totalNostudUndertakingInAll;
	}
	public File getDocShownostudUndertakingInAll() {
		return docShownostudUndertakingInAll;
	}
	public void setDocShownostudUndertakingInAll(File docShownostudUndertakingInAll) {
		this.docShownostudUndertakingInAll = docShownostudUndertakingInAll;
	}
	public File getNostudUndertakingInAll() {
		return nostudUndertakingInAll;
	}
	public void setNostudUndertakingInAll(File nostudUndertakingInAll) {
		this.nostudUndertakingInAll = nostudUndertakingInAll;
	}
	public File getFieldVisitReleventInfo() {
		return fieldVisitReleventInfo;
	}
	public void setFieldVisitReleventInfo(File fieldVisitReleventInfo) {
		this.fieldVisitReleventInfo = fieldVisitReleventInfo;
	}
	public boolean isStructerdFeedBackStudent() {
		return structerdFeedBackStudent;
	}
	public void setStructerdFeedBackStudent(boolean structerdFeedBackStudent) {
		this.structerdFeedBackStudent = structerdFeedBackStudent;
	}
	public boolean isStructeredFeedBackTeachers() {
		return structeredFeedBackTeachers;
	}
	public void setStructeredFeedBackTeachers(boolean structeredFeedBackTeachers) {
		this.structeredFeedBackTeachers = structeredFeedBackTeachers;
	}
	public boolean isStructeredFeedBackEmployers() {
		return structeredFeedBackEmployers;
	}
	public void setStructeredFeedBackEmployers(boolean structeredFeedBackEmployers) {
		this.structeredFeedBackEmployers = structeredFeedBackEmployers;
	}
	public boolean isStructeredFeedBackAlumni() {
		return structeredFeedBackAlumni;
	}
	public void setStructeredFeedBackAlumni(boolean structeredFeedBackAlumni) {
		this.structeredFeedBackAlumni = structeredFeedBackAlumni;
	}
	public boolean isStructeredFeedBackProfessionals() {
		return structeredFeedBackProfessionals;
	}
	public void setStructeredFeedBackProfessionals(boolean structeredFeedBackProfessionals) {
		this.structeredFeedBackProfessionals = structeredFeedBackProfessionals;
	}
	public String getStructeredFeeBackLink() {
		return structeredFeeBackLink;
	}
	public void setStructeredFeeBackLink(String structeredFeeBackLink) {
		this.structeredFeeBackLink = structeredFeeBackLink;
	}
	public File getStructeredFeeBackFile() {
		return structeredFeeBackFile;
	}
	public void setStructeredFeeBackFile(File structeredFeeBackFile) {
		this.structeredFeeBackFile = structeredFeeBackFile;
	}
	public File getStructeredFeeBackRelevent() {
		return structeredFeeBackRelevent;
	}
	public void setStructeredFeeBackRelevent(File structeredFeeBackRelevent) {
		this.structeredFeeBackRelevent = structeredFeeBackRelevent;
	}
	public boolean isFeedBackwebSite() {
		return feedBackwebSite;
	}
	public void setFeedBackwebSite(boolean feedBackwebSite) {
		this.feedBackwebSite = feedBackwebSite;
	}
	public boolean isFeedbackCollectAnalyzeAction() {
		return feedbackCollectAnalyzeAction;
	}
	public void setFeedbackCollectAnalyzeAction(boolean feedbackCollectAnalyzeAction) {
		this.feedbackCollectAnalyzeAction = feedbackCollectAnalyzeAction;
	}
	public boolean isFeedbackCollectAnalyze() {
		return feedbackCollectAnalyze;
	}
	public void setFeedbackCollectAnalyze(boolean feedbackCollectAnalyze) {
		this.feedbackCollectAnalyze = feedbackCollectAnalyze;
	}
	public boolean isFeedbackCollect() {
		return feedbackCollect;
	}
	public void setFeedbackCollect(boolean feedbackCollect) {
		this.feedbackCollect = feedbackCollect;
	}
	public String getOptionsBasedFeeBackLink() {
		return optionsBasedFeeBackLink;
	}
	public void setOptionsBasedFeeBackLink(String optionsBasedFeeBackLink) {
		this.optionsBasedFeeBackLink = optionsBasedFeeBackLink;
	}
	public File getOptionsBasedFeeBackFile() {
		return optionsBasedFeeBackFile;
	}
	public void setOptionsBasedFeeBackFile(File optionsBasedFeeBackFile) {
		this.optionsBasedFeeBackFile = optionsBasedFeeBackFile;
	}
	public File getOptionsBasedFeeBackRelevent() {
		return optionsBasedFeeBackRelevent;
	}
	public void setOptionsBasedFeeBackRelevent(File optionsBasedFeeBackRelevent) {
		this.optionsBasedFeeBackRelevent = optionsBasedFeeBackRelevent;
	}
	
    
	
	
	
	

}
