import java.util.Scanner;

public class Javamain {
    public static double i = 0, j = 0, sum = 0, count = 0, k, ex, discount=0;

    public static void main(String[] args) {
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        while (choose < 4) {
            switch (choose) {
                case 0:
                    System.out.println("Car Models available");
                    System.out.println("Sno\tModel\t\tPrice\n1.\tHATCHBACK\tRs 5.35 Lakh\n2.\tSALOON\t\tRs 4.95 Lakh\n3.\tESTATE\t\tRs 6.25 Lakh");
                    System.out.println("\nTo Exit\tPress 4\nPlease Enter your Choice");

                    int n = sc.nextInt();
                    if (n < 0 || n > 4) {
                        System.out.println("Enter a Valid Choice");
                        n = 0;
                    } else {
                        choose = n;
                    }
                    break;

                case 1:
                    i = 535000;
                    System.out.println("You choose HATCHBACK\nPrice of HATCHBACK is Rs 5.35 Lakh");
                    System.out.println("\nPress 0 to go back to MENU");
                    System.out.println("Press 1 to Select Extras");
                    System.out.println("Press 4 to EXIT");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        extra();
                        break;
                    }
                    break;

                case 2:
                    i = 495000;
                    System.out.println("You choose SALOON\nPrice of SALOON is Rs 4.95 Lakh");
                    System.out.println("\nPress 0 to go back to MENU");
                    System.out.println("Press 1 to Select Extras");
                    System.out.println("Press 4 to EXIT");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        extra();
                        break;
                    }
                    break;

                case 3:
                    i = 625000;
                    System.out.println("You choose ESTATE\nPrice of ESTATE is Rs 6.25 Lakh");
                    System.out.println("\nPress 0 to go back to MENU");
                    System.out.println("Press 1 to Select Extras");
                    System.out.println("Press 4 to EXIT");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        extra();
                        break;
                    }
                    break;

                /*default:
                    System.out.println("Invalid Input\nPlease insert the correct input");
                    choose = 0;
                    break;*/

            }

        }
    }


    public static void extra() {
        int choice = 0;
        Scanner sc1 = new Scanner(System.in);
        while (choice < 6) {
            switch (choice) {
                case 0:
                    System.out.println("S.No\tOptional Extra\t\t\tPrice");
                    System.out.println("1.\t\tSet of luxury seats\t\tRs 45000");
                    System.out.println("2.\t\tSatellite Navigation\tRs 5500");
                    System.out.println("3.\t\tParking Sensors\t\t\tRs 10000");
                    System.out.println("4.\t\tBluetooth Connectivity\tRs 350");
                    System.out.println("5.\t\tSound System\t\t\tRs 1000");
                    System.out.println("To Exit Press 6\nEnter your Choice");

                    int m = sc1.nextInt();
                    if (m < 0 || m > 7) {
                        System.out.println(" Enter a valid choice");
                        m = 0;
                    } else {
                        choice = m;
                    }
                    break;

                case 1:
                    count++;
                    k = 45000;
                    price(); //System.out.println("count:"+ count);
                    System.out.println("You choose Set of luxury seats\nPrice for  Set of luxury seats is Rs 45000");
                    System.out.println("Total Price = " + sum);
                    System.out.println("\n Press 0 to choose more Extras If not press 7");
                    System.out.println(" Press 6 to Exit");
                    choice = sc1.nextInt();

                    break;


                case 2:
                    count++;
                    k = 5500;
                    price();   //System.out.println("count:"+ count);
                    System.out.println("You choose Satellite Navigation\nPrice for Satellite Navigation is Rs 5500");
                    System.out.println("Total Price = " + sum);
                    System.out.println("\n Press 0 to choose more Extras If not press 7");
                    System.out.println(" Press 6 to Exit");
                    choice = sc1.nextInt();

                    break;

                case 3:
                    count++;
                    k = 10000;
                    price();  // System.out.println("count:"+ count);
                    System.out.println("You choose Parking Sensors\nPrice for Parking Sensors is Rs 10000");
                    System.out.println("Total Price = " + sum);
                    System.out.println("\n Press 0 to choose more Extras If not press 7");
                    System.out.println(" Press 6 to Exit");
                    choice = sc1.nextInt();

                    break;

                case 4:
                    count++;
                    k = 350;
                    price();   //System.out.println("count:"+ count);
                    System.out.println("You choose Bluetooth Connectivity\nPrice for Bluetooth Connectivity is Rs 350");
                    System.out.println("Total Price = " + sum);
                    System.out.println("\n Press 0 to choose more Extras If not press 7");
                    System.out.println(" Press 6 to Exit");
                    choice = sc1.nextInt();

                    break;

                case 5:
                    count++;
                    k = 1000;
                    price();  // System.out.println("count:"+ count);
                    System.out.println("You choose Sound System\nPrice for Sound System is Rs 1000");
                    System.out.println("Total Price = " + sum);
                    System.out.println("\n Press 0 to choose more Extras If not press 7");
                    System.out.println(" Press 6 to Exit");
                    choice = sc1.nextInt();

                    break;


               /* default:
                    System.out.println("Invalid Input\nPlease insert the correct input");
                    choice = 0;
                    break;*/

            }

        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Are you an Exiting Customer\t(1/0)");
        int ask = sc2.nextInt();
        if (ask == 1) {
            sum = sum - (sum * 0.1);
        }
        System.out.println("New Price\t:\t" + sum);


        System.out.println("Do you have an old car to Trade in(1/0)");
        ask = sc2.nextInt();
        if (ask == 1) {
            System.out.println("Enter trade in amount");
            ask = sc2.nextInt();
            System.out.println("Price\t:\t" + sum);
            System.out.println("Offer from Snazzy Autos for an old car :" + ask);
            double total = sum - ask;
            System.out.println("After discount Price : " + total);
            task2(total);
        } else {
            sum = sum - (sum * 0.05);
            System.out.println("New Price\t:\t" + sum);
            task2(sum);
        }


    }

    public static void price() {
        if (count == 1) {
            j = i + k;
            sum = j; ex = sum - i;
        } else {
            sum = sum + k;
            ex = sum - i;
        }

    }


    public static int task2(double sum) {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("....PAYMENT METHODS....");
        System.out.println("Please Select your Payment Mode :-");
        System.out.println("1. In Full Payment at once you will get 1% Cashback");
        System.out.println("2. In 4 year Payment Installation, You don't have to pay Extra");
        System.out.println("3. In 7 year Payment Installation, You have to pay 5% Extra ");
        System.out.println("Enter your choice :");
        int k = sc3.nextInt();

        if (k == 1)
        {
            System.out.println("You have Selected Full Payment Mode\nSo now you have 2 options");
            System.out.println("Either you can Select Cashback of 1%  OR Chosen Optinal Extras free");
            System.out.println("Price : " + sum);
            System.out.println(".....Cashback of 1%.....");
            double cashback = sum * 0.01;
            System.out.println("Your Cashback Amount : " + cashback);
            sum = sum - cashback;
            System.out.println("Amount to be paid : " + sum);
            System.out.println("....Optional Extras Free....");
            System.out.println("You will get Discount of Rs. "+ex);
            double discount = sum - ex;
            System.out.println("Amount to be paid : " + discount);
            relevant();
            task3(sum);
        }
        else if (k == 2)
        {
            System.out.println("You have Selected 4 year Payment Installation\nSo you don't have to pay Extra");
            System.out.println("Total Price : " + sum);
            double installment1 = sum / (4 * 12);
            System.out.println("Your monthly installment for 4 years will be : " + installment1);
        }
        else if (k == 3)
        {
            System.out.println("You have Selected 7 year Payment Installation\nSo you have to pay Extra 5%");
            sum = sum * 1.05;
            System.out.println("Total Price : " + sum);
            double installment1 = sum / (7 * 12);
            System.out.println("Your monthly installment for 7 years will be : " + installment1);
        }
        else
        {
            System.out.println("Invalid Choice");
            System.exit(0);
        }
        return 1;
    }


    public static int task3(double sum)
    {    Scanner sc4 = new Scanner(System.in);
        //System.out.println("You have 2 options for one time payment");
        System.out.println("Select your Choice");
        System.out.println("1. For 1% cashback");
        System.out.println("            OR              ");
        System.out.println("2. For optional Extras free");
        int offer = sc4.nextInt();
        if(offer == 1)
        {
            System.out.println("You choose 1% cashback ");
            System.out.println("Amount to be paid : " + sum);
        }
        else if(offer == 2)
        {
            System.out.println("You choose Optional Extras free");
            System.out.println("You will get Discount of Rs. "+ex);
            discount = sum - ex;
            System.out.println("Amount to be paid : " + discount);
        }
             return 1;
    }

    public static void relevant(){
        if(sum<discount){
            System.out.println("1% Cashback is more relevant");
        }
        else if(sum==discount){
            System.out.println("Both is equal");
        }
        else if(sum>discount){
            System.out.println("Optional Extras free is more relevant");
        }
        else{
            System.out.println("Invalid Choice");
            System.exit(0);
        }
    }
}







