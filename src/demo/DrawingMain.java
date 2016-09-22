package demo;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingMain {
public static ApplicationContext context;




public static void main(String[] args) {
    ApplicationContext context = 
           new ClassPathXmlApplicationContext("spring.xml");
 
		//Triangle t=(Triangle) context.getBean("triangle");
    list t=(list) context.getBean("list");
	t.Listner();
	
	
	}
}
