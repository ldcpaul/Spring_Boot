# Spring_Boot

### 간단한 명세 - 이후 수정할 예정 ###
| REST-API 명세 | 조회결과 |
| :---: | :---: |
|  **`api/list/departments`** |**`학과 전체목록 조회`**  |
|  **`api/list/users`** |**` 유저 전체목록 조회`**  |
| **`api/list/department/`<font color='orange'>`{departmentId}`</font> `/students`** |**`학과아이디로 해당학과 학생 목록 조회`** |
| **`api/list/department/`<font color='orange'>`{departmentId}`</font> `/users`** |**`학과아이디로 해당학과 소속 유저 목록 조회`** |
| **`api/list/department/`<font color='orange'>`{departmentId}`</font> `/professors`** |**`학과아이디로 해당학과 교수 목록 조회`** |
| **`api/list/student/`<font color='navy'>`{studentId}`</font> `/courses`** |**`학생 아이디로 학생 수강과목 목록 조회`** |
| **`api/list/professor/`<font color='crimson'>`{professorId}`</font> `/courses`** |**`교수 아이디로 교수가 강의중인 과목 목록 조회`** |
| **`api/join/id/`<font color='seagreen'>`{userId}`</font>** |**`userId의 중복여부`** |
| **`api/join/password1/`<font color='coral'>`{password1}`</font> `/password2/`<font color='hotpink'>`{password2}`</font>** |**`비밀번호 , 비밀번호 확인 일치 여부 `** |
| **`api/join/userid/`<font color='seagreen'>`{userid}`</font> `/name/`<font color='darkviolet'>`{name}`</font>`/password/`<font color='indianred'>`{password}`</font> `/email/`<font color='blue'>`{email}`</font>`/departmentId/`<font color='orange'>`{departmentId}`** |**`회원 가입 처리 , 수정도 넣을 예정`** |
| **`api/login/id/`<font color='seagreen'>`{userid}`</font> `/password/`<font color='indianred'>`{password}`**|**`id / password 로 로그인 성공여부 조회`** |
| **`api/search/userid/`<font color='seagreen'>`{userid}`</font>**|**`userId로 유저정보 조회`** |
| **`api/search/userName/`<font color='seagreen'>`{search}`</font>**|**`유저 이름 검색을 통해 앞부분 일치하는 유저 정보 조회`** |
| **`api/search/studentName/`<font color='seagreen'>`{search}`</font>**|**`학생이름 검색을 통해 앞부분 일치하는 학생조회 `** |
| **`student/studentNo/{studentNo}/studentName/{name}/departmentId/{departmentId}/year/{year}`**|**`학생 데이터 추가`** |
