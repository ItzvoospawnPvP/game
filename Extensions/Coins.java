package Extensions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Coins extends Extensions {
    public static void ShowCat() throws FileNotFoundException {
        //mode 1 is normal mode\\\\\
        //mode 2 is developer mode
        Coins( 1, 0);
    }
    public static void Coins(int Mode, int Returned) throws FileNotFoundException {
        if(Mode == 1){
            if(Returned == 0) {
                if(Random() < 0.25){
                    Cat();
                }else {
                    Coins();
                    reStart();
                }
            }else if(Returned == 1) {
                Scanner Kot = new Scanner(new File("Mufinka.txt"));
                String Mufinka = Kot.nextLine();
                do{
                    System.out.print(Kot.nextLine() + " \n");
                }while (Kot.hasNextLine());
                System.out.print("type a to continue\n");
                Scanner Con = new Scanner(System.in);
                String ConA = Con.nextLine();
                if(ConA == "a"){
                    Coins(1 ,0);
                }
            }
            //
            //
        } else if (Mode == 2) {
            Scanner Coins = new Scanner(new File("Coins.gamesave"));
            double Coins1 = Coins.nextDouble();
            String DEBUG = "Extensions.Coins: " + Coins1 + "Cat chance: if random < 0.25";
            System.out.print(DEBUG);
        }else{
            System.out.println("\nERROR: " + "powiedz developerze że, ma zły kod");
        }
    }
    public static void Cat() throws FileNotFoundException {
        Coins(1 ,1);
    }
}