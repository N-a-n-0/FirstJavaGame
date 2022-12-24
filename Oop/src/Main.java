import java.util.Scanner;

public class Main {
//public static void cls()

    public static Enemy enemy = new Enemy();
    public static Scanner Input = new Scanner(System.in);
    public static boolean gameBeaten = false;
    public static Player something = new Player();
    public static int TurnsCompleted = 0;

    public static int StatPoints = 0;

    public static void input() {

        boolean isCorrect = false;
        boolean isNumber = false;
        String name = "";
        int level = 0;
        int hp = 0;
        int attack = 0;
        while (!isCorrect) {

            System.out.println("Please enter your player name");

            name = Input.next();


            do {
                System.out.println("Please enter your player level");
                if (Input.hasNextInt()) {
                    level = Input.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("I don't think your level is a word or a special character");
                    Input.next();
                    isNumber = false;
                }

            } while (!(isNumber));
            {
                System.out.println("\n");
            }


            do {
                System.out.println("Please enter your player hp");
                if (Input.hasNextInt()) {
                    hp = Input.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("I don't think your hp is a word or a special character");
                    Input.next();
                    isNumber = false;
                }

            } while (!(isNumber));
            {
                System.out.println("\n");
            }


            do {
                System.out.println("Please enter your player attack");
                if (Input.hasNextInt()) {
                    attack = Input.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("I don't think your attack is a word or a special character");
                    Input.next();
                    isNumber = false;
                }

            } while (!(isNumber));
            {
                System.out.println("\n");
            }


            something = new Player(name, level, hp, attack);

            // System.out.println(something);
            // scan.nextLine();


            int yesThisIsCorrect = 0;


            System.out.println("Is this correct?" + "\n" + "1. Yes" + "\n" + "2. No");

            while (isCorrect == false) {
                yesThisIsCorrect = Input.nextInt();
                if (yesThisIsCorrect == 1) {

                    // System.out.println("THIS RAN");

                    isCorrect = true;
                    something.playerInfo(name, level, hp, attack, yesThisIsCorrect);
                    break;
                    //  cls();

                } else if (yesThisIsCorrect == 2) {

                    // System.out.print("The number choosen was 2");
                    //scan.next();
                    isCorrect = false;
                    break;
                } else {
                    System.out.println("Please only say yes or no ");
                }

            }


        }

    }

    public static void battleInput() {


        System.out.println("1. Attack" + "\n" +
                "2. Run away" + "\n");

    }

    public static void Action(Enemy enemy) {
        int choice = 0;
        int choiceOUTCOME = (int) (Math.random() * 10) + 1;


        do {
            System.out.println("1. Search" + "\n" +
                    "2.  Rest" + "\n");

            System.out.println("PreDetermined Random Number Outcome:" + choiceOUTCOME);

            choice = Input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You decided to search and.....\n");

                    if (choiceOUTCOME <= 3) {
                        enemy.RandomizeStats();

                        something.Battle(something, enemy);

                        System.out.print(enemy.toString());


                        System.out.println(something.toString());
                    } else if (choiceOUTCOME >= 4) {
                        System.out.println("\n nothing happen \n");
                    }


                    break;
                case 2:
                    System.out.println("Option 2 was chosen");
                    break;
                default:
                    System.out.println("Sorry that's not an option");

            }
        }
        while (!(choice == 1 || choice == 2));
        {

        }


    }

    public static void main(String[] args) {
        input();

        while (something.playerHp > 0) {


            Action(enemy);


//            something.Battle(something, enemy);

            TurnsCompleted++;
        }


        if (something.playerHp < 0) {
            System.out.println("\n\n" + "Game Over" + "\n\n" + "Turns Completed: " + TurnsCompleted);
        }


        // Player Bob = new Player("GIGABOB",  25,25,100);


        //Enemy Bird = new Enemy();
        //System.out.println(Dave.getPlayerInfo());

        //something.printSomething(1,true);
        //  something.printSomething(2,true);
        //System.out.println(Bird.getEnemyType());
        // something.printSomething(1,true);
    }
}