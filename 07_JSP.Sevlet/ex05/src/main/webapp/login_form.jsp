<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <title> login </title>
</head>
<body>
<h1>getParameter 실습</h1>
<form action="login" method="get">
  <fieldset>
    <legend>로그인 폼</legend>
    <ul>
      <li><label for="userid">아이디</label>
        <input type="text" id="userid" name="userid"></li>
      <li><label for="password">비밀번호</label>
        <input type="password" id="password" name="passwd"></li>
      <li><input type="submit" value="전송"></li>
    </ul>
  </fieldset>
</form>
</body>
</html>