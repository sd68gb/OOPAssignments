package AssignmentThree;

public class StartBike {


    public StartBike(int currentGear, int maxGear, boolean pedalsIntact, boolean boltsTightened, float tyrePressure, int size, String headColour, String rearColour) {

        // gears class with
        Gears gears = new Gears(currentGear, maxGear);
        Lights lights = new Lights(headColour, rearColour);
        Bolts bolts = new Bolts(boltsTightened);
        Pedals pedals = new Pedals(pedalsIntact);
        Wheels wheels = new Wheels(tyrePressure, size);
        Frame frame = new Frame("carbon");


    }
}
