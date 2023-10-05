//# btn1 요소 클릭 시
document.querySelector("#btn1").addEventListener("click",() => {

  // location.href : 현재주소
  // location.href = 주소; :대입된 주소로 이동 (GET방식)

  location.href = "/jstl/basic";

});


document.getElementById("btn2").addEventListener("click",() =>{
  location.href="/jstl/condition";  // get 방식
});

document.getElementById("btn3").addEventListener("click",() =>{
  location.href="/jstl/loop";  // get 방식
});

