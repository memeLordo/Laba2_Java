package Pokedex;
import Moves.Facade;
import Moves.Rest;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Natu  extends Pokemon {

    public Natu(String name, int level) {
        super(name, level);
        setStats(40D, 50D, 45D,70D, 45D, 70D);
        setType(Type.PSYCHIC, Type.FLYING);
//        setMove(new Facade(),new Swagger(),new Rest());
    }



}