package Org.Company;

import java.util.ArrayList;
import java.util.List;

public class Details {
	public static void main(String[] args) {
		List <EmployeeDetails> l = new ArrayList<>();
		
		EmployeeDetails d=new EmployeeDetails ();
		d.setId(1);
		d.setName("gok");
		d.setPhno(77089157l);
		
		EmployeeDetails d1=new EmployeeDetails ();
		d1.setId(2);
		d1.setName("Kar");
		d1.setPhno(71234569l);
		
		l.add(d);
		l.add(d1);
		
		System.out.println(l.get(0).getName());
		
		for (int i=0; i<l.size(); i++) {
			int a = l.get(i).getId();
			System.out.println(a);
			String b = l.get(i).getName();
			System.out.println(b);
			Long c = l.get(i).getPhno();
			System.out.println(c);
				}
	}

}
