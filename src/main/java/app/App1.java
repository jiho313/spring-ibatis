package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import vo.Employee;

public class App1 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis-context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		
		Employee employee = dao.getEmployeeById(100);
		System.out.println(employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getPhoneNumber());
		System.out.println(employee.getHireDate());
		System.out.println(employee.getJobId());
		System.out.println(employee.getSalary());
		System.out.println(employee.getCommissionPct());
		System.out.println(employee.getManagerId());
		System.out.println(employee.getDepartmentId());
	}
}
