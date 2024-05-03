// const: 상수

// 객체선언 가능
const pp={
    "name":"홍길동",
    "addr":"서울시 서초구"
}
console.log("이름: "+pp.name);
console.log("주소: "+pp.addr);

// 객체타입 상수일 경우 멤버 변경 가능
pp.name="이효리";
pp.addr="제주시";
console.log("이름: "+pp.name);
console.log("주소: "+pp.addr);

// pp={} 하는 객체값 자제 변경은 불가(에러남)