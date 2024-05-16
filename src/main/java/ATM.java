import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        double balance = 1607.8, amount, balanceAlt;
        String userName, pass;
        int sec, kalanHak=3, yHak;

        while (kalanHak>0)
        {
            System.out.print("Username:");
            userName = tara.next();
            System.out.print("Password:");
            pass = tara.next();
            if (userName.equals("alperen") && pass.equals(("alp123")))
            {
                System.out.println("Credentials okay. Welcome!");
                boolean valid = true;
                do
                {
                    System.out.print("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit\nPlease choose the operation:");
                    sec = tara.nextInt();
                    switch (sec)
                    {
                        case 1:
                            System.out.println("Specify the amount to withdraw:");
                            amount = tara.nextFloat();
                            if (amount>balance)
                            {
                                System.out.println("Insufficient balance, try again.");
                                System.out.printf("Current balance: %.2f TL", balance);
                            }
                            else
                            {
                                System.out.println("Transaction succesful.");
                                balanceAlt = balance;
                                balanceAlt -= amount;
                                System.out.printf("Current balance: %.2f TL\n", balanceAlt);
                            }
                            break;
                        case 2:
                            System.out.println("Specify the amount to deposit:");
                            amount = tara.nextFloat();
                            balanceAlt = balance;
                            balanceAlt += amount;
                            System.out.printf("Current balance: %.2f TL\n", balanceAlt);
                            break;

                        case 3:
                            System.out.printf("Current balance: %.2f TL\n", balance);
                            break;

                    }

                }while (sec != 4);
                break;
            }
            else
            {
                yHak = kalanHak-=1;
                System.out.printf("Invalid entry.\nRemaining attempts: %d\n", yHak);
                if (yHak == 0)
                    System.out.print("Your account is blocked due to excessive wrong trials.\nPlease refer to your bank.");
            }
        }

    }
}
