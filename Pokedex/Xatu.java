package Pokedex;
import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;

public class Xatu extends Pokemon {
    public Xatu(String name, int level) {
        super(name, level);
        setStats(65D, 75D, 70D,95D, 70D, 95D);
        setMove(new Facade(),new Swagger(),new Rest(), new Magnitude());
    }
//    public Xatu(){
//        this("Xatu", 1);
//    }
}
