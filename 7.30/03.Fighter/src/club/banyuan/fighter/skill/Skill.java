package club.banyuan.fighter.skill;

import club.banyuan.fighter.Fighter;

public interface Skill {

    void spell(Fighter from, Fighter to);

    boolean coolDown();

    void nextRound();
}
