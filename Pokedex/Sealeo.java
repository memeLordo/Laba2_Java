package Pokedex;
import Moves.*;

import ru.ifmo.se.pokemon.Pokemon;


public class Sealeo extends Pokemon {
    public Sealeo(String name, int level) {
        super(name, level);
        setStats(90D, 60D, 70D,75D, 70D, 45D);
        setMove(new Swagger(), new Confide(),new Air_Splash());
    }
//    public Sealeo(){
//        this("Spheal", 1);
//    }
}
