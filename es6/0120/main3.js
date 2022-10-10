let boxEls = document.querySelectorAll('.box');
console.log(boxEls);

boxEls.forEach(function(boxEl, index){
    console.log(index, boxEl);
    boxEl.classList.add(`heors-${index+1}`);
    
    console.log(boxEl.textContent);
    boxEl.textContent = "우리나라";
});

boxEls[1].textContent ="만세";
  