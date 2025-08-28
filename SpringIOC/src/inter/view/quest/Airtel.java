package inter.view.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airtel implements sim {
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("datapack5G")
	 */
	private datapack dp;

	
	  @Autowired
	  @Qualifier("datapack4G") 
	  public void setdatapack(datapack dp) 
	  {
		  System.out.println("Datapack Setter is called in Airtel"); this.dp = dp; 
	  }
	 

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel");

	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing using Airtel");
		System.out.print("in "+ dp.getSignaltype()+" ");
		System.out.println("with "+ dp.getPacksize()+" GB plan");

	}

}
