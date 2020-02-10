package student;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class StudentDemo {

	public static void main(String[] args) {
		ApplicationContext appCon=new ClassPathXmlApplicationContext("StudentConfig.xml"); 
		StudentBean factory=(StudentBean)appCon.getBean("StudentBean"); 
		factory.displayInfo(); 
	}

}
