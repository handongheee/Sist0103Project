let arr1 = [3, 6, 8];
let arr2 = [4, 8];
let arr3 = [11, 12, ...arr1, 44, ...arr2];

console.log(arr3.length); // 8개
console.dir(arr3); // dir:구조 출력

let arr4 = [...[100, 200], ...arr2];
console.log(arr4); // [ 100, 200, 4, 8 ]

function fsum(arr) {
    let sum = 0;
    // 방법01
    // for(i=0;i<arr.length;i++){
    //     sum+=arr[i];
    // }
    // 방법02
    for (let a in arr) {
        sum += arr[a];
    }
    console.log("합계: " + sum); // 96
}
fsum(arr3);

function func3(a, b, c, d, e) {
    console.log(a, b, c, d, e);
}
// arr3를 인자로 보내서 호출하기
func3(...arr3); // 11 12 3 6 8