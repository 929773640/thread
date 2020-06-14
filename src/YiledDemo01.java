
public class YiledDemo01 {
	public static void main(String[] args) {
		MyYiled my = new MyYiled();
		new Thread(my,"a").start();
		new Thread(my,"b").start();
	}
}
class MyYiled implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->start");
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"-->end");
	}
	
}