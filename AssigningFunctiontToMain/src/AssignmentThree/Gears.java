package AssignmentThree;

public class Gears {

    Materials materials;
    int gear;


    public Gears(int initialGear, int maxGear) {

        gear = initialGear;
        gear = higherGear(initialGear, maxGear);
        gear = lowerGear(gear);
        materials = Materials.aluminium;

    }

    public int higherGear(int currentGear, int maxGear){
        int newGear = currentGear+1;
        if (newGear >= maxGear) {
            newGear = maxGear;
            System.out.println("Gears cannot go any higher. Remains in gear "+maxGear);
        } else {
            System.out.println("Changing to a higher gear. You are now driving in gear " + newGear);
        }
        return newGear;
    }

    public int lowerGear(int currentGear){
        int newGear = currentGear-1;
        if (newGear < 1){
            newGear = 1;
            System.out.println("Gears cannot go any lower. Remains in gear 1.");
        } else {
            System.out.println("Changing to a lower gear. You are now driving in gear." + newGear);
        }
        return newGear;
    }

    public String printGear(int gear){
        return "You are in gear " + gear;
    }

}
