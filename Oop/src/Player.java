public class Player {
    String playerName;
    int playerLevel;
    int playerHp;
    int playerAttack;

    public Player() {
        playerName = "DefaultDave";
        playerLevel = 5;
        playerHp = 10;
        playerAttack = 2;
    }

    public Player(String playerName, int playerLevel, int playerHp, int playerAttack) {
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerHp = playerHp;
        this.playerAttack = playerAttack;
    }

    public void setPlayerName(String newName) {
        playerName = newName;
    }

    public void setPlayerLevel(int newLevel) {
        playerLevel = newLevel;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int newAttack) {
        playerAttack = newAttack;
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public void setPlayerHp(int newHp) {
        playerHp = newHp;
    }

    public void printSomething(int num, boolean val) {
        System.out.print(val);
        System.out.print(num - 1);
    }

    public String playerInfo(String pName, int pLv, int pHp, int pAttack, int yesOrNo) {
        //Scanner scan = new Scanner(System.in);
        //String name = scan.nextLine();
        // String playerNewName;
        //boolean correct = false;

        if (yesOrNo == 1) {
            playerName = pName;

            playerLevel = pLv;

            playerHp = pHp;

            playerAttack = pAttack;


            //System.out.println("Is this correct?");
            System.out.println("\n" + toString());

        }


        return toString();
    }

    public void Battle(Player player, Enemy enemy) {
        playerHp = player.getPlayerHp();
        playerAttack = player.getPlayerAttack();

        int enemyHp = enemy.getEnemyHp();
        int enemyAttack = enemy.getEnemyAttack();

        playerHp -= enemyAttack;
        enemyHp -= playerAttack;
    }

    public String toString() {
        return "Player Name is: " + playerName + "\n"
                + "Player Level is: " + playerLevel + "\n"
                + "Player HP is: " + playerHp + "\n"
                + "Player Attack is: " + playerAttack;
    }

}
