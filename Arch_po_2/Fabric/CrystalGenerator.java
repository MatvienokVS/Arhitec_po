package Fabric;

import Interface.iGameItem;
import Product.CrystalReward;

public class CrystalGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new CrystalReward();
    }
}