package t1214.test8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActorMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/actorBeans.xml");
		
		Actor policeMan = (Actor) ctx.getBean("policeMan");
		Actor doctor = (Actor) ctx.getBean("doctor");
		Actor fireMan = (Actor) ctx.getBean("fireMan");
		
		policeMan.getCasting();
		doctor.getCasting();
		fireMan.getCasting();
	}
}
