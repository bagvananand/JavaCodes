package inter.view.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vodophone implements sim {
    
    private datapack dp;
	
    @Autowired
    @Qualifier("datapack5G")
	public void setdatapack(datapack dp) {
    	System.out.println("datapack is ${datapack}");
		System.out.println("Datapack Setter is called in Vodophone");
		this.dp = dp;
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Vodophone");

	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		dp.setPacksize(20);
		System.out.println("Browsing using Vodophone");
		System.out.print("in "+ dp.getSignaltype()+" ");
		System.out.println("with "+ dp.getPacksize()+" GB plan");

	}

}
