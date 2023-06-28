package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import vo.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis-context.xml");
		
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);
		
		Employee emp = new Employee();
		emp.setFirstName("김");
		emp.setLastName("유신");
		emp.setEmail("kim@gmail.com");
		emp.setPhoneNumber("010-2222-2222");
		emp.setJobId("IT_PROG");
		emp.setSalary(6000);
		
		dao.insertEmployee(emp);
	}
}
