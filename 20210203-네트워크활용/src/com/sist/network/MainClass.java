package com.sist.network;
/*
 *    자바 네트워크(인트라넷(사내), 인터넷 연결한 후에 통신이 되게 하는)
 *      자바 => 사내메신저
 *      자바 => 화면UI, C => 서버
 *      ===================== 예) 카톡
 *    TCP
 *      1) 연결성
 *      2) 신뢰성
 *      3) 속도 저하
 *      4) => FTP(파일전송), SMTP(Send Mail), TELNET(보완성 제일 허술함, 요즘 많이 사용 x), HTTP(웹)
 *    UDP
 *      1) 비연결성
 *      2) 신뢰성이 없다
 *      3) 속도가 빠르다
 *      4) => 게임, 멀티미디어(화상) => 24프레임
 *    
 *    등기 => TCP / UDP
 *           연결성, 신뢰성, 속도 => RTCP
 *    
 *    자바에서 네트워크 => 
 *        식별자: IP(전화번호), PORT(연결선) => 서버(IP: 고정), 클라이언트(유동)
 *              =====================
 *              PORT: 0~65535 (0~1023 사용중)
 *              FTP(21), SMTP(25), TELNET(23), HTTP(80), 오라클서버(1521)
 *              MS-SQL(1433), 몽고디비(27017), 8080,4000
 *    1) 서버제작
 *       1:다, 1:1(프로그램, 서버, 클라이언트): 화상, 게임
 *       ====
 *       1. 접속을 받는 프로그램 => 저장
 *       2. 접속자마다 따로 통신이 가능하게 만든다(쓰레드: 통신)
 *          class Server
 *          {
 *              접속자 정보 저장
 *              class 통신 extends Thread
 *              {
 *                  
 *              }
 *          }
 *          http://www.daum.net/aaa/index.html
 *          *** Socket: 연결기계(핸드폰)
 *          접속을 담당하는 클래스
 *            ServerSocket
 *             1) ip, port를 연결한다   bind() => 개통
 *             2) 대기 상태 => listen()
 *             3) 연결     => accept() => ip(발신자의 전화번호) => 저장
 *             4) 응답 => 요청 내용 read()
 *             5) 응답 => write()
 *          통신을 담당하는 클래스
 *             Socket
 *    2) 클라이언트 연결 방법
 *       접속 => 요청 => 응답 받아서 출력
 */
import java.io.*;
import java.net.*;
// 1. URL
/*
 *     http://www.daum.net/movie/list.jsp => URL
 *                        =============== URI
 *     = URLConnection: 웹서버에 접근(해서 데이터 갖고 옴)
 *     = URLEncoder: 한글 변환  ==> 보낼 때 encoding => 받을 때 decoding => %EC%9E%90%EB%B0%94
 *                                     =========
 *                                     getBytes() 자바 = %EC%9E%90%EB%B0%94
 *                                     oq=자바
 *     1. 브라우저, 네트워크 => 1byte: 1byte를 변환 getBytes() => 서버에서
 *     https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j0i10l2j0i131i433j0i433j0i131i433j69i65l2.2320j1j7&sourceid=chrome&ie=UTF-8  
 */
// 2. Socket, ServerSocket
// https://search.naver.com/search.naver?where=news&query=%EC%98%81%ED%99%94
public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("http://newssearch.naver.com/search.naver?where=rss&query="
					+URLEncoder.encode("영화","UTF-8"));
			// URL 연결
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();  // naver에 연결
			if(conn!=null)	// 연결 되었다면
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
				                                                           // 한글이 깨져서 나오면 설정 ========
				while(true)
				{
					String msg=in.readLine();  // 한 줄씩 읽어
					if(msg==null)  // 더이상 읽을 내용이 없는 경우
					{
						break;
					}
					System.out.println(msg);
				}
			}
		}catch(Exception ex) {}
	}

}
