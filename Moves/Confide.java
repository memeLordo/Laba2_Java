package Moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends SpecialMove {

    public Confide() {
        super(Type.PSYCHIC, 0D, 100D);
    }

    protected String describe() {
        return "Lowers the target's Special Attack by one stage.";
    }

    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,-1);
    }
}