package AssignmentThree;

public class Lights {

    boolean lightsOn;
    String headlightColour;
    String rearlightColour;
    Materials materials;

    public Lights(String headColour, String rearColour) {

        headlightColour = headColour;
        rearlightColour = rearColour;
        materials = Materials.plastic;
        lightsOn = true;

    }


    public boolean isLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }





}
