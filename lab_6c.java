import java.util.Scanner;

public class lab_6c {


        public static class bank_account{

            private int account_number;
            private double balance;
            private String name;
            public  String accountholder;

            public bank_account(int account_number,double balance,String name,String accountholder){
                this.account_number = account_number;
                this.balance = balance;
                this.name = name;
                this.accountholder = accountholder;


            }

            public void displayDetails(){
                System.out.println("account_number:" +account_number);
                System.out.println("balance:" +balance);
                System.out.println("name:"+name);
                System.out.println("accountholder:"+accountholder);   

            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            bank_account [] ba = new bank_account[3];
            sc.close();
            
        }

        
        
    }

