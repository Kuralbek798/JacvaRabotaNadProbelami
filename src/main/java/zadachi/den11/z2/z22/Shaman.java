package zadachi.den11.z2.z22;

import zadachi.den11.z2.z21.interf.Healing;
import zadachi.den11.z2.z21.interf.MagicalAttack;
import zadachi.den11.z2.z21.interf.PhysAttack;

public class Shaman extends Heros implements PhysAttack, MagicalAttack, Healing {
    public Shaman(String name) {
        super(name);
        physAttack = 10;
        magicalAttack = 15;
        physDefence = 0.2;
        magicalDefence = 0.2;
        healHimself = 50;
        healTeammate = 30;
        attackScore = 0;


    }


    @Override
    public void doHealHimself() {
      if(this.health + healHimself >= HEALTH_POINTS){
          this.health = HEALTH_POINTS;
      }else{
          this.health += healHimself;
      }
    }

    /**
     * @param h
     */
    @Override
    public void doHeal(Heros h) {
        if(h.health + healTeammate >= HEALTH_POINTS){
            h.health = HEALTH_POINTS;
        }else{
            h.health += healTeammate;
        }

    }

    /**
     * @param h
     */
    @Override
    public void magicalAttack(Heros h) {
        attackScore = magicalAttack - (magicalAttack * h.magicalDefence);
        if(h.health - attackScore <= 0 ){
            h.health = MIN_HEALTH_POINTS;
        }else{
            h.health -=attackScore;
        }

    }

    /**
     * @param h
     */
    @Override
    public void physAttack(Heros h) {
        attackScore = physAttack - (physAttack * h.physDefence);
        if(h.health - attackScore <= 0){
            h.health = MIN_HEALTH_POINTS;
        }else{
            h.health -= attackScore;
        }

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
