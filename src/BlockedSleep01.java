
public class BlockedSleep01 {
	public static void main(String[] args) {
		Web12306 wb1 = new Web12306();
	
		new Thread(wb1,"1").start();
		new Thread(wb1,"2").start();
		new Thread(wb1,"3").start();
	}
}
class Web12306 implements Runnable {
	private int ticketNums = 99;
	@Override
	public void run() {
		while(true) {
			if(ticketNums<0) {
				System.out.println("没票了");
				break;
			}
			//模拟延时
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
		}
	}
}