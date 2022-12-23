public class Enemy {
    public String enemyType;
    public int enemyHp;
    public int enemyAttack;

    public Enemy() {
        enemyType = "Normal";
        enemyHp = 5;
        enemyAttack = 2;
    }

    public Enemy(String enemyType, int enemyHp, int enemyAttack) {
        this.enemyType = enemyType;
        this.enemyHp = enemyHp;
        this.enemyAttack = enemyAttack;
    }

    public int getEnemyHp() {
        return enemyHp;

    }

    public int getEnemyAttack() {
        return enemyAttack;
    }


    public void RandomizeStats() {
        int min = 1;
        int max = 15;
        //String newType = "";
        //int newHp = 0;
        //int newAttack = 0;
        // int randomStatsNeeded = 2;

        int firstRandomNumber = (int) (Math.random() * max) + min;
        enemyHp = firstRandomNumber;
        int secondRandomNumber = (int) (Math.random() * max) + min;
        enemyAttack = secondRandomNumber;
        //System.out.println(randomNumber);


    }


   /* public Enemy GenerateEnemy()
    {
        Enemy enemy = new Enemy();

        enemy.RandomizeStats();

        return  enemy;
    }*/


    public String toString() {
        return "\n" + "ENEMY ENCOUNTERED" + "\n" + "The Enemy is " + enemyType + " Type " + "\n"
                + "Enemy has " + enemyHp + " HP" + "\n"
                + "Enemy has " + enemyAttack + " attack damage" + "\n\n";
    }

}
