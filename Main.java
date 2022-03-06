import Pokedex.Lunatone;
import Pokedex.Natu;
import Pokedex.Spheal;
import ru.ifmo.se.pokemon.*;
public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Spheal("Боря",20));
        b.addAlly(new Lunatone("Боря2",20));
        b.addFoe(new Natu("Вася", 25));
        b.go();
    }
}
