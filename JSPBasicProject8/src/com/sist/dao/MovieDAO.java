package com.sist.dao;
// cookie 배우는 중..
import java.util.*;
import javax.sql.*;
import java.sql.*;
import javax.naming.*;
// 결합성이 낮은 프로그램 => 다른 클래스에 영향이 없게 만드는 프로그램)
public class MovieDAO {
	private Connection conn;
	private PreparedStatement ps;
	// 미리 생성된 Connection 객체를 얻어온다
	public void getConnection()
	{
		try
		{
			// 1. 탐색기를 연다(JNDI=rmi)
			Context init=new InitialContext();
			// 2. c 드라이버를 클릭   java://comp/env
			Context c=(Context)init.lookup("java://comp/env");
			// 3. 폴더를 찾는다.     jdbc/oracle  찾는 폴더명
			DataSource ds=(DataSource)c.lookup("jdbc/oracle");
			// 4. 원하는 파일을 가지고 온다 => 미리 생성된 connection의 주소 얻기
			conn=ds.getConnection();
		}catch(Exception ex) {}
	}
	// Connection 사용 후에 반환 => 재사용(10개까지 사용 가능하고, 메모리 낭비를 줄이기 위해 반환하는 것)
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// 기능 처리
	public List<MovieBean> movieListData(int cno)
	{
		List<MovieBean> list=new ArrayList<MovieBean>();
		try
		{
			getConnection();   // 미리 생성된 conn의 주소를 얻어온다 => 연결에 소비되는 시간을 단축할 수 있다.
			// 단점: 웹에서 작동한다
			String sql="SELECT mno,poster,title "
					+ "FROM daum_movie "
					+ "WHERE cno=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, cno);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				MovieBean bean=new MovieBean();
				bean.setMno(rs.getInt(1));
				bean.setPoster(rs.getString(2));
				bean.setTitle(rs.getString(3));
				
				list.add(bean);
			}
			rs.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			disConnection();  // 반환 => POOL(conn을 관리하는 영역) => 재사용
		}
		return list;
	}
	// 상세보기(한 번 저장하고 쿠키에 넣을거야)
	public MovieBean movieDetailData(int mno)
	{
		/*
		 *  private int mno,cno,replyCount;
			private String poster,title,director,actor,regdate,
					genre,nation,grade,time,showUser,
					boxoffice,story,key;
			private double score;
		 */
		MovieBean bean=new MovieBean();
		try
		{
			// 미리 생성된 Connection의 메모리 주소 얻기
			getConnection();
			// SQL 문장 전송
			String sql="SELECT mno,poster,title,regdate,genre,nateion,grade,time,"
					+ "showUser,boxoffice,story,key,score "
					+ "FROM daum_movie "
					+ "WHERE mno=?";
			ps=conn.prepareStatement(sql);
			// ?에 값을 채운다
			ps.setInt(1, mno);
			// 실행 후 결과값 요청
			ResultSet rs=ps.executeQuery();   // ResultSet: 줄 단위로 읽는 것
			rs.next();    // 커서를 데이터가 출력된 위치로 이동(그래야 읽을 수 있기 때문에) 
			              //   => 컬럼 갯수가 아닌 row 갯수로 체크. 한 개 이상이면 while 써야 함
			bean.setMno(rs.getInt(1));
			bean.setPoster(rs.getString(2));
			bean.setTitle(rs.getString(3));
			bean.setRegdate(rs.getString(4));
			bean.setGenre(rs.getString(5));
			bean.setNation(rs.getString(6));
			bean.setGrade(rs.getString(7));
			bean.setTime(rs.getString(8));
			bean.setShowUser(rs.getString(9));
			bean.setBoxoffice(rs.getString(10));
			bean.setStory(rs.getString(11));
			bean.setKey(rs.getString(12));
			bean.setScore(rs.getDouble(13));
			rs.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			// 오라클 수행이 끝나면 반환해라(지금은 끝내는거 아님)
			disConnection();  // => commons-dbcp.jar가 처리함
		}
		return bean;
	}
}
