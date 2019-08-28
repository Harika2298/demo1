package Setter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterMain 
{
    public static void main(String[] args)
    { 
      Resource r=new ClassPathResource("spring.xml"); 
      BeanFactory factory=new XmlBeanFactory(r); 
      SetterPojo sp = (SetterPojo)factory.getBean("p1"); 
      sp.display();
    } 
} 

