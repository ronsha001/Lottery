import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // scanner

        int numb1, numb2, numb3, numb4, numb5, numb6, strongNum;
        int num1, num2, num3, num4, num5, num6, strong;


        do {
            print("1 2 3 4 5 6 7 8 9 10 11" + "\n" +
                    "12 13 14 15 16 17 18 19" + "\n" +
                    "20 21 22 23 24 25 26 27" + "\n" +
                    "28 29 30 31 32 33 34 35 36 37" + "\n" +
                    "Enter your first number(1-37) here:");
            numb1 = in.nextInt(); //numb1
        } while (numb1 > 37 || numb1 < 1);

        do {
            print("1 2 3 4 5 6 7 8 9 10 11" + "\n" +
                    "12 13 14 15 16 17 18 19" + "\n" +
                    "20 21 22 23 24 25 26 27" + "\n" +
                    "28 29 30 31 32 33 34 35 36 37" + "\n" +
                    "Enter your second number(1-37) here:"); //numb2
            numb2 = in.nextInt();
        } while (numb2 > 37 || numb2 < 1 || numb2 == numb1);

        do {
            print("1 2 3 4 5 6 7 8 9 10 11" + "\n" +
                    "12 13 14 15 16 17 18 19" + "\n" +
                    "20 21 22 23 24 25 26 27" + "\n" +
                    "28 29 30 31 32 33 34 35 36 37" + "\n" +
                    "Enter your third number(1-37) here:"); // numb3
            numb3 = in.nextInt();
        }while(numb3 > 37 || numb3 < 1 || numb3 == numb1 || numb3 == numb2);

        do {
            print("1 2 3 4 5 6 7 8 9 10 11" + "\n" +
                    "12 13 14 15 16 17 18 19" + "\n" +
                    "20 21 22 23 24 25 26 27" + "\n" +
                    "28 29 30 31 32 33 34 35 36 37" + "\n" +
                    "Enter your fourth number(1-37) here:"); //numb4
            numb4 = in.nextInt();
        }while(numb4 > 37 || numb4 < 1 || numb4 == numb1 || numb4 == numb2 || numb4 == numb3);

        do {
            print("1 2 3 4 5 6 7 8 9 10 11" + "\n" +
                    "12 13 14 15 16 17 18 19" + "\n" +
                    "20 21 22 23 24 25 26 27" + "\n" +
                    "28 29 30 31 32 33 34 35 36 37" + "\n" +
                    "Enter your fifth number(1-37) here:");//numb5
            numb5 = in.nextInt();
        }while(numb5 > 37 || numb5 < 1 || numb5 == numb1 || numb5 == numb2 || numb5 == numb3 || numb5 == numb4);

        do {
            print("1 2 3 4 5 6 7 8 9 10 11" + "\n" +
                    "12 13 14 15 16 17 18 19" + "\n" +
                    "20 21 22 23 24 25 26 27" + "\n" +
                    "28 29 30 31 32 33 34 35 36 37" + "\n" +
                    "Enter your sisxth number(1-37) here:"); //numb6
            numb6 = in.nextInt();
        }while(numb6 > 37 || numb6 < 1 || numb6 == numb1 || numb6 == numb2 || numb6 == numb3 || numb6 == numb4 || numb6 == numb5);

        do {
            print("1 2 3 4 5 6 7" + "\n" +
                    "Enter your STRONG number (1-7) over here:"); //strongNum
            strongNum = in.nextInt();
        }while(strongNum > 7 || strongNum < 1);

            System.out.println("your final SIX numbers: " + numb1 + " " + numb2 + " " + numb3 + " " + numb4 + " " + numb5 + " " + numb6);
            System.out.println("Your final STRONG number: " + strongNum);


        do {
            num1 = (int)Math.round(Math.random() * 37);
            num2 = (int)Math.round(Math.random() * 37);
            num3 = (int)Math.round(Math.random() * 37);
            num4 = (int)Math.round(Math.random() * 37);
            num5 = (int)Math.round(Math.random() * 37);
            num6 = (int)Math.round(Math.random() * 37);
            strong = (int)Math.round(Math.random() * 7);
        }while (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6 ||
        num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5 || num4 == num6 || num5 == num6 || num1 < 1 || num2 < 1 || num3 < 1 || num4 < 1 ||
        num5 < 1 || num6 < 1 || strong < 1);




        System.out.println("Lottery final SIX numbers: "+num1 +" "+ num2 + " "+ num3 + " " +num4 + " "+num5+ " "+num6);
        System.out.println("Lottery fina STRONG number: "+strong);
        print(" ");
        System.out.println("SOME FACTS: The chance to be killed by meteor impact is higher then win the lottery.");
        System.out.println("The chance to win the lottery is: 1 : 8,136,744");






    }
    public static void print(String s){

        System.out.println(s);
    }

}