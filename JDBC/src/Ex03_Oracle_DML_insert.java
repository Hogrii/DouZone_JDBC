/***
 * 
 * JDBC 작업
 * 
 * 1. select
 * 1.1 결과 집합 생성
 * 
 * 2. insert, update, delete
 * 2.1 결과 집합 생성 없음 >> ResultSet (x)
 * 2.2 반영 결과 return(반영된 행의 수) >> update 5건 수정 >> return : 5
 * 
 * ex)
 * update emp set sal = 0; >> 실행 >> update 14건 >> return : 14
 * update emp set sal = 100 where empno = 9999; >> update 0건 >> return : 0
 * 
 * 결과를 받아서 자바코드 로직처리
 * 
 * Today key Point
 * 1. Oracle DML(Sqldeveloper, Cmd(sqlplus), Tool)로 작업시 commit or rollback 강제
 * 2. JDBC API를 사용해서 Oracle의 DML 작업을 수행하면 >> default >> auto commit >> Java에서 insert문을 날리면 무조건 실반영
 * 3. JDBC API를 사용해서 Java 코드로 delete from emp를 실행하면 >> JDBC 자동 commit >> 실반영
 * 4. 그래서 JDBC API는 옵션을 통해 commit, rollback을 강제하는 방법을 제공한다
 * 
 * begin
 * 	A 계좌 인출(update ...)
 * 	B 계좌 입금(update ...)
 * end
 * 논리적인 단위로 트랜잭션(transaction)
 * 전체 성공 아니면 실패 >> commit or rollback
 * 
 * >> 업무 처리 >> JDBC >> auto commit 옵션을 'false로 전환'
 * >> 반드시 Java 코드에서도 똑같이 commit, rollback을 무조건 처리해줘야 한다
 * 
 * >> 트랜잭션은 같은 DML은 허용하지 않는다.
 * 	>> update 이후 select은 허용하지만
 * 	>> delete 이후 update는 허용하지 않는다 >> 기본적으로 트랜잭션이 lock을 수반하기 때문
 */
public class Ex03_Oracle_DML_insert {
	public static void main(String[] args) {
		
	}
}
