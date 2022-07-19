package zadachi.den11.z2.z22;

public abstract class Heros {
     String name;
     double health;
     double physAttack;
     double magicalAttack;
     double physDefence;
     double healHimself;
     double healTeammate;
     double attackScore;
   double magicalDefence;
     final int HEALTH_POINTS = 100;
     final int MIN_HEALTH_POINTS = 0;

    public Heros(String name) {
        this.name = name;
        this.health = HEALTH_POINTS;
    }
}
