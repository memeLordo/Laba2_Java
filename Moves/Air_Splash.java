package Moves;

import ru.ifmo.se.pokemon.*;

public class Air_Splash extends SpecialMove {
    public Air_Splash() {
        super(Type.FLYING, 0D, 95D);
    }

    protected String describe() {
        return "Deals damage and has a 30% chance of causing the target to flinch";
    }

    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        super.applyOppDamage(p, 75D);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.30D) Effect.flinch(p);
    }
}

