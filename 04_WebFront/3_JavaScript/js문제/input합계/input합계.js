/* 숫자 합계 계산기 */
const countInput = document.getElementById("count-input");
const createBtn = document.getElementById("create-btn");
const list = document.getElementById("list");
const calc = document.getElementById("calc");
const calcResult = document.getElementById("calc-result");

createBtn.addEventListener('click', function(){
  
  if(countInput.value <= 0){
    alert("1 이상 숫자를 입력 해주세요.");
    return;
  }


  list.innerHTML = "";

  for(let i=0 ; i<countInput.value ; i++){
    list.innerHTML += '<li> <input type="number" class="list-input"> </li>';
  }


  document.body.scrollIntoView(false);
})

calc.addEventListener("click", function(){


  const inputList = document.getElementsByClassName("list-input");

  console.log(inputList);

  let sum = 0; 

  for(let i=0 ; i < inputList.length ; i++){

    if(inputList[i].value == ""){ 
      alert("입력되지 않은 input이 있습니다.");

      inputList[i].focus();

      return; 
    }
    
    sum +=  Number(inputList[i].value); 
  }

  calcResult.innerText = sum;

 
});