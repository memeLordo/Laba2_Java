package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove {

        public Rest()
        {
            super(Type.PSYCHIC,0D,100D);
        }

        protected String describe(){return "Skip 2 turns, then heal fully.";}


    @Override
    protected void applySelfEffects(Pokemon p){
            Effect e=new Effect().turns(2).condition(Status.SLEEP);
            p.setCondition(e);
            p.restore();
          //  p.wait(2);

    }
}
