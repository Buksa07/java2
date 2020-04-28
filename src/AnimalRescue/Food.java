package AnimalRescue;

public class Food {

    private String name = "Royal Canin";
    private float price = 15.5F;
    private int amount = 12;
    private String availableInStock = "Yes";

    public String getName(){
        return name;
    }
    public void setName(String name){
     this.name = name;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public String getAvailableInStock(){
        return availableInStock;
    }
    public void setAvailableInStock(String availableInStock){
        this.availableInStock = availableInStock;
    }


}
