package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDao {
	
	private static TestDao dao = new TestDao();
	private TestDao() {}
	public static TestDao getInstance() {
		return dao;
	}
	
	public Connection connect()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test0601","root","22242224");
		}catch(Exception e)
		{
			System.out.print("MDAO:connect"+e);
		}
		return conn;
	}
	public void close(Connection conn, PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try {
				pstmt.close();
			}catch(Exception e) {
				System.out.print("Pstmt close error"+e);
			}
		}
		if(conn!=null)
		{
			try {
				conn.close();
			}catch(Exception e)
			{
				System.out.print("Conn close error" +e);
			}
		}
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs)
	{
		if(rs != null)
		{
			try {
				rs.close();
			}catch(Exception e)
			{
				System.out.print("rs close error" + e);
			}
		}
		close(conn,pstmt);
	}
	
	public boolean loginS(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from student where id = ? and pwd = ?;");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			else
				result = false;
			}
		catch(Exception e)
			{
				System.out.println("학생로그인 오류 !!!!!!!! " + e);
			}
		finally
			{
				close(conn,pstmt,rs);
			}
		return result;
	}
	
	public boolean loginP(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from prof where id = ? and pwd = ?;");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			else
				result = false;
			}
		catch(Exception e)
			{
				System.out.println("교수 로그인 오류 !!!!!!!! " + e);
			}
		finally
			{
				close(conn,pstmt,rs);
			}
		return result;
	}
	
	
	public int enrollSubject(String subid) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select id from subject where id = ? ;");
			pstmt.setString(1, subid);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			
		}catch(Exception e)
		{
			System.out.print("login error" + e);
		}
		finally
		{
			close(conn,pstmt,rs);
		}
		return result;
	}
	

}
