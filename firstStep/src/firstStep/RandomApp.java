package firstStep;
 
import java.io.IOException;
import java.util.Scanner; 

public class RandomApp {
	
	public static void main(String[] args) {
		System.out.println("inserire range di valori possibili");
		Scanner input = new Scanner(System.in);
		int max  = input.nextInt();
		 
		try {
			 
			System.out.println("max:" +max);
			System.out.println("x:" +max*Math.random());
		for(int i=0; i<10;i++) {
		int x = ((int) (100*Math.random())%max);
		System.out.println(x);
		}
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			input.close();
		}
	}
	

}
