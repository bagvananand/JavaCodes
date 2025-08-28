class values{
	int count;
	public synchronized void touchcount()
	{
		count++;
	}
}

public class MultithreadingDemo implements Runnable {
	private Thread t;
	private String threadname;
	private int interval;
	values valobj;
	
	MultithreadingDemo(values obj, String name, int interval1){
		threadname = name;
		interval=interval1;
		valobj=obj;
		System.out.println(threadname+" thread is created");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(threadname+" thread is running");
		for (int i=0;i<5;i++)
		{	
			valobj.touchcount();
			try {
				System.out.println(threadname+":"+valobj.count);
				Thread.sleep(600*interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
		
	public void start() {					
		System.out.println(threadname+" thread is started");
		if( t == null) {
			t = new Thread(this, threadname);
			t.start();
		}
	}
		

}
