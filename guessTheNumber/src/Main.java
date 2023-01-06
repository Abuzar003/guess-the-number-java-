import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);

        do {
            System.out.println("Guess a number (1-100): ");
            int usernumber = sc.nextInt();

            if(usernumber == myNumber)
            {
                System.out.println("Boom!!! you got that right");
                break;
            }
            else if(usernumber > myNumber)
            {
                System.out.println("your number is small");
            }
            else
            {
                System.out.println("your number is big");
            }

        } while(myNumber>=0);
        System.out.println("mynumber was: ");
        System.out.println(myNumber);
    }
}
