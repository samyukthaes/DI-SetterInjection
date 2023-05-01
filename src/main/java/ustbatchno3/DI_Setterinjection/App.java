package ustbatchno3.DI_Setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	Role s = context.getBean("Role",Role.class);
    	s.display();
    	ApplicationContext context1 =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	Role s1 = context1.getBean("Roles",Role.class);
    	s1.display();
    }
}
