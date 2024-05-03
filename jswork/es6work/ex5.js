// 화살표함수 - 일반함수와 차이점-객체생성 안됨, new 사용 불가
// 자바 Ramda(익명함수)와 같은 방식(function 키워드 대신 ()와 화살표 사용해서 기존보다 간단하게 함수를 정의

// 일반함수
function f1() {
    console.log("일반함수 f1");
}
f1();
// 화살표함수
let f2 = () => console.log("화살표함수 f2");
f2();

// 일반 인자값 있음
function f3(a, b) {
    return a + b;
}
let a = f3(5, 7);
console.log(a); // 12

// 화살표함수 인자값 있음
let f4 = (a, b) => a + b; // 한줄일 경우엔 return 생략 가능
let b = f4(11, 14);
console.log(b); // 25

// 일반
function f5(x, y, z = 30) {
    return x + y + z;
}
console.log(f5(1, 2, 3)); // 6
console.log(f5(10, 20)); // 60
// 화살표 구현
let f6 = (x, y, z = 30) => x + y + z;
console.log(f6(4, 5, 6)); // 15
console.log(f6(20, 20)); // 70

// 오브젝트 함수를 객체로 만들수도 있다
let ob = {
    f1: () => {
        console.log(1);
        let f2 = () => console.log(2);
        f2();

        setTimeout(f2, 1000);
    }
}
ob.f1();