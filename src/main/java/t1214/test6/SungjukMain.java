package t1214.test6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjukBeans.xml");
		
		SungjukVO vo1 = (SungjukVO) ctx.getBean("vo1");
		vo1.getSungjukCalculator();
		System.out.println("----------------------------");
		
		SungjukVO vo2 = (SungjukVO) ctx.getBean("vo2");
		vo2.getSungjukCalculator();
		System.out.println("----------------------------");
		
		SungjukVO vo3 = (SungjukVO) ctx.getBean("vo3");
		vo3.getSungjukCalculator();
		System.out.println("----------------------------");
		
	}
}
