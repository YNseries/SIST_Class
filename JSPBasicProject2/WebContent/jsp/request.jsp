<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
	request: 내장객체(기본객체) => JSP에서 미리 생성된 객체
	=======
	  클래스명: HttpServletRequest
	    => URL주소 보면 알 수 있음
	    http://localhost(본인IP주소)/JSPBasicProject2/jsp/request.jsp
	    ================          ================================
	         서버 정보                     사용자가 요청한 내용(URI)
	         							===============
										  ContextPath
	         1) IP => getRemoteAddress()
	         2) PORT
	         3) Protocol
	         4) Method: 데이터 전송 방식(GET(받아서), POST(내부적으로))
	  역할(기능)
	  =======
	   1. 클라이언트의 정보, 서버 정보
	   2. 클라이언트 요청 정보(클래스에 서버로 요청한 값)
	      ***String getParameter() => text, radio, select, textarea(단일값)
	      ***String[] getParameterValues() => checkbox(다중값)
	      Spring(MVC)
	      M: 자바(DAO, VO, Manager, Service)
	      V: JSP
	      C: Servlet
	   =====================================
	   3. 세션, 쿠키를 읽을 수 있는 기능
	      => request.getSession()
	      => request.getCookies()
	   4. 속성 추가: MVC
	      => setAttribute() => getAttribute()
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row{
   width:450px;
   margin:0px auto;
}
h1{
   text-align: center;
}
</style>
</head>
<%--
	  JSP(GET/POST) => if
	   = 데이터 출력 => doGet()
	   = 데이터 입력 => doPost()
 --%>
<body>
   <div class="container">
     <h1>개인정보</h1>
     <div class="row">
      <form method=get action="output.jsp"> <!-- form으로 묶여야 데이터가 같이 전송됨 -->
      <!-- method= post방식|get방식(url에 입력했던 정보가 다 나옴 -->
       <table class="table table-striped">
         <tr>
           <td width=20% class="text-right">이름</td>
           <td width=80%>
             <input type=text name=name size=15>
           </td>
         </tr>
         <tr>
           <td width=20% class="text-right">비밀번호</td>
           <td width=80%>
             <input type=password name=pwd size=15>
           </td>
         </tr>
         <tr>
           <td width=20% class="text-right">성별</td>
           <td width=80%>
             <input type=radio name=sex value="남자" checked>남자 <!-- dafualt 설정 -->
             <input type=radio name=sex value="여자">여자
           </td>
         </tr>
         <tr>
           <td width=20% class="text-right">지역</td>
           <td width=80%>
             <select name=loc>
               <option>서울</option>
               <option>경기</option>
               <option>인천</option>
               <option>강원</option>
               <option>부산</option>
             </select>
           </td>
         </tr>
         <tr>
           <td width=20% class="text-right">소개</td>
           <td width=80%>
             <textarea rows="5" cols="40" name="content"></textarea>
           </td>
         </tr>
         <tr>
           <td width=20% class="text-right">취미</td>
           <td width=80%>
             <input type="checkbox" name=hobby values="운동">운동
             <input type="checkbox" name=hobby values="등산">등산
             <input type="checkbox" name=hobby values="게임">게임
             <input type="checkbox" name=hobby values="낚시">낚시
             <input type="checkbox" name=hobby values="여행">여행
           </td>
         </tr>
         <tr>
           <td colspan="2" class="text-center">
             <button class="btn btn-sm btn-danger">전송</button> <!-- button이 이미 submit 역할을 하기 때문에 안 적어도 됨 -->
           </td>
         </tr>  
       </table>
       </form>
     </div>
   </div>
</body>
</html>