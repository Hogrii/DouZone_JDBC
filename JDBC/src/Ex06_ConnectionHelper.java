import java.sql.Connection;

import kr.or.kosa.utils.ConnectionHelper;

public class Ex06_ConnectionHelper {
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		conn = ConnectionHelper.getConnection("mariadb");
		
		System.out.println(conn.toString());
		System.out.println(conn.getMetaData().getDatabaseProductName()); // 데이터베이스 이름(Oracle, MariaDB 등등)
		System.out.println(conn.getMetaData().getDatabaseProductVersion()); // 데이터베이스 버전
		System.out.println(conn.isClosed()); // 데이터베이스 연결여부
	}
}
