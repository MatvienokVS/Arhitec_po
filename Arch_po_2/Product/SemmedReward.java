package Product;

public class SemmedReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("\u001B[33m" + "Gold!" + "\u001B[0m");
    }
}
