package kr.ac.subject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.subject.model.Subject;

public class NewSubject implements RowMapper<Subject>{

		public Subject mapRow(ResultSet rs, int rowNum) throws SQLException{
			Subject subject = new Subject();
			
			subject.setYear(rs.getInt("year"));
			subject.setSemester(rs.getInt("semester"));
			subject.setCode(rs.getString("code"));
			subject.setName(rs.getString("name"));
			subject.setSubjectCode(rs.getString("subjectcode"));
			subject.setCredit(rs.getInt("credit"));
			
			return subject;
		}
	
}
