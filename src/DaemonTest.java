
public class DaemonTest {
	public static void main(String[] args) {
		God god = new God();
		you y = new you();
		Thread t = new Thread(god);
		t.setDaemon(true);
		t.start();
		new Thread(y).start();
	}
}
class you implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 365*100; i++) {
			System.out.println("happy life...");
			
		}
		System.out.println("oooooo");
	}
}
class God implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 365*100000000; i++) {
			System.out.println("bless you...");
			
		}
	}
}