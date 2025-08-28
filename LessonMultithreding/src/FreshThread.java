
public class FreshThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		values val = new values();
		MultithreadingDemo t1 = new MultithreadingDemo(val,"Thread1",1);
		t1.start();
		
		MultithreadingDemo t2 = new MultithreadingDemo(val,"Thread2",1);
		t2.start();

	}

}
