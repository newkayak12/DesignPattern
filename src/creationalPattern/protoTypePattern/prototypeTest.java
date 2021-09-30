package creationalPattern.protoTypePattern;

public class prototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee emps = new Employee();
		emps.loadData();
		// 여기 까지가 데이터를 불러왔다고 가정하고

		Employee newEmp1 = (Employee) emps.clone();
		Employee newEmp2 = (Employee) emps.clone();
		newEmp1.getEmplList().add("park");
		newEmp2.getEmplList().add("kim");
		newEmp2.getEmplList().remove("tim");

		System.out.println("original : " + emps.getEmplList());
		System.out.println("emp1 : " + newEmp1.getEmplList());
		System.out.println("emp2 : " + newEmp2.getEmplList());
// 깊은 복사를 하지 않았다면 각 객체마다 DB에서 가져왔어야 한다. 그러나 미리 만들어 놓은 protoType을 놓고 복사하면서 비용을 줄였다.
	}
}
