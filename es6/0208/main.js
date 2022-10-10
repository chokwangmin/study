
// 함수 복습

//기명함수
function sum(x, y){
console.log(x + y);
    return x + y;
}
//함수표현 (익명)
// const sum = function (x, y){
//     return x + y
//     console.log('aaaaa')
// }

function sum3(x, y){
    if (x < 2){
        return 123
    }

    return x + y
}

const a = sum(1, 3);
const b = sum(1, 3);

const c = sum(1,3) + sum(3, 12);
console.log(c);

function sum4() {
    console.log(aguments)
    return
}

//화살표 함수
// () => {} vs function () {}

const double = function(x){
    return x * 2;
}
console.log(double(7));

//화사ㅏㄹ표 함수로 변경

const doubleArrow = (x) => {
    return x * 2;
}
console.log(doubleArrow);

//화살표 함수변경
const doubleArrow2 = (x) => x * 2;
console.log(doubleArrow2(7));

//화살표 함수변경 3
const doubleArrow3 = (x) => x * 2;
console.log(doubleArrow2(7));

 //화살표 함수 표현 4

 const getUser = x => ({
     name: x
 });
 console.log(getUser('imoon'));


 // 즉시실행 함수 \\life

//  function a(x){
//      console.log(x)
//  }
// a();
(function(){
    console.log('즉시실행함수')
}());

// 호이스팅
// 함수 선언부가 유효범위 최상단으로 끌어올렺는 현상


//사용할 함수 정의

//타이머 함수
//setTimeout(함수, 시간) : 일정 시간 후 함수 실행
//setIinterval(함수, 시간) : 시간간격마다 함수 실행
//claerTimeout(): 설정된 Timeout 함수 종료
//claerinterval() : 설정된 Interval

const itv = setInterval(function(){
    console.log('imoon')
}, 3000)


const h1El = document.querySelector('h1')
h1El.addEventListener('click',() => {
  
clearInterval(itv);
}
)



//콜백함수
//함수의 인수로 사용되는 함수

