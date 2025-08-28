package inter.view.quest;

public class datapack {
	private int packsize;
	private String signaltype;

	public datapack() {}
	
	public String getSignaltype() {
		return signaltype;
	}

	public void setSignaltype(String signaltype) {
		this.signaltype = signaltype;
	}

	public int getPacksize() {		
		return packsize;
	}

	public void setPacksize(int packsize) {		
		this.packsize = packsize;
	}

	public datapack(int packsize, String signaltype) {
		System.out.println("datapack Constructed with "+ packsize + " by default");
		System.out.println("datapack Constructed with "+ signaltype + " by default");
		this.packsize = packsize;
		this.signaltype=signaltype;
	}
	

}
