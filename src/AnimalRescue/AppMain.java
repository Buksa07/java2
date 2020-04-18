package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog myObject = new Dog ();
        Adoptator myAdoptator = new Adoptator ();
        Food myFood = new Food ();
        recreationalActivity myActivity = new recreationalActivity ();
        Veterinarian myDoctor = new Veterinarian();


        System.out.println(myObject.name);
        System.out.println(myObject.color);
        System.out.println(myAdoptator.Money + "$");
        System.out.println(myFood.availableInStock);
        System.out.println(myActivity.name);
        System.out.println(myDoctor.specialization);


    }
}
