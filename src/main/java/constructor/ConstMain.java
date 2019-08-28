package constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstMain 
{
   public static void main(String args[])
   {
      Resource resource=new ClassPathResource("spring.xml"); 
      BeanFactory factory=new XmlBeanFactory(resource); 
      Const c=(Const)factory.getBean("p2");
      c.display();
}
}