package club.banyuan.fighter;

import club.banyuan.fighter.skill.Skill;
import club.banyuan.fighter.weapon.Weapon;

import java.util.Random;

public class Fighter{
  private Random random = new Random();

  private int hp = 1000;
  private String name;
  private Weapon weapon;
  private Skill[] skills;

  public Fighter(String name,Weapon weapon){
    this.name = name;
    this.weapon = weapon;
  }
  public int getHp(){
    return hp;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void attack(Fighter fighter){
    weapon.attack(this,fighter);
  }

  public int attack(){
    return random.nextInt(100)+100;
  }


}

