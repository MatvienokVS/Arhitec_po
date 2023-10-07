import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class Main {
    public static void main(String[] args) {

        Random rnd = ThreadLocalRandom.current();

        List<ItemGenerator> fabrics = initFabrics();

        for (int i = 0; i < 150; i++) {

            int index = rnd.nextInt(fabrics.size());
            fabrics.get(index).openReward();
        }
    }


    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();

        fabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            fabrics.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            fabrics.add(new SilverGenerator());
            fabrics.add(new CoalGenerator());
            fabrics.add(new CopperGenerator());
            fabrics.add(new SemmedGenerator());
            fabrics.add(new StoneGenerator());
            fabrics.add(new CrystalGenerator());
        }

        return fabrics;
    }
}