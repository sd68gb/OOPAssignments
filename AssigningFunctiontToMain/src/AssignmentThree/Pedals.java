package AssignmentThree;

public class Pedals {

    boolean functional;
    Materials materials;

    public Pedals(boolean intact) {

        functional = intact;
        materials = Materials.plastic;

    }

    public boolean getFunctional() { return functional; }

}
