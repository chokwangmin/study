const userAge = {
    name : 'moon',
    age : 45
}
const userEmail = {
name : 'moon',
email : 'imoon@tricycle.co.kr'
}

//.assgin
const target = Object.assign(userAge, userEmail);
console.log(target);
console.log(userAge);
console.log(target === userAge);

let a = {
    name : 'moon',
    age : 45
}

let b = {
    name : 'moon',
    age : 45
}

console.log(a);
console.log(b);
console.log(a === b);

a = b;
console.log(a);
console.log(b);
console.log(a === b);
