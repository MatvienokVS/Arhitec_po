package Fabric;

import Interface.iGameItem;
import Product.SemmedReward;

public class SemmedGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new SemmedReward();
    }
}