package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MapperClass mapper;
	// 추가
	public void insert_data(LoginDTO dto) {
		String sql = "insert into login values(?,?)";
		jdbcTemplate.update(sql, dto.getUserID(), dto.getUserPass());
		System.out.println("입력완료");
	}
	
	// 수정 id가 kim인 애의 비밀번호를 2222로 변경
	public void update_data(LoginDTO dto) {
		String sql = "update login set userpass=? where userid=?";
	      jdbcTemplate.update(sql, dto.getUserPass(), dto.getUserID());
		System.out.println("수정완료");
	}
	
	//delete
	public void delete_data(LoginDTO dto) {
		String sql = "delete from login where userid=? and userpass=?";
	    jdbcTemplate.update(sql, dto.getUserID(), dto.getUserPass());
	    System.out.println("DELETE 완료!");
	}

	
	// 조회
	public List<LoginDTO> select() {
		String sql = "select * from login";
		List<LoginDTO> list = jdbcTemplate.query(sql, mapper);
		System.out.println("조회완료");
		return list;
	}
}
