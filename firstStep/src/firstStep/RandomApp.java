package firstStep;

public class RandomApp {
	
	public static void main(String[] args) {
		for(int i=0; i<100;i++) {
		int x = ((int) (100*Math.random())%50);
		System.out.println(x);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

}
