<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>insert title here</title>
</head>
<body>
<h1>getParameterValues 실습<h1>
  <form action="sports" method="post">
    <fieldset>
      <legend>좋아하는 운동 및 성별</legend>
      <ul>
        <li>
        <label for="baseball">야구</label>
          <input type="checkbox" id="baseball" name="sports" value="야구">
        <label for="football">축구</label>
          <input type="checkbox" id="football" name="sports" value="축구">
        <label for="basketball">농구</label>
        <input type="checkbox" id="basketball" name="sports" value="농구">
        </li>
        <li>
          <label for="male">남성</label>
          <input type="radio" id="male" name="sex" value="남성" checked>
          <label for="female">여성</label>
          <input type="radio" id="female" name="sex" value="여성" checked>
        </li>
        <li><input type="submit" value="전송"></li>
      </ul>
    </fieldset>
  </form>
</body>
</html>