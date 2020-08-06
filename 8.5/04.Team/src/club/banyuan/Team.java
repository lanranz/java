package club.banyuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Team {
    private List<Player> starting= new ArrayList<>();
    private List<Player> substitute= new ArrayList<>();



    public List<Player> getStarting() {
        return starting;
    }

    public void setStarting(List<Player> starting) {
        this.starting = starting;
    }

    public List<Player> getSubstitute() {
        return substitute;
    }

    public void setSubstitute(List<Player> substitute) {
        this.substitute = substitute;
    }


    private static Player searchByPosition(String s, List<Player> team) {
        Iterator<Player> iterator = team.iterator();
        while (iterator.hasNext()){
            Player player = iterator.next();
            if (s.equals(player.getPosition()))
                return player;
        }
        return null;
    }


    public void subsToStar(Player player) {
        Player player1 = searchByPosition(player.getPosition(), starting);
        Player player2 = searchByPosition(player.getPosition(), substitute);
        starting.remove(player1);
        starting.add(player2);
        substitute.remove(player2);
        substitute.add(player1);
    }


    public void remove(Player player) {
        if (searchByPosition(player.getPosition(), starting) != null) {
            starting.remove(player);
        }else if (searchByPosition(player.getPosition(), substitute) != null) {
            substitute.remove(player);
        }
    }


    public void print() {
        System.out.println("首发名单");
        for (Player player : starting) {
            System.out.println(player);
        }
        System.out.println("替补名单");
        for (Player player : substitute) {
            System.out.println(player);
        }
        System.out.println();
    }

    public void add(Player pf) {
        substitute.add(pf);
    }
}