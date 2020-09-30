package org.ibm.reva.student.dao;

public interface StudentDao {
	
	public org.ibm.reva.student.model.Student addStudent(org.ibm.reva.student.model.Student student);
	
	public org.ibm.reva.student.model.Student
		getStudentById(String id);
	
	public org.ibm.reva.student.model.Student updateStudent(
			String id,org.ibm.reva.student.model.Student student);
	
	public boolean removeStudent(String id);
}
