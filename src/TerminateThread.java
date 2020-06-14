
public class TerminateThread implements Runnable{
	//加入标识
	private boolean flag = true;
	
	@Override
	public void run() {
		int i = 0;
		// TODO Auto-generated method stub
		while(flag){
			System.out.println(i++);
		}
	}
	public void terminate() {
		this.flag = false;
	}
	
	public static void main(String[] args) {
		TerminateThread tt = new TerminateThread();
		new Thread(tt).start();
		
		for (int i = 0; i < 100; i++) {
			if(i==88) {
				tt.terminate();
				System.out.println("tt gameover");
			}
			System.out.println("main");
		}
	
		
	}

}
