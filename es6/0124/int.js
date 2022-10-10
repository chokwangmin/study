const pi = 3.141592635
console.log(pi);

const str = pi.toFixed(2);
console.log(str);
console.log(typeof str);

const integer = parseInt(str);
const float =parseFloat(str);

console.log(integer);
console.log(float);

console.log(typeof integer, typeof float);

// const _abs = math.abs(-12);
console.log(Math.abs(-12));

console.log(Math.min(2,10));
console.log(Math.max(2,10));
//올림
console.log(Math.ceil(3.14));
//내림
console.log(Math.floor(3.9));
//반올림
console.log(Math.round(3.5));
console.log(Math.floor(Math.random() *10));

const number = [1,2,3,4,5];
const fruits = ['사과', '바나나', '체리'];
console.log(number[1]);
console.log(fruits[2]);

console.log(number.length);

console.log(fruits.length);
console.log([2,3,4,5].length);

for (let i=0; i < number.length; i++){
    console.log('실습', number[i])
    }

//.     concat

const con = number.concat(fruits);
console.log(con);
console.log(number);
console.log(fruits);

//forEach(), .map .filter

fruits.forEach(function(element, index, array ){
    console.log(element, index, array);
})

// const b = fruits.map(
//     function (fruit, idx) {
//         return {
//             id :idx,
//             name : fruits
//         }
        
//     }
//     console.log(b);

// const y = number.map(function (num, idx) {
//     return number 
    
// }

// const = z = number.filter(function(number, idx)
//     {
//         return number < 3
//     });

//     const g = 
//push(뒤) , unshift(앞), splice(끼워넣기),pop(뽑아낸다)
number.push(9);
console.log(number);
number.unshift(0);
console.log(number);

//revers(반전)

number.reverse();
console.log(number)

//splice()끼워넣기 대체한다
number.splice(2,1, 9999);
console.log(number);

fruits.splice(2,0,'오렌지');
console.log(fruits)

//Object

