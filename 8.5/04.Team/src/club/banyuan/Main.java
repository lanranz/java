package club.banyuan;



public class Main {
    public static void main(String[] args) {
        Team team=new Team();

        Player player1 = new Player("1", 1, "PG");
        team.getStarting().add(player1);
        Player player2 = new Player("2", 2, "SG");
        team.getStarting().add(player2);
        Player player3 = new Player("3", 3, "SF");
        team.getStarting().add(player3);
        Player player4 = new Player("4", 4, "PF");
        team.getStarting().add(player4);
        Player player5 = new Player("5", 5, "C");
        team.getStarting().add(player5);
        Player player6 = new Player("6", 6, "PG");
        team.getSubstitute().add(player6);
        Player player7 = new Player("7", 7, "SG");
        team.getSubstitute().add(player7);
        Player player8 = new Player("8", 8, "SF");
        team.getSubstitute().add(player8);
        Player player9 = new Player("9", 9, "PF");
        team.getSubstitute().add(player9);
        Player player10 = new Player("10", 10, "C");
        team.getSubstitute().add(player10);

        team.subsToStar(player7);
        team.remove(player9);

        team.print();

    }
}