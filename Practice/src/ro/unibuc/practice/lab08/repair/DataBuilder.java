package ro.unibuc.practice.lab08.repair;

import java.util.ArrayList;
import java.util.List;

public class DataBuilder {

    public static Rig buildRig() {
        var components = new ArrayList<Component>();

        components.add(new Component("Graphics Card", "NVIDIA GeForce GTX 1050 TI 4GB GDDR5", 179.99, 2020));
        components.add(new Component("Solid State Drive (SSD)", "WD Green 480GB M.2", 33.59, 2017));
        components.add(new Component("Memory (RAM) Module", "Crucial 8GB DDR4 2666MHz", 32.99, 2018));
        components.add(new Component("Memory (RAM) Module", "Crucial 8GB DDR4 2666MHz", 32.99, 2017));
        components.add(new Component("CPU Air Cooler", "ARCTIC Alpine 23 Compact AMD", 5.99, 2015));

        return new Rig("Gabrielė Nata", components);
    }

    public static List<Component> buildSpareParts() {
        var spareParts = new ArrayList<Component>();

        spareParts.add(new Component("Graphics Card", "ASUS NVIDIA GeForce RTX 3080 TUF Gaming OC V2 10GB GDDR6X", 199.99, 2022));
        spareParts.add(new Component("Solid State Drive (SSD)", "Kingston A400 Series 2.5 240GB", 30.50, 2021));
        spareParts.add(new Component("Desktop Hard Drive (HDD)", "Seagate BarraCuda 4TB 3.5", 74.99, 2022));
        spareParts.add(new Component("CPU Air Cooler", "PURE ROCK 2 Black AMD", 29.99, 2021));

        return spareParts;
    }

}
