import java.util.Scanner;
public class PM_BL_GuessNum{
	public static void main(String[] args){
		runGame(startAndGetNum());

	}

	public static int startAndGetNum(){
		System.out.println("I have a number between 1 and 100.");
  	System.out.println("Can you guess my number?");
		return 1 + (int) Math.random() * 100;
	}

	public static void runGame(int num){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String single = " try!!!";
		String moreThanSingle = " tries!!!";
		boolean done = true;
		while(done){
			int guess = sc.nextInt();
			counter++;
			if(guess==num){
				if(counter ==1)
					System.out.println("You got it in " + counter + single);
				else
					System.out.println("You got it in " + counter + moreThanSingle);
				done = !done;
			}
			else if(guess>num){
				System.out.println("Too high!!");
			}
			else{
				System.out.println("Too low!");
			}
		}
		System.out.println("Play again? y/n ");
		if(sc.next().equals("y")){
			main(new String[1]);
		}
		sc.close();
	}
}
