package zadachi.den11.z2.z22;

public class Test {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Qwerty");
        Shaman shaman = new Shaman("sfaf");
        warrior.physAttack(shaman);
        System.out.println(shaman);
        shaman.magicalAttack(warrior);
        System.out.println(warrior);
        warrior.physAttack(shaman);
        System.out.println(shaman);
        shaman.doHealHimself();
        System.out.println(shaman);
    }
}
