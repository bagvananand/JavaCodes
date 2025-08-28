package inter.view.quest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Airtel airtel = new Airtel();
		//sim simcard = new Airtel();
		//simcard.calling();
		//simcard.data();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");
		
		
		//Airtel air = (Airtel)context.getBean("airtel");
		//Vodophone voda = context.getBean("vodophone", Vodophone.class);
		//voda.calling();
		sim simcard = context.getBean("sim", sim.class);
		simcard.data();

		String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {

            System.out.println(beanName + " : " + context.getBean(beanName).getClass().toString());
        }
	}

}


