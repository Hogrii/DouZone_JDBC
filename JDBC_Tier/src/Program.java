import DTO.Dept;
import DTO.Emp;

public class Program {
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptno(100);
		dept.setDname("IT");
		dept.setLoc("SEOUL");
		System.out.println(dept.toString());
		
		Emp emp = new Emp(200, "김유신");
		System.out.println(emp.toString());
	}
}
