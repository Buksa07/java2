package AnimalRescue;

public abstract class MedicalStaff {

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

    public abstract void heal();
    public abstract void clean();
    public abstract void save();




}
