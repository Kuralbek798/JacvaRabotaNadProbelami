package zadachi.den11.z2.z22;

import zadachi.den11.z2.z21.interf.MagicalAttack;
import zadachi.den11.z2.z21.interf.PhysAttack;

public class Magical extends Heros implements MagicalAttack, PhysAttack {

    public Magical(String name) {
        super(name);
        magicalAttack = 20;
        physAttack = 5;
        magicalDefence = 0.8;
        physDefence = 0;
         attackScore = 0;
    }

    /**
     * @param h
     */
    @Override
    public void magicalAttack(Heros h) {
        attackScore = magicalDefence-(magicalAttack * magicalDefence);
        if(h.health - attackScore <= 0){
            h.health = MIN_HEALTH_POINTS;
            return;
        }else{
            h.health -= attackScore;
        }

    }

    /**
     * @param h
     */
    @Override
    public void physAttack(Heros h) {
     attackScore = physAttack- (h.physDefence * physAttack);
       if(h.health - attackScore <= 0){
         h.health = MIN_HEALTH_POINTS;
       }else{
         h.health -= attackScore;
       }
    }

    @Override
    public String toString() {
        return "Magical{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
