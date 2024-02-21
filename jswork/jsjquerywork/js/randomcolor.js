function randomColor(){
    // rgb 색상 얻기
    var r=parseInt(Math.random()*256); // 0~255
    var g=parseInt(Math.random()*256); // 0~255
    var b=parseInt(Math.random()*256); // 0~255

    var color="rgb("+r+","+g+","+b+")";

    return color; // 다른페이지로 값을 보내기
}