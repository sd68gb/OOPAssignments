package AssignmentThree;

public class Frame {

    String userInput;
    Materials materials;

    public Frame(String frameMaterial) {
        materials = setFrameMaterial(frameMaterial);
        System.out.println("The frame i made of " + materials);
    }

    public Materials setFrameMaterial(String userInput) {
        userInput = userInput.toLowerCase();
        switch(userInput){
            case  "carbon":
                return Materials.carbon;
            case  "aluminium":
                return Materials.aluminium;
            case  "plastic":
                return Materials.plastic;
            default:
                return Materials.unknown;
        }
    }

}
