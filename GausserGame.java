import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Gaussar {
    int GausserNum;

    int GaussingNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gausser! kindly store the number");
        GausserNum = input.nextInt(); // For Gausser
        if (GausserNum > 100) {
            System.out.println("Invalid number! Please enter 100 or below 100");
            System.exit(0);
        }

        return GausserNum;
    }
}

class Player1 {
    int GausserNumPlayer1;

    int GaussingNumPlayer1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player1! kindly store the number"); // For Player1
        GausserNumPlayer1 = input.nextInt();
        if (GausserNumPlayer1 > 100) {
            System.out.println("Invalidnumber! Assume number 100 or below 100");
            System.exit(0);
        }
        return GausserNumPlayer1;
    }
}

class Player2 {
    int GausserNumPlayer2;

    int GaussingNumPlayer2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player2! kindly store the number"); // For Player2
        GausserNumPlayer2 = input.nextInt();
        if (GausserNumPlayer2 > 100) {
            System.out.println("Invalid number! please Assume number 100 or below 100");
            System.exit(0);
        }
        return GausserNumPlayer2;
    }
}

class Player3 {
    int GausserNumPlayer3;

    int GaussingNumPlayer3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player3! kindly store the number"); // For Player3
        GausserNumPlayer3 = input.nextInt();
        if (GausserNumPlayer3 > 100) {
            System.out.println("Invalid number! please Assume valid number 100 or below 100");
            System.exit(0);
        }
        return GausserNumPlayer3;
    }
}

class Umpire {
    int NumFromGausser;
    int NumFromPlayer1;
    int NumFromPlayer2;
    int NumFromPlayer3;

    void FromGausser() {
        Gaussar a = new Gaussar();
        NumFromGausser = a.GaussingNum();
    }

    void FromPlayer1() {
        Player1 p1 = new Player1();
        NumFromPlayer1 = p1.GaussingNumPlayer1();
    }

    void FromPlayer2() {
        Player2 p2 = new Player2();
        NumFromPlayer2 = p2.GaussingNumPlayer2();
    }

    void FromPlayer3() {
        Player3 p3 = new Player3();
        NumFromPlayer3 = p3.GaussingNumPlayer3();
    }

    void Compare() {
        if (NumFromGausser == NumFromPlayer1) {
            if (NumFromGausser == NumFromPlayer2 && NumFromGausser == NumFromPlayer3) {
                System.out.println("Player1,Player2,Player3 won the match");
                System.out.println("You woned");
                System.exit(0);
            } else if (NumFromGausser == NumFromPlayer2) {
                System.out.println("Player1,Player2 won the match");
                System.out.println("But u want to won player3 also");
            } else if (NumFromGausser == NumFromPlayer3) {
                System.out.println("Player1,Player3 won the match");
                System.out.println("But u want to won player2 also");
            } else {
                System.out.println("Playre1 won the match");
                System.out.println("But u want to won player2 and player3 also");
            }
        }

        else if (NumFromGausser == NumFromPlayer2) {
            if (NumFromGausser == NumFromPlayer3) {
                System.out.println("Player2,Player3 won the match");
                System.out.println("But u want to won player1 also");
            } else {
                System.out.println("Player2 won the match");
                System.out.println("But u want to won player1 and player3 also");
            }

        }

        else if (NumFromGausser == NumFromPlayer3) {
            System.out.println("Player3 won the match");
            System.out.println("But u want to won player1 and player2 also");
        }

        else {
            System.out.println("Players lost the match");
            System.out.println("You can't correctly guess one player also");
        }

    }

}

public class GausserGame {
    public static void main(String[] args) {
        Umpire b = new Umpire();
        int i;
        System.out.println("Game started!");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many choices u want to won all three players");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println("Last chance!");
            }
            b.FromGausser();
            b.FromPlayer1();
            b.FromPlayer2();
            b.FromPlayer3();
            b.Compare();

            if (i == n) {
                if (!(b.NumFromGausser == b.NumFromPlayer2 && b.NumFromGausser == b.NumFromPlayer3
                        && b.NumFromGausser == b.NumFromPlayer1)) {
                    System.out.println("You Failed! Try Again");
                }

            }
        }
    }

}