// 구조 분해 할당
// 비구조화 할당

const user = {
    name: 'min',
    age: 36,
    email: 'skyjkm@tricycle.co.kr',
    // address = [
    //     '서울', '창원'
    // ]
}

const{name, age, email, address} = user
console.log(`사용자의 이름은 ${name}입니다.`);
console.log(`${name}의 나이는${age}세 입니다.`);
console.log(`${name}의 이메일 주소는${email}입니다.`);
console.log(address);

const fruits = ['Apple', 'Banana', 'Cherry'];
const[a, b, c, d] = fruits;
console.log(a, b, c, d);

//전개 연산자

function toObject(a,b,c){
    return {
        a: a,
        b: b,
        c: c
    }


}
const reObjet =   toObject(fruits[0], fruits[1], fruits[2]);
const reObject = toObject(...fruits);
console.log(reObjet)
console.log(reObject)

//복사X
const copyUser= user;
console.log(copyUser === user)

//복사O (얕은복사)
const copyUser2= Object.assign({}, user);
console.log(copyUser2 === user);
console.log(copyUser2.name === user.name);
console.log(copyUser2.address === user.address);

//복사O (깊은복사) lodash.js 사용예제
const deepObject = _.cloneDeep(user);
console.log(copyUser2 === user);
console.log(copyUser2.name === user.name);
console.log(copyUser2.address === user.address);

//json



// html, css, javascript > db(표준sql) > java

// 스타벅스 홈페이지..

