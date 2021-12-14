package t1214.test4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorRun {
	public static void main(String[] args) {
		// xml을 통해서 값을 주입한다.
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/test4Beans.xml");
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:xml/test4Beans.xml");
		
		//CalculatorVO vo = ctx.getBean("vo", CalculatorVO.class);
		CalculatorVO vo = (CalculatorVO) ctx.getBean("vo");
		
		vo.add();
		vo.sub();
		vo.mul();
		vo.div();
		
	}
}
