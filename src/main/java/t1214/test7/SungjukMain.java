package t1214.test7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk2Beans.xml");
		
		//ctx.getBean("sungjukService1");
		//System.out.println("----------------------------");
		
		//ctx.getBean("sungjukService2");
		//System.out.println("----------------------------");
		
		//ctx.getBean("sungjukService3");
		//System.out.println("----------------------------");
		
		ctx.close();
	}
}
