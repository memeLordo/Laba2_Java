package Pokedex;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spheal extends Pokemon {
    public Spheal(String name, int level) {
        super(name, level);
        setStats(90D, 55D, 65D,95D, 85D, 70D);
        setType(Type.ICE, Type.WATER);
        setMove(new Swagger(), new Confide());
    }
//    public Spheal(){
//        this("Spheal", 1);
//    }
}
