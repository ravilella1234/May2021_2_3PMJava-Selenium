package collections;

public class EmployeeDemo1 extends EmployeeDemo
{

	public static void main(String[] args) 
	{
		EmployeeDemo1 e = new EmployeeDemo1();
		//System.out.println(e.eno);
		//System.out.println(e.ename);
		
		e.setEno(100);
		e.setEname("sai");
		
		System.out.println(e.getEno());
		System.out.println(e.getEname());
	}

}
