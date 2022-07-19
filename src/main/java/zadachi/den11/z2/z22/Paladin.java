package zadachi.den11.z2.z22;

import zadachi.den11.z2.z21.interf.Healing;
import zadachi.den11.z2.z21.interf.PhysAttack;

public class Paladin extends Heros implements Healing, PhysAttack {

    public Paladin(String name) {
        super(name);
        physAttack = 15;
        magicalDefence = 0.2;
        physDefence = 0.5;
        healHimself = 25;
        healTeammate = 10;
        attackScore = 0;

    }


    /**
     * @param
     */
    @Override
    public void doHealHimself() {
        if(this.health + healHimself >= HEALTH_POINTS){
            this.health = HEALTH_POINTS;
            return;
        }else{
            this.health += healHimself;
            return;
        }
    }
    @Override
    public void doHeal(Heros h) {
        if(h.health + healTeammate >= HEALTH_POINTS){
            h.health = HEALTH_POINTS;
            return;
        }else {
            h.health += healTeammate;
            return;
        }
    }

    /**
     *
     */
    @Override
    public void physAttack(Heros h) {
        attackScore = physAttack - (physAttack * h.physDefence);
        if (h.health - attackScore <= 0) {
            h.health = MIN_HEALTH_POINTS;
        } else {
            h.health -= attackScore;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
