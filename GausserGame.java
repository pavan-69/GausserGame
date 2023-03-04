import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Gaussar {
    int GausserNum;

    int GaussingNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gausser! kindly store the number");
        GausserNum = input.nextInt(); // For Gausser
        return GausserNum;
    }
}

class Player1 {
    int GausserNumPlayer1;

    int GaussingNumPlayer1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player1! kindly store the number"); // For Player1
        GausserNumPlayer1 = input.nextInt();
        return GausserNumPlayer1;
    }
}

class Player2 {
    int GausserNumPlayer2;

    int GaussingNumPlayer2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player1! kindly store the number"); // For Player2
        GausserNumPlayer2 = input.nextInt();
        return GausserNumPlayer2;
    }
}

class Player3 {
    int GausserNumPlayer3;

    int GaussingNumPlayer3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player1! kindly store the number"); // For Player3
        GausserNumPlayer3 = input.nextInt();
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
            } else if (NumFromGausser == NumFromPlayer2) {
                System.out.println("Player1,Player2 won the match");
            } else if (NumFromGausser == NumFromPlayer3) {
                System.out.println("Player1,Player3 won the match");
            } else {
                System.out.println("Playre1 won the match");
            }
        }

        else if (NumFromGausser == NumFromPlayer2) {
            if (NumFromGausser == NumFromPlayer3) {
                System.out.println("Player2,Player3 won the match");
            } else {
                System.out.println("Player2 won the match");
            }

        }

        else if (NumFromGausser == NumFromPlayer3) {
            System.out.println("Player3 won the match");
        }

        else {
            System.out.println("Players lost the match");
        }

    }

}

public class GausserGame {
    public static void main(String[] args) {
        Umpire b = new Umpire();
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n");
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            b.FromGausser();
            b.FromPlayer1();
            b.FromPlayer2();
            b.FromPlayer3();
            b.Compare();
        }
    }

}