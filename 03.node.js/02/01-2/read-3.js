fs = require("fs");
//비동기처리로 파일 읽기
fs.readFile("./example.txt", "utf-8", (err, data) => {
  if (err) {
    console.error(err);
  }
  console.log(data);
});
