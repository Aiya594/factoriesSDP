package factoryMethod;

import factoryMethod.factory.Dialog;
import factoryMethod.factory.EmailDialog;
import factoryMethod.factory.SMSDialog;

import java.util.Scanner;

public class Main1 {
    private static Dialog dialog;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("""
                1.SMS notification
                2.Email notification
                Enter 1 for sms or 2 for email to your friend
                """);
        int choice=scan.nextInt();

        configure(choice);
        runBusinessLogic();
    }

    static void configure(int choice){
        if (choice == 1) {
            dialog=new SMSDialog();
        } else if (choice == 2) {
            dialog =new EmailDialog();
        } else{
            System.out.println("Unknown choice");
        }
    }

    static void runBusinessLogic(){
        if (dialog !=null){
            dialog.showMessage();
        }

    }
}
