package AssignmentThree;

public class Bolts {

    boolean boltsIntact;
    Materials materials;

    public Bolts(boolean tightened) {

        boltsIntact = tightened;
        materials = Materials.aluminium;

        System.out.println(toString(tightened));
    }

    public boolean isBoltsIntact() {
        return boltsIntact;
    }

    public void setBoltsIntact(boolean boltsIntact) {
        this.boltsIntact = boltsIntact;
    }

    public String toString(boolean intact){
        if (intact){
            return "bolts are working perfectly";
        } else {
            return "bolts are broken";
        }
    }


}
