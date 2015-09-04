import java.util.Scanner;

public class testRock_1 {

	
	
	public static void main(String[] args) {
		
		Scanner myScan= new Scanner (System.in);
		
		Player player1 = new Player();
		
		System.out.println("please enter your name");
        String player1Name = myScan.nextLine();	 
		player1.setName(player1Name);
		
		myScan.close();
	}

}
