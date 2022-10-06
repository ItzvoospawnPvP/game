import Extensions.Coins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Coins {
    private static final String Forward = "w";
    private static final String Back = "s";
//    int X;
//    int Extensions.Coins;
//    String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Extensions.Coins + "  \n";
//    int getX(){return X;}
//    public void setX(int X) {
//        this.X = X;
//    }

    public static void main(String[] args) throws FileNotFoundException {
        X0();
    }

    //y     10  0
    public static void X0() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        Coins();
        //String DEBUG = "Coordinates: Y: " + "0" + "  \n";
        //Show coins & DEBUG
//        System.out.println(DEBUG);
//        System.out.println(ShowCoins);
        //screen
        Print("|        | |       |");//5
        Print("|        | |       |");//4
        Print("|        | |       |");//3
        Print("|        | |       |");//2
        Print("|        | |       |");//1
        Print("|        |■|       |");//0
        Print("|        | |       |");//-1
        Print("|        | |       |");//-2
        Print("|        | |       |");//-3
        Print("|        | |       |");//-4
        Print("|        | |       |");//-5
        Print("move up = w + enter");
        Print("move down = s + enter");
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X1();
        } else if (wczytana.equals(Back)) {
            X_1();
        }
    }

    public static void X_1() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = -1;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        |■|       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X0();
        } else if (wczytana.equals(Back)) {
            X_2();
        }
    }

    public static void X_2() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = -2;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        |■|       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X_1();
        } else if (wczytana.equals(Back)) {
            X_3();
        }
    }

    public static void X_3() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = -3;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        |■|       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X_2();
        } else if (wczytana.equals(Back)) {
            X_4();
        }
    }

    public static void X_4() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = -4;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        |■|       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X_3();
        } else if (wczytana.equals(Back)) {
            X_5();
        }
    }

    public static void X_5() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        if(Random() > 1.1){
            Coins( 1, 0);
        }
        int X = -5;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        |■|       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X_4();
        } else if (wczytana.equals(Back)) {
            goUp();
        }
    }

    public static void goUp() throws FileNotFoundException {
        System.out.println("You can't go deeper!");
        System.out.println("press c to continue");
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals("c")) {
            X_5();
        } else {
            goUp();
        }
    }


    public static void X1() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = 1;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        |■|       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X2();
        } else if (wczytana.equals(Back)) {
            X0();
        }
    }

    public static void X2() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = 2;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        |■|       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X3();
        } else if (wczytana.equals(Back)) {
            X1();
        }
    }

    public static void X3() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = 3;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        |■|       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X4();
        } else if (wczytana.equals(Back)) {
            X2();
        }
    }
    public static void X4() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        int X = 4;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        | |       |");//5
        System.out.println("|        |■|       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            X5();
        } else if (wczytana.equals(Back)) {
            X3();
        }
    }
    public static void X5() throws FileNotFoundException {//0123456789 11           //x
        //DEBUG coordinates coins
        if(Random() > 1.1){
            Coins( 1, 0);
        }
        int X = 5;
        Scanner odczyt = new Scanner(new File("Coins.gamesave"));
        int Coins = odczyt.nextInt();
        String DEBUG = "Coordinates: Y:" + X + "  \n" + "Extensions.Coins: " + Coins + "  \n";
        String ShowCoins = "Extensions.Coins: " + Coins;
        //Show coins & DEBUG
        System.out.println(DEBUG);
        System.out.println(ShowCoins);
        //screen
        System.out.println("|        |■|       |");//5
        System.out.println("|        | |       |");//4
        System.out.println("|        | |       |");//3
        System.out.println("|        | |       |");//2
        System.out.println("|        | |       |");//1
        System.out.println("|        | |       |");//0
        System.out.println("|        | |       |");//-1
        System.out.println("|        | |       |");//-2
        System.out.println("|        | |       |");//-3
        System.out.println("|        | |       |");//-4
        System.out.println("|        | |       |");//-5
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals(Forward)) {
            goDown();
        } else if (wczytana.equals(Back)) {
            X4();
        }
    }
    public static void goDown() throws FileNotFoundException {
        System.out.println("You can't go higher!");
        System.out.println("press c to continue");
        Scanner scanner = new Scanner(System.in);
        String wczytana = scanner.nextLine();
        if (wczytana.equals("c")) {
            X5();
        } else {
            goDown();
        }
    }
}