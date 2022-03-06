package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends SpecialMove {
    public Facade() {
        super(Type.NORMAL, 0D, 95D);
    }
    @Override
    protected String describe() {
        return "Deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.";
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {

        if(p.getCondition() == Status.POISON | p.getCondition() == Status.BURN | p.getCondition() == Status.PARALYZE){
            super.applyOppDamage(p,140);
        }
        else super.applyOppDamage(p,70);
    }
}
