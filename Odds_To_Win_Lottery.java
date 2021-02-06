
public class Odds_To_Win_Lottery {

	public static void main(String[] args) {
		int count = 0;
		int flag = 0;
		int[] user = new int [6];
		int[] lott = new int [6];
		int userStrong = 0;
		int lottStrong = 0;
		
		while (flag < 7) {
			flag = 0;
			for (int i = 0; i < 6; i++) {
				user[i] = (int)(Math.random()*37+1);
				for (int check = 0; check < i; check++) {
					if (user[check] == user[i]) {	
						i--;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				lott[i] = (int)(Math.random()*37+1);
				for (int check = 0; check < i; check++) {
					if (lott[check] == lott[i]) {	
						i--;
					}
				}
			}
			userStrong = (int)(Math.random()*7+1);
			lottStrong = (int)(Math.random()*7+1);
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (user[i] == lott[j]) {
						flag++;
					}
				}
			}
			if (userStrong == lottStrong) {
				flag++;
			}
			count++;
		}
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print("User's: ");
			}
			System.out.print(user[i]+" ");
		}System.out.println("\nUser's Strong: "+userStrong);
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print("Lott: ");
			}
			System.out.print(lott[i]+" ");
		}System.out.println("\nLott's Strong: "+lottStrong);
		System.out.println("Count is: "+count);

	}

}
