//산술, 할달연산자( +,-*,/,% = )
console.log (1 + 2);
console.log(5 - 7);
console.log(3 * 4);
console.log(7 % 2);
console.log(3-2*7); //사칙연산에는 순서

let a = 2;
a = a + 1;
a += 1;
console.log(a);

// 비교, 논리 연산자
const aa = 1;
const bb = 2

console.log("확인", aa === bb )
console.log("!확인", aa !== bb )

console.log(aa === bb); //같냐
console.log(aa !== bb); //다르냐
console.log(aa > bb); //초과
console.log(aa < bb);  //미만
console.log(aa >= bb); //이상
console.log(aa <= bb);  // 이하

function isEqual (x, y){
    return x === y;

}

console.log(isEqual(1,1))
console.log(isEqual(1,"1"));

const aaa = 1 === 1;
const bbb = 'B' === 'B';
const ccc = true;
console.log(aaa && bbb && ccc); //그리고 and())

console.log(aaa || bbb || ccc); // 또는 :or 하나라도 맞으면 true
console.log(!ccc); //부정: Not

//삼한 연산자
console.log("------삼한연산자------")
const d = 1 > 2;
if(d){
    console.log('참');
}else {
    console.log('거짓');
}   
           //(삼한 연산자)
console.log(a ? '참' : '거짓')


//조건문 If else
function random() {
    return Math.floor(Math.random() * 10);
}

const r = random();
console.log(random());
if (r === 0) {
    console.log('영이야.');
}else if (r === 3){
    console.log('삼이야.');
    
}else if (r === 8){
    console.log('팔이야.');
}else {
    console.log('꽝.');

}

//조건문 switch case
//  switch
//  case
//  break

//반복문 For
//for (시작조건;종료조건;변화조건){}

for(let i = 0; i < 3; i++ )
console.log(i)

const ulEl = document.querySelector('ul');
console.log(ulEl);

for (let ii = 0; ii < 3; ii++){
    const liEl = document.createElement('li');
    liEl.textContent = `list-${ii}`;
    ulEl.appendChild(liEl);
}

//형변환
//참,거짓
//true,[],1,2,3

// false , '', null,undefined, 0, -0 NaN

const f = 1;
const h = "2";

console.log(f == h);
console.log(typeof (f+h));
console.log((parseInt(h)+f));

console.log(true)
if(1){
    console.log('참');
}else{

        console.log(거짓);
    }


//문자 , 숫자와 수학, 배열, 객체
// string, '', "" ,`` 
//Number
//Boolean : ture , false
//undefinde
// null
//Array[]
//Object{}

const hh ="조광민"
const searchText = "";
const indexNum = hh.indexOf(searchText);
//lenth

const gg = "1234567";
console.log(gg.length);

//slice

const uu ="Hello World"
console.log(uu.slice(0,3));

//match(정규식)
const str = "imoon@tricycle.co.kr";
let id = str.match(/.+(?=@)/)[0]
console.log(id);


//replace
console.log(uu.replace('World', '문성재'))
console.log(uu.replace(' ', ''))
//trim

console.log(uu.trim())

//split
const id2 = str.split('@');
console.log(id2[0]);