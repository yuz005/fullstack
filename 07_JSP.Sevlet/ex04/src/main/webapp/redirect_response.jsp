<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <title>Insert title here</title>
</head>
<body>
username 값: <%=request.getAttribute("username") %><br>
useraddress 값: <%=request.getAttribute("useraddress") %><br>
</body>
</html>