package Moves;
import ru.ifmo.se.pokemon.*;


public class Swagger extends SpecialMove {
    public Swagger()
    {
        super(Type.NORMAL,0D,100D);
    }
    protected String describe(){return "Confuses the target and raises its Attack by two stages.";}



    @Override

    protected void applyOppEffects(Pokemon p){
        p.confuse();
        p.setMod(Stat.ATTACK,2);
    }
}
