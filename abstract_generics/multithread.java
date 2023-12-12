package abstract_generics;

class thread1 extends Thread{
	@Override
	public void run() {
		for(int i =0; i< 10; i++) {
			System.out.println("therad1 : "+i);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class thread2 extends Thread{
	@Override
	public void run() {
		for(int i =0; i< 10; i++) {
			System.out.println("therad1 : "+i);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class multithread {
	public static void main(String []args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		t1.start();
		t2.start();
		
		try {t1.join(); 
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
