package com.spring.ex01;

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
	
}
