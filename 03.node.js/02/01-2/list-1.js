// 동기 처리로 읽기
const fs = require("fs");

let files = fs.readdirSync("./");
console.log(files);
