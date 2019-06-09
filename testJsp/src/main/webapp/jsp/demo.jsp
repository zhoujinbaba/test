<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>测试jsp</title>
</head>
<body>
<%
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
    String curTime = dateFormat.format(date);
    request.setAttribute("curTime",curTime);
%>

当前系统时间：<span style="color: red"><%=request.getAttribute("curTime") %></span>
</body>
</html>