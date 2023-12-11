import React, { useState } from 'react';

const StateEx1 = () => {
// 변수 "test"를 선언
// 선연된 변수 "test"를 해당 컴포넌트의 State로 사용하고 초기값 'A'를 대입

// 1) test : 상태 변수 명을 test로 지정
// 2) setTest : 상태 변수 test를 변경하는 함수
// 3) userState('A') : 변수 test를 상태 변수로 사용할 것이고 초기값으로 'A'를 대입
// -> 상태 변수로 지정된 test가 setTest 함수에 의해 변하게 될 경우 컴포넌트를 리랜더링 함.
const [test, setTest] = useState('A');

// 상태 변수 test의 값이 'A'이면 'B', 'B' 이면 'A'로 변경하는 함수
// -> 해당 함수가 수행될 경우 상태(State)가 변하기 떄문에
// 컴포넌트가 리랜더링 되면서 출력된 화면에서 값이 변하게됨
const testFn = () => {
if(test === 'A') setTest('B');
else setTest('A');
}
return(
<>
<h1>{test}</h1>
{/* onClick : 버튼이 클릭되었을 때 */}
<button onClick={testFn}>Change!!</button>
</>
)
}
export default StateEx1;