package Moves;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 0D, 80D);
    }

    protected String describe() {
        return "Causes the target to become burned, if it hits. Burned Pokémon lose 1⁄8 of their maximum HP each turn and their Attack is decreased by 50%";
    }


    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.BURN);
        if (Math.random() <= 0.30D) {
            p.setCondition(e);
        }
    }
    protected void applyOppDamage(Pokemon p, double v){
        super.applyOppDamage(p, 90);
    }
}