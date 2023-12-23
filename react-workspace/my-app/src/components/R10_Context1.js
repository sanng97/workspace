import React, {createContext, useContext} from 'react';

/* 1. Context 객체 생성 */
const TestContext = createContext();

/* 4. 손주 (2단계 하위) 컴포넌트 */
const GrandChild = () => {
  // 현재 컴포넌트에서 Context 객체를 사용
  // -> TestContext에 담긴 값을 얻어와 temp에 저장
  const temp = useContext(TestContext);

  return(
    <>
    {/* Parent에서 전달한 값이 Child를 거치지 않고 바로 GrandChild로 전달된 형태*/}
    <h3>GrandChild Component ({temp}) </h3>
    </>
    );
    }


    /* 3. 자식 (1단계 하위) 컴포넌트 */

    const Child = () => {
      return (
     <>
     <h2>Child Component</h2>
     <GrandChild/>

     </>
      );
    }

/* 2. 부모 컴포넌트 */
const Parent = () => {
  return(
  /* Context 객체를 이용해 하위 컴포넌트에 value 제공 */
  <TestContext.Provider value='Parent에서 전달한 값'>
  <h1>Parent Component</h1>
  <Child/> {/* Child 포함 모든 하위 컴포넌트에서 Parent가 제공한 value 사용 가능 */}
  </TestContext.Provider>
  );
  }
  export default Parent;