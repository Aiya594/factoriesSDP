package abstractFactory;

import app.Application;
import factories.IMessengerFactory;
import factories.TGFactory;
import factories.WAFactory;

import java.util.Scanner;

public class Main2 {
    private static Application configureApp(int choice){
        Application app=null;
        IMessengerFactory factory=null;
        if (choice == 1){
            factory=new TGFactory();
        } else if (choice == 2){
            factory=new WAFactory();
        } else{
            System.out.println("Unknown choice");
        }
        if (factory!=null){
            app=new Application(factory);
        }
        return app;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("""
                1.Send messages via Telegram
                2.Send messages via WhatsApp
                Enter 1 for Telegram or 2 for WhatsApp
                """);
        int input=scan.nextInt();

        Application app=configureApp(input);
        if (app!=null){
            app.message();
        }


    }
}
