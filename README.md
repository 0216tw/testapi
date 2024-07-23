# testapi
자바 수업에 활용하기 위한 간단한 restful api 입니다.
HR(인사) 정보를 조회 , 수정 , 삭제 , 삽입 할 수 있습니다. 
데이터 입출력은 json으로 처리합니다. 

DB의 경우 실제 적재하지 않고 프로젝트 내 json 파일에 처리합니다. 

[실제 사용 버전] 
특정 인사 조회하기 GET     /api/emps/{empId} 
모든 인사 조회하기 GET     /api/emps
특정 인사 삭제하기 DELETE  /api/emps/{empId}
특정 인사 수정하기 PATCH   /api/emps
특정 인사 등록하기 POST   /api/emps 

[실습 버전] - 실습 버전은 로직이 미구현되어있습니다. 학생들이 하나씩 구현해야 합니다. 
특정 인사 조회하기 GET     /test/emps/{empId} 
모든 인사 조회하기 GET     /test/emps
특정 인사 삭제하기 DELETE  /test/emps/{empId}
특정 인사 수정하기 PATCH   /test/emps
특정 인사 등록하기 POST   /test/emps 
