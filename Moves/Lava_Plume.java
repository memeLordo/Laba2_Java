package Moves;

import ru.ifmo.se.pokemon.*;

public class Lava_Plume extends SpecialMove{
    public Lava_Plume() {
        super(Type.FIRE, 0D, 100D);
    }

    protected String describe() {
        return "Deals damage and has a 30% chance of burning the target.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().condition(Status.BURN);
        if(p.hasType(Type.FIRE)&(Math.random()<=0.30D)){
            p.setCondition(e);
        }

    }
    protected void applyOppDamage(Pokemon p, double v){
        super.applyOppDamage(p, 80D);
    }
}