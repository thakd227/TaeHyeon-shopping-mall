/**
 *  2020년 06월 11일 
 *  만든사람 : 최영원
 *  용도 : 기본 폼 제어 하기 
 */
function  ch1(){
  if (f1.custname.value==""){ 
  alert("이름을 입력해 주세요"); 
  return  false; 
  }
}  
  
function Search() {
 alert("Form Search");
 location.href='http://localhost:8081/k1/member_list.do' ;
  }
