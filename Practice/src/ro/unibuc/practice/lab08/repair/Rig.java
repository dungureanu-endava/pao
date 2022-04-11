package ro.unibuc.practice.lab08.repair;

import java.util.List;

public class Rig {

    private String owner;
    private List<Component> components;

    public Rig(String owner, List<Component> components) {
        this.owner = owner;
        this.components = components;
    }

    public String getOwner() {
        return owner;
    }

    public List<Component> getComponents() {
        return components;
    }
}
