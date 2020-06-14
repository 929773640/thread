
public class InfoTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().isAlive());
		MyInfo mi = new MyInfo("zdj");
		Thread t = new Thread(mi);
		t.setName("ghj");
		t.start();
		Thread.sleep(1000);
		System.out.println(t.isAlive());
	}
}
class MyInfo implements Runnable{
	private String name=null;
	
	public MyInfo(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"--->"+name);
	}
}