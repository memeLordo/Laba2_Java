package Pokedex;
import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;

public class Walrein extends Pokemon {
    public Walrein(String name, int level) {
        super(name, level);
        setStats(110D, 80D, 90D,95D, 90D, 65D);
        setMove(new Swagger(), new Confide(),new Air_Splash(),new Flamethrower());
    }
//    public Walrein(){
//        this("Walrein", 1);
//    }
}
