fs = require("fs");
const data = fs.readFileSync("./example.txt", "utf8");
if (fs.existsSync("text-1.txt")) {
  // 파일이 있다면
  console.log("file already exist");
} else {
  //  파일이 없다면
  fs.writeFileSync("./text-1.txt", data);
}
