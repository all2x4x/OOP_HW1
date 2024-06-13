package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {

    private int name;
    private int volume;
    private int temperature;

    public HotDrinkVM(int name, int volume, int temperature) {
        super(name, volume, temperature);
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }
    public int getname() {
        return name;
    }

    public int getvolume() {
        return volume;
    }

    public int gettemperature() {
        return temperature;
    }


    @Override
    public void addProducts(List<Product> products) {
        System.out.println("Всегда ничего не верну");
    }
}
