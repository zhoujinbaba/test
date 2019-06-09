<%--
  Created by IntelliJ IDEA.
  User: huan
  Date: 2019/6/1
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jsp书写java代码的三种方式</title>
</head>
<body>


<%
    request.setAttribute("num1",10);
    request.setAttribute("num2",20);
    request.setAttribute("num3",30);

    request.getSession().setAttribute("addr","shanghai");
    request.getSession().getServletContext().setAttribute("addrs","hahahh");





%>
${value}
${num1+num2}
${addrs}
<%--获取数组数据--%>
${arr[1]}
${person.name}
${person.age}
${person.addr}

</body>
</html>
