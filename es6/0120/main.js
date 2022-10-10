// String{문자데이터)

let myName = "조광민";
let email = "skyjkm@tricycle.com"; 
let hello = `안녕 ${myName}`;

console.log(myName);
console.log(email);
console.log(hello);

//number(숫자데이터)

let number = 123;
let opacity = 1.57;

console.log(number);
console.log(opacity);

// Boolean(불린데이터)
// ture, false 두가지값

let checked = true;
let isShow = false;

console.log(checked)
console.log(isShow)

//undefined
//값이 할당안됨

let undef;
let obj = { abc: 123};

console.log(undef)
console.log(obj.abc)
console.log(obj.yxz)

//null
//어떤 값이 의도적으로 비어있음

let empty = null;
console.log(empty)

// OBject(객체 데이터)
//여러 데이터를 (key:value)형태
let cho = {
    name: "조광민",
    age: 36,
    sex: "man",
    study: function(){
        console.log("공부");
    },
    getName: function(){
        return this.name;
    }
};

console.log(cho.name)
console.log(cho.age)
console.log(cho.sex)
console.log(cho.study());

let fruits =['Apple', 'Banana', 34]
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);
console.log(fruits[3]);


//변수 (var, let, const)
//let은 재선언은 불가, 재할당을 가능
//var은 재선언 가능, 재할당도 가능 --**쓰지마라
//const 재선언 불가, 재할당 불가 

let a = 2;
let b = 3;
console.log(a + b)
console.log(a - b)
console.log(a * b)
console.log(a / b)

//함수선언 
 function hellowFunc() {
     console.log(123);
 }
 hellowFunc();

 //리턴 함수
 function retFunc() {
     return "나야나";
 }

 let ret =retFunc();
 console.log(ret);
 console.log(retFunc());

 // 함수선언 == 파라메타 있는거

 function sum(a, b){
    return a + b;
}
console.log(sum(1,5));
a = sum(2,4);
b = sum(6,7);

console.log(a, b);

//익명함수

let world = function() {
    console.log("익명함수")
}
world();

//조건문
let aa = 1;
let bb = 5;

if (aa > bb) {
    console.log("맞아");
}
else if (aa == bb){
    console.loge("틀려")
}
else {
    console.log("틀려")
}

let 