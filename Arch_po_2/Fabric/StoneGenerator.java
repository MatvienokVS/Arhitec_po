package Fabric;

import Interface.iGameItem;
import Product.StoneReward;

public class StoneGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new StoneReward();
    }
}
