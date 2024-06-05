package AssignmentFour;

public enum Age {
    kids(0,15),
    teenagers(16,25),
    adults(26,65),
    elders(66,99);


    Age(int ageStart,int ageStop){
    }

    public String returnStringOfAges(int ageStart,int ageStop){
        return "optimal age for this bike is between "+ageStart+" and "+ageStop;
    }

    public Age returnAgeGroup(int age) {
        Age ageGroup = null;
        for (Age a : Age.values()) {
            int upper = Age.values().length;
            int lower = Age.values().length - 1;
            if (age <= upper && age >= lower) {
                ageGroup = a;
            } else if (age > upper) {
                ageGroup = elders;
            }
        }
        return ageGroup;
    }

}