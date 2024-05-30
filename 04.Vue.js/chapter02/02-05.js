function addContact(
  name,
  mobile,
  home = "none",
  address = "none",
  email = "none"
) {
  let str = `name=${name},mobile=${mobile},address=${address},email=${email} `;
  console.log(str);
}
addContact("홍길동", "010-222-3331");
addContact("이몽룡", "010-222-3331", "02-3422-9900", "서울시");
