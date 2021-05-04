package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.TodoDTO;

@Component
public class TodoDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MapperClass mapper;
	
	// 추가
	public void insert_data(TodoDTO dto) {
		String sql = "insert into todo values(?,?,?,?,?)";
		jdbcTemplate.update(sql, dto.getContent(), dto.getPeriod(), dto.getType(), dto.getDeadline(), dto.getDone());
	}
	
	// 수정
	public void update_data(TodoDTO dto) {
		String sql = "update todo set price=? where title=?";
	    //jdbcTemplate.update(sql, dto.getPrice(), dto.getTitle());
	}
	// 삭제
	public void delete_data(TodoDTO dto) {
		String sql = "delete from book where title=?";
		//jdbcTemplate.update(sql, dto.getTitle());
	}
	
	// 조회
	public List<TodoDTO> select() {
		String sql = "select * from todo";
		List<TodoDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
