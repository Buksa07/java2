package AnimalRescue;

public class MedicalStaff {

    private String name;
    private String specialization;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpecializatio(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void heal(){
        System.out.println("healing");
    }





}
