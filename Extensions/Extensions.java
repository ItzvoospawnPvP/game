package Extensions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Extensions extends BasicMath {
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "cls").inheritIO().start();
        } catch (Exception E) {
            throw new RuntimeException(E);
        }
    }
    public static void stop() {
        System.console();
        try {
            System.in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void reStart(){
        try {
            System.in.reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void Print(String Text){
        System.out.println(Text);
    }

    public static void Coins(){
        Scanner odczyt = null;
        try {
            odczyt = new Scanner(new File("Coins.gamesave"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int Coins = odczyt.nextInt();
        String ShowCoins = "Coins: " + Coins + " \n";
        Print(ShowCoins);
    }

}