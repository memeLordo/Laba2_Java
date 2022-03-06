package Pokedex;

import Moves.Confide;
import Moves.Lava_Plume;
import Moves.Rest;
import Moves.Will_O_Wisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lunatone extends Pokemon {

   public Lunatone(String name, int level) {
       super(name, level);
       setStats(90D, 55D, 65D,95D, 85D, 70D);
       setType(Type.PSYCHIC, Type.ROCK);
       setMove(new Confide(),new Rest(),new Will_O_Wisp(),new Lava_Plume());
   }
//  // public Lunatone(){
//       this("Lunatone", 1);
//   }



}
