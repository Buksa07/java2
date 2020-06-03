package AnimalRescue;

public abstract class Adoptator {

    private String Name;
    private float Money;

    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public float getMoney(){
        return Money;
    }
    public void setMoney(float money){
        this.Money = money;
    }

    public abstract void buy();
    public abstract void loves();




}
