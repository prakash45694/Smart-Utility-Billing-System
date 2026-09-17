import java.util.Scanner;

public class billing {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double amount=0;
        double discount=0;
        double finalbill=0;
        double surcharge=0;

        System.out.print("Enter Customer ID: ");
        int a=scan.nextInt();

        scan.nextLine();

        System.out.print("Enter Customer Name: ");
        String b=scan.nextLine();

        System.out.print("Enter Unit Current: ");
        double c=scan.nextDouble();

        System.out.print("Enter('R' for Residential, 'C' for Commercial): ");
        char d=scan.next().charAt(0);

        if (a >= 1 && a <= 1000000000){
            System.out.println("Customer ID: "+a);
        }
        else{
            System.out.println("Invalid Customer ID");
        }
        if(d == 'R' || d == 'C') {
            if(d=='R'){
                if(c<=100.00){
                    amount=1.50*c;
                }
                else if(c<=300){
                    amount=(100*1.50)+((c-100)*2.50);
                }
                else{
                    amount=(100*1.50)+(200*2.50)+((c-300)*4.00);
                }
            }
            if(d=='C'){
                amount=4.50*c;
            }
        }
        if (c >= 0.0 && c <= 100000.0){
            if(c<=50){
                discount=amount*10/100;
                finalbill=amount-discount;
            }
            else if(c>400){
                surcharge=amount*15/100;
                finalbill=amount+surcharge;
            }
            else{
                finalbill=amount;
            }
        }
        System.out.printf("Total Bill:$%.2f%n", finalbill);

        if(c<100){
            System.out.println("Tier Category : Low");
        }
        else if(c>=100 && c<=300){
            System.out.println("Tier Category : Moderate");
        }
        else{
            System.out.println("Tier Category : High");
        }

        }
    
}
