package Chapter2.Class;

public class monster
{
    String name;
    int HP;
    int attack;
    int defense;

    public monster(String name,int HP,int attack,int defense)
    {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public void Monsterinformation()
    {
       System.out.println("몬스터의 이름은: "+name);
       System.out.println("몬스터의 체력은: "+HP);
       System.out.println("몬스터의 공격력은: "+attack);
       System.out.println("몬스터의 방어력은: "+defense);
    }

    public void Attack2()
    {
        System.out.println("몬스터가"+attack+"만큼 공격합니다.");
    }

}
