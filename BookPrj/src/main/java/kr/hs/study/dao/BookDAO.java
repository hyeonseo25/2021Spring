package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class BookDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MapperClass mapper;
	
	// 추가
	public void insert_data(BookDTO dto) {
		String sql = "insert into book values(?,?,?,?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getEmail());
	}
	
	// 수정
	public void update_data(BookDTO dto) {
		String sql = "update book set price=? where title=?";
	    jdbcTemplate.update(sql, dto.getPrice(), dto.getTitle());
	}
	// 삭제
	public void delete_data(BookDTO dto) {
		String sql = "delete from book where title=?";
		jdbcTemplate.update(sql, dto.getTitle());
	}
	
	// 조회
	public List<BookDTO> select() {
		String sql = "select * from book";
		List<BookDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
