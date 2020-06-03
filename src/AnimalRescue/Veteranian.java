package AnimalRescue;

public class Veteranian extends MedicalStaff {
    public void heal(){
        System.out.println("healing like a doctor");
    }

    @Override
    public void clean() {
        System.out.println("clean the patient");
    }

    @Override
    public void save() {
        System.out.println("save animals");
    }

}

