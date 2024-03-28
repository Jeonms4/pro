import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDAO {
	private Connection conn;
	
	private PreparedStatement pstmt;
	
	private DataSource dataFactory;
	
	public MemberDAO() {
		System.out.println("MemberDAO 객체 생성");

		try {
			// 1. 연결을 하기 위한 컨텍스트(pro07)인식을 위한 Context 객체
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
			//// 이 코드는 JNDI를 사용하여 "java:/comp/env" 컨텍스트에서 "jdbc/oracle"라는 이름으로 등록된
			// 데이터 소스를 얻어와서 dataFactory 변수에 할당하는 것입니다.
			// 이렇게 얻어온 데이터 소스를 사용하여 데이터베이스 연결을 설정하고 관리할 수 있습니다.
		} catch (Exception e) {
			System.out.println("MemberDAO 객체에서 DB 연결 관련 에러");
		}

	}
	
	public void addMembers(MemberVO vo) {
		try {
			conn = dataFactory.getConnection();
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			
			String sql = "insert into t_number(id, pwd, name, email VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "영어 추가됨");
			
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행시 에러");
		}
	}
	
	public void delMember(String id) {
		System.out.println("삭제하고자 하는 ID" + id);
		try {
			conn = dataFactory.getConnection();
			String query="delete from t_member" + "where id = ?";
			System.out.println("회원 삭제 sql문" + "\n" + query);
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("삭제 에러");
		}
	}
	
	
	public List<MemberVO> listMembers() {
		List<MemberVO> memberLists = new ArrayList<MemberVO>();
		try {
			
			conn = dataFactory.getConnection();
			String sql = "select * from T_MEMBER";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String _id = rs.getString("id");
				String _pwd = rs.getString("pwd");
				String _name = rs.getString("name");
				String _email = rs.getString("email");
				
				MemberVO vo = new MemberVO();
				vo.setId(_id);
				vo.setId(_pwd);
				vo.setId(_name);
				vo.setId(_email);
				
				memberLists.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("삭제 에러");
		}
		return listMembers();
	}
	
}
