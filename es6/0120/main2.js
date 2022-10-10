// 클래스 .box object 를 가져옴 1개.

let boxEl = document.querySelector('.box');
let btnEl = document.querySelector('#btn');
console.log(boxEl)
console.log(btnEl);

boxEl.addEventListener('click', function(){
    console.log('클릭을 했네여?')
    boxEl.classList.add('active');
}
 );
 
 btnEl.addEventListener('click', function()
{ console.log('버튼을 누르셨네요');
    let isActive = boxEl.classList.contains('active');
    console.log(isActive);
    boxEl.classList.add('active');

    if(isActive){
        boxEl.classList.remove('active');
        
    }else {
        boxEl.classList.add('active');
    }
 

})