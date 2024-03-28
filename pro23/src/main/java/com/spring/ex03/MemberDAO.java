package com.spring.ex03;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.ex01.MemberVO;

public class MemberDAO {

	// 연결이나 DataSource에서 SqlSession을 생성합니다.
	public static SqlSessionFactory sqlMapper = null;

	private static SqlSessionFactory getInstance() {

		if (sqlMapper == null) {
			try {

				// DB 연동 설정 정보 파일 불러오기
				String resource = "mybatis/SqlMapConfig.xml";
				System.out.println("resource : " + resource);
				Reader reader = Resources.getResourceAsReader(resource);
				System.out.println("reader : " + reader);

				// SqlSessionFactoryBuilder 객체 만들기
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				System.out.println(sqlMapper);
			} catch (Exception e) {
				System.out.println("SqlSessionFactory 객체 생성 중 예외 발생");
			}

		}
		return sqlMapper;
	}

	// 회원 조회
	public List<Map<String, String>> selectAllMemberList() {
		sqlMapper = getInstance();

		System.out.println("sqlMapper 객체 : " + sqlMapper);

		// SqlSession
		// MyBatis 작업을 위한 기본 Java 인터페이스입니다. 이 인터페이스를 통해 명령을 실행하고, 매퍼를 가져오고, 트랜잭션을 관리

		// SqlSession(DB 연결 객체)
		SqlSession session = sqlMapper.openSession();

		// sql문이 있는 곳에서 sql 실행 결과를 list 로 받기
		List<Map<String, String>> memlist = session.selectList("mapper.member.selectAllMemberList");

		return memlist;

	}

	// 회원 ID로 이름 조회
	String selectName() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		String name = session.selectOne("mapper.member.selectName");

		return name;
	}

	// 회원 ID로 패스워드 조회
	String selectPwd() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		String pwd = session.selectOne("mapper.member.selectPwd");

		return pwd;
	}

	// 회원 ID로 패스워드 조회2
	int selectPwd2() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		int pwd = session.selectOne("mapper.member.selectPwd2");

		return pwd;
	}

	//회원 ID로 회원이 있는지 여부 확인
	public MemberVO selectMemberById(String id) {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		MemberVO member = session.selectOne("mapper.member.selectMemberById", id);
		
		return member;
	}
	
	public void insertMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		
		session.insert("mapper.member.insertMember", memberVO);
		
		// 배치 문을 플러시하고 데이터베이스 연결을 커밋합니다.
		session.commit();
	}
}
