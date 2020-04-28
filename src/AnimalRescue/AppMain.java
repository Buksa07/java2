package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Animal nero = new Animal();
        nero.setName("Nero");
        nero.setAge(5);
        nero.setColor("Negru");
        nero.setChipNr(1236);
        nero.setHealt(10);
        nero.setWeight(45.5F);
        nero.setHungry(10);
        nero.setFavotieFood("Prinea");
        nero.setFavoriteActivitye("Runing");

        Food food = new Food();
        food.setName("Purina");
        food.setAmount(15);
        food.setPrice(15.67F);
        food.setAvailableInStock("Yes");

        Adoptator adop = new Adoptator();
        adop.setName("Albacus");
        adop.setMoney(45.10F);

        Veterinarian vet = new Veterinarian();
        vet.setName("Dr. Vasile");
        vet.setSpecialization("Doctor");



        System.out.println(nero.getName());
        System.out.println(nero.getAge());
        System.out.println(nero.getColor());
        System.out.println(nero.getChipNr());
        System.out.println(nero.getWeight());
        System.out.println(nero.getHungry());
        System.out.println(nero.getFavotieFood());
        System.out.println(nero.getFavoriteActivity());
        System.out.println(food.getName());
        System.out.println(food.getAmount());
        System.out.println(food.getPrice() + "$");
        System.out.println(food.getAvailableInStock());
        System.out.println(adop.getName());
        System.out.println(adop.getMoney()+ "$");
        System.out.println(vet.getName());
        System.out.println(vet.getSpecializatio());









    }
}
