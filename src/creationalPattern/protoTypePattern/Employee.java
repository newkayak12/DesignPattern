package creationalPattern.protoTypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	private List<String> empList;
	public Employee(){
		empList= new ArrayList<>();
	}
	public Employee(List<String> list){
		empList = list;
	}
	

	public void loadData(){
		empList.add("Lisa");
		empList.add("steve");
		empList.add("tim");
	}
	public List<String> getEmplList(){
		return empList;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String s : this.empList){
			temp.add(s);
		}
		return new Employee(temp);
	}
	// clone() 메소드 재정의를 위해서 cloneable인터페이스를 구현, clone은 deepclone을 시행
	
}
