<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.sist.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="model" class="com.sist.model.EmpModel"></jsp:useBean>
<%
    model.empListData(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row{
  width:800px;
  margin: 0px auto;
}
h1{
  text-align: center;
}
</style>
</head>
<body>
   <div class="container">
     <h1>사원 목록</h1>
     <div class="row">
       <table class="table table-striped">
         <tr>
           <th class="text-center">사번</th>
           <th class="text-center">이름</th>
           <th class="text-center">직위</th>
           <th class="text-center">입사일</th>
           <th class="text-center">급여</th>
           <th class="text-center">부서명</th>
           <th class="text-center">근무지</th>
         </tr>
         <%--
            for(EmpVO vo:list)
            {
        
                <tr>
                  <td class="text-center"><%=vo.getEmpno() %></td>
                  <td class="text-center"><%=vo.getEname() %></td>
                  <td class="text-center"><%=vo.getJob() %></td>
                  <td class="text-center"><%=vo.getHiredate().toString() %></td>
                  <td class="text-center"><%=vo.getSal() %></td>
                  <td class="text-center"><%=vo.getDvo().getDname() %></td>
                  <td class="text-center"><%=vo.getDvo().getLoc() %></td>
                </tr>
            }
         --%>
         <c:forEach var="vo" items="${list }">
               <tr>
                  <td class="text-center">${vo.empno }</td>
                  <td class="text-center">${vo.ename }</td>
                  <td class="text-center">${vo.job }</td>
                  <td class="text-center">${vo.hiredate }</td>
                  <td class="text-center">${vo.sal }</td>
                  <td class="text-center">${vo.dvo.dname }</td>
                  <td class="text-center">${vo.dvo.loc }</td>
                </tr>
         </c:forEach>
       </table>
     </div>
   </div>  
</body>
</html>