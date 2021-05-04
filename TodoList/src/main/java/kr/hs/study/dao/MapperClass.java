package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.TodoDTO;

@Component
public class MapperClass implements RowMapper<TodoDTO>{

	@Override
	public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		TodoDTO bean = new TodoDTO();
		bean.setContent(rs.getString("content"));
		bean.setPeriod(rs.getString("period"));
		bean.setType(rs.getString("type"));
		bean.setDeadline(rs.getDate("deadline"));
		bean.setDone(rs.getString("done"));
		return bean;
	}
	
}
