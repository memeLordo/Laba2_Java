package Moves;

import ru.ifmo.se.pokemon.*;

public class Magnitude extends SpecialMove {
    double i[]={10D,
            30D,30D,
            50D,50D,50D,50D,
            70D,70D,70D,70D,70D,70D,
            90D,90D,90D,90D,
            110D,110D,
            150D};
    public Magnitude()
    {
        super(Type.GROUND,0D,100D);
    }
    protected String describe(){return "The base power of Magnitude is one of 7 random values.";}
    @Override
    protected void applyOppDamage(Pokemon p, double v){
        super.applyOppDamage(p,i[(int)(Math.random()*20-1)]);
    }

}
