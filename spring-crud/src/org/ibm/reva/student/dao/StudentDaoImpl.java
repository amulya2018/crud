package org.ibm.reva.student.dao;

import org.ibm.reva.student.model.Student;

public class StudentDaoImpl implements StudentDao{
	
private org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

public org.springframework.jdbc.core.JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Student addStudent(Student student) {
		String sql = "INSERT INTO Student VALUES ('"+ student.getId()+ "', '"
				+ student.getName()+ "', '"
				+ student.getSubject1()+ "', '"
				+ student.getMarks1()+ "', '"
				+ student.getSubject2()+ "', '"
				+ student.getMarks2()+ "', '"
				+ student.getSubject3()+ "', '"
				+ student.getMarks3()+ "', '"
				+ student.getDateOfExaminations() +"')";
		return (jdbcTemplate.update(sql) == 1) ? student:null;
	}

	@Override
	public Student getStudentById(String id) {
		String sql = "SELECT * FROM Student WHERE id =?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id},
			new org.springframework.jdbc.core.BeanPropertyRowMapper
			<org.ibm.reva.student.model.Student>(org.ibm.reva.student.model.Student.class));
	}

	@Override
	public Student updateStudent(String id, Student student) {
		String sql ="UPDATE Student SET Name= '" +student.getName()+ ", "
				+ "Subject1= '" +student.getSubject1()+ ", "
				+ "Marks1= '" +student.getMarks1()+ ", "
				+ "Subject2= '" +student.getSubject2()+ ", "
				+ "Marks2= '" +student.getMarks2()+ ", "
				+ "Subject3= '" +student.getSubject3()+ ", "
				+ "Marks3= '" +student.getMarks3()+ ", "
				+ "DOE= '" +student.getDateOfExaminations()+ ", "
				+ "WHERE id= '" +student.getId()+ "' ";
		return (jdbcTemplate.update(sql)==1)? student:null;
	}

	@Override
	public boolean removeStudent(String id) {
		String sql = "DELETE FROM Student WHERE id= '" +id + "'";
		
		return (jdbcTemplate.update(sql)==1);
	}

	

}
