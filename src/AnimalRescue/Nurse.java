package AnimalRescue;

public class Nurse extends MedicalStaff {
    public void heal (){
        System.out.println("help healing");
    }

    @Override
    public void clean() {
        System.out.println("Clean on the flor");
    }

    @Override
    public void save() {
        System.out.println("saves lives");
    }

}
