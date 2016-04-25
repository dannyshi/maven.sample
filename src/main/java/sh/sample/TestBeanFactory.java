package sh.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 20160425 2
		ApplicationContext context = new ClassPathXmlApplicationContext(
		        new String[] {"a.xml", "b.xml"});
		// of course, an ApplicationContext is just a BeanFactory
		BeanFactory f1 = (BeanFactory) context;
		System.out.println(f1.getBean("aid"));
		System.out.println(f1.getBean("aname"));
		System.out.println(f1.getBean("bid"));
		System.out.println(f1.getBean("bid"));
		System.out.println(f1.getBean("bname"));

		printstrings(f1.getAliases("bid"));
		printstrings(f1.getAliases("bname"));
		printstrings(f1.getAliases("bname2"));
		
		printstrings(context.getBeanDefinitionNames());
	}
	
	public static void printstrings(String[] s){
		if(null == s || s.length ==0){
			System.out.println("The array is empty!!!!");
			return;
		}
		
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
	}

}
