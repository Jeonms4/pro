package com.spring.ex02;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	// 연결이나 DataSource에서 SqlSession을 생성합니다.
	public static SqlSessionFactory sqlMapper = null;
	
	private static SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			try {
				String resource = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		
		SqlSession session = sqlMapper.openSession();
		
		List<MemberVO> memlist = session.selectList("mapper.member.selectAllMemberList");
		return memlist;
	}
	
	// 회원 ID로 이름 조회
	String selectName() {
		sqlMapper=getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		String name = session.selectOne("mapper.member.selectName");
		return name;
	}
	
	// 회원 ID로 비밀번호 조회
	String selectPwd() {
		sqlMapper=getInstance();
		SqlSession session = sqlMapper.openSession();
		String pwd = session.selectOne("mapper.member.selectPwd");
		return pwd;
	}
	
	int selectPwd2() {
		sqlMapper=getInstance();
		SqlSession session = sqlMapper.openSession();
		int pwd2 = session.selectOne("mapper.member.selectPwd2");
		return pwd2;
	}
}
