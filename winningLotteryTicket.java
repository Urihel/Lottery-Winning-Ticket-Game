import java.util.Scanner;
public class winningLotteryTicket {

	public static void main(String[] args) {
		
		int[] intArray;
		intArray = new int[5];
		
		int[] lotArray2;
		lotArray2 = new int[5];
		lotArray2[0] = 1; lotArray2[1] = 9; lotArray2[2] = 15; lotArray2[3] = 33; lotArray2[4] =  40;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1 - 55: ");
		for (int i = 0; i < intArray.length; i++)  {
			intArray[i] = scan.nextInt();
			System.out.print(intArray[i]+" ");
		}
		
		if(intArray[0] < 1 || intArray[0] > 55 ) {
			System.out.print('\n'+"Invalid Entry Please Re-Enter Lottery Numbers!!!!!");
		}else if(intArray[0] == lotArray2[0] && intArray[1] == lotArray2[1] && intArray[2] == lotArray2[2] && intArray[3] == lotArray2[3] && intArray[4] == lotArray2[4]) {
			System.out.println('\n'+ "Congratulations You Just Won The Lottery!!!!");
		}
		//--------------------end of code line-----------------------------------------------------------------------
	}
}
