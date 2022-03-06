package Moves;

import ru.ifmo.se.pokemon.*;


public class Will_O_Wisp extends SpecialMove {
    boolean flag=false;
    public Will_O_Wisp()
    {
        super(Type.FIRE,0D,80D);
    }
    protected String describe(){return "Causes the target to become burned, if it hits. Burned Pokémon lose 1⁄8 of their maximum HP each turn and their Attack is decreased by 50%";}

    Pokemon p1=new Pokemon();
    protected void applySelfEffects(Pokemon p){
        p1.setStats(p.getHP(),p.getStat(Stat.ATTACK),p.getStat(Stat.DEFENSE),p.getStat(Stat.SPECIAL_ATTACK),p.getStat(Stat.SPECIAL_DEFENSE),p.getStat(Stat.SPEED));
    }

    protected void applyOppEffects(Pokemon p){
        Effect e=new Effect().condition(Status.BURN);
        if(checkAccuracy(p1,p)){
            p.setCondition(e);
            p.setMod(Stat.ATTACK,-2);
            flag=true;

        }


    }
    protected void applyOppDamage(Pokemon p, double v){
        if (flag){super.applyOppDamage(p,0.125D*p.getHP());}
    }
}
