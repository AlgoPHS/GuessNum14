import java.util.Scanner;
public class PM_BL_GuessNum{
	public static void main(String[] args){
		runGame(startAndGetNum());
	}
	public static int startAndGetNum(){
		//TODO: for Brian -- please print the opening statement and return the number the user will be trying to guess
		return 9; //for testing purposes (to make sure my part compiles);
	}
	public static void runGame(int num){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String single = "try!!!";
		String moreThanSingle = "tries!!!";
		while(true){
			int guess = sc.nextInt();
			counter++;
			if(guess==num){
				if(counter ==1)
					System.out.println("You got it in " + counter + single);
				else
					System.out.println("You got it in " + counter + moreThanSingle);
				System.exit(1); //or playing = false;
			}
			else if(guess>num){
				System.out.println("Too high!!");
			}
			else{
				System.out.println("Too low!");
			}
		}
	}
}