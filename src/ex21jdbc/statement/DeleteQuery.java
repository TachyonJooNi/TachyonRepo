package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {

	//멤버변수 : DB연결 및 쿼리실행
	Connection con;
	Statement stmt;

	//생성자 : DB연결 (나중에 DB연결 쓸 일있으면 그대로 가져다 쓰면된다)
	public DeleteQuery() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "kosmo";
			String pass = "1234";
			con = DriverManager.getConnection(url, id, pass);
			System.out.println("오라클 DB 연결성공");
		}
		catch(Exception e) {
			System.out.println("연결실패");
		}
	}//end of DeleteQuery
	
	//DB자원해제(반납)
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}//end of close
	
	//쿼리실행
	private void execute() {
		try {
			stmt = con.createStatement();
			String query = "DELETE FROM member WHERE id='test2'";
			/*
			insert, delete, update와 같이 행의 변화가 발생되는 쿼리문을 실행할때는
			executeUpdate()메서드를 사용한다. 해당 쿼리의 영향을 받은 레코드의
			갯수가 int타입으로 반환된다. 변화가 발생한 행의 갯수가 반환된다.
			*/
			int affected = stmt.executeUpdate(query);
			//두번실행하면 삭제한 행이 없으니 0을 반납해서 "0행이 삭제됨" 이 출력됨
			System.out.println(affected +"행이 삭제됨.");
			//자원반납
			close();
		}
		catch(SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DeleteQuery().execute();
	}
}
