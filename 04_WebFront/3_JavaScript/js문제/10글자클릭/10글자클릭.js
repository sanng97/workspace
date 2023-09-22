const numbers1 =document.querySelector('#bu1');
const numbers2 =document.querySelector('#bu2');
const numbers3 =document.querySelector('#bu3');
const numbers4 =document.querySelector('#bu4');
const numbers5 =document.querySelector('#bu5');
const numbers6 =document.querySelector('#bu6');
const numbers7 =document.querySelector('#bu7');
const numbers8 =document.querySelector('#bu8');
const numbers9 =document.querySelector('#bu9');
const numbers0 =document.querySelector('#bu0');

const span = document.querySelector("#sp");

const bts = document.querySelector("#bts");

numbers1.addEventListener("click",() => {
  span.innerText+="1";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return
  }
});

numbers2.addEventListener("click",() => {
  span.innerText+="2";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return
  }
});

numbers3.addEventListener("click",() => {
  span.innerText+="3";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers4.addEventListener("click",() => {
  span.innerText+="4";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers5.addEventListener("click",() => {
  span.innerText+="5";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers6.addEventListener("click",() => {
  span.innerText+="6";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers7.addEventListener("click",() => {
  span.innerText+="7";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers8.addEventListener("click",() => {
  span.innerText+="8";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers9.addEventListener("click",() => {
  span.innerText+="9";
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
});

numbers0.addEventListener("click",() => {
  if(span.innerText.length >= 10){
    alert("10자 까지만 입력할 수 있습니다");
    return;
  }
  span.innerText+="0";
});

bts.addEventListener("click",()=>{
  span.innerText="";

});

/*const numberList = document.querySelectorAll(".number");

for(let num of numberList){
  num.addEventListener("click", e=>{
    if(numbers.innerText.length >= 10){
      alert("10글자 이상 안됨");
      return;
    }
    numbers.innerText += num.innerText;
  })

}*/