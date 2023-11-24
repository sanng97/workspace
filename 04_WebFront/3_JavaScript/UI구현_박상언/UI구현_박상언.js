
const signupForm =document.signupForm;
const inputId =  document.getElementById("input-id");
const inputPw =  document.getElementById("input-pw");
const inputPwCheck =  document.getElementById("input-pw-check");
const inputadd = document.getElementById("input-add");
const inputemail = document.getElementById("input-email");

const inputList = document.querySelectorAll(".signup-input");

inputId.addEventListener("input", e => {

  const val = inputId.value.trim(); 
  const span =  e.target.nextElementSibling.nextElementSibling;


  const regEx = /^[A-Za-z\d\-\_]{6,16}$/;

  if(regEx.test(val)){ 
    span.innerText="필수입력입니다.";
    span.classList.add("check");
    span.classList.remove("error");
    checkList["input-id"] = true;

  }else{
    
  }
});

