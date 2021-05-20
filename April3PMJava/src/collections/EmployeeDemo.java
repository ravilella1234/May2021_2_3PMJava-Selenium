package collections;

public class EmployeeDemo
{
	private int eno=1744;
	private String ename="ravilella";
	
	public int getEno() {
		return eno;
	}
	
	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public static void main(String[] args) 
	{
		EmployeeDemo emp = new EmployeeDemo();
		System.out.println(emp.eno);
		System.out.println(emp.ename);
	}

}
