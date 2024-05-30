fs = require("fs");
//동기 처리로 파일 읽기(fs.readFileSync(경로,옵션))
const data = fs.readFileSync("./example.txt", "utf-8");
console.log(data);
