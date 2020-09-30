package org.ibm.reva.student.controller;

@org.springframework.stereotype.Controller
public class StudentController {
	
	// this will inject DAO from the xml
	@org.springframework.beans.factory.annotation.Autowired
	org.ibm.reva.student.dao.StudentDao studentDao;
	
	// it displays a form to input Student data
	@org.springframework.web.bind.annotation.RequestMapping("/studentForm")
	public String studentForm(org.springframework.ui.Model model) {
		model.addAttribute("student",new org.ibm.reva.student.model.Student());
		return "student-form";
	}
//GET shows all the things in the url
//this adds the student details and views the added details
	
	@org.springframework.web.bind.annotation.RequestMapping(
			value="/save",
			method=org.springframework.web.bind.annotation.RequestMethod.POST)
	public String save(@org.springframework.web.bind.annotation.ModelAttribute
			("student")org.ibm.reva.student.model.Student student,
			org.springframework.ui.Model model) {
		org.ibm.reva.student.model.Student newStudent = studentDao.addStudent(student);
		String message =(newStudent==null)?"student details not added":
			"Student details successfully added!";
		model.addAttribute("message", message);
		model.addAttribute("student", newStudent);
		return "redirect://info-page";
		
	}
// this views the Student details
	@org.springframework.web.bind.annotation.RequestMapping("/view/{id}")// id value is passed
	public String view(@org.springframework.web.bind.annotation.PathVariable String id,
			org.springframework.ui.Model model) {
		org.ibm.reva.student.model.Student student = studentDao.getStudentById(id);
		model.addAttribute("student",student);
		return "view-student";
	}
	
//it shows the student details id the id given
// then it displays the form for updation
	@org.springframework.web.bind.annotation.RequestMapping("/update/{id}")
	public String update(@org.springframework.web.bind.annotation.PathVariable String id,
			org.springframework.ui.Model model) {
		org.ibm.reva.student.model.Student student = studentDao.getStudentById(id);
		model.addAttribute("student",student);
		return "update-form";
	}
//updates the student details in the database
	@org.springframework.web.bind.annotation.RequestMapping(
			value="/updateSave",
			method=org.springframework.web.bind.annotation.RequestMethod.POST)
	public String updateSave(
			@org.springframework.web.bind.annotation.ModelAttribute("student")
			org.ibm.reva.student.model.Student student,
			org.springframework.ui.Model model) {
		org.ibm.reva.student.model.Student updateStudent =
				studentDao.updateStudent(student.getId(), student);
		String message = (updateStudent==null)?
				"Student details not updated":
				"Student details are updated successfully";
		model.addAttribute("message", message);
		model.addAttribute("student",updateStudent);
		return "redirect://info-page";
	}

// removes the Student details of the id which id given
// then displays the form for removing
	@org.springframework.web.bind.annotation.RequestMapping(
			"/remove/{id}")
	public String remove(@org.springframework.web.bind.annotation.PathVariable String id,
			org.springframework.ui.Model model) {
		org.ibm.reva.student.model.Student student=studentDao.getStudentById(id);
	model.addAttribute("student",student);
	return "remove-form";
	}
	
//Removes the student details from the database if confirmed 	
	@org.springframework.web.bind.annotation.RequestMapping(
			value="/removeConfirmed",
			method=org.springframework.web.bind.annotation.RequestMethod.GET)
	public String removeConfirmed(
			@org.springframework.web.bind.annotation.ModelAttribute("student")
			org.ibm.reva.student.model.Student student,
			org.springframework.ui.Model model) {
		String message =studentDao.removeStudent(student.getId())?
			"student removed successfully!" :"Student not removed!!";
		model.addAttribute("message",message);
		return "redirect://info-page";
	}
	
}
