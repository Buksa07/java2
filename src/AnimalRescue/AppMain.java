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
        Dog axel = new Dog();
        axel.setName("Axel");
        axel.setAge(15);
        axel.setColor("Black");


        Cat mitzi = new Cat();
        mitzi.setName("Mitzi");
        mitzi.setAge(15);
        mitzi.setColor("Gri");
        mitzi.setFavoriteActivitye("runining silent");

        DogFood royal = new DogFood();
        royal.setAvailableInStock("yes");
        royal.setPrice(25);

        CatFood mori = new CatFood();
        mori.setName("Royal");
        mori.setPrice(16);

        Boyadoptator boy = new Boyadoptator();
        boy.setName("Ionut");
        boy.setMoney(17);

        GirlAdoptator girl = new GirlAdoptator();
        girl.setName("Larisa");
        girl.setMoney(25.70F);




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
        System.out.println(axel.getName());
        System.out.println(axel.getAge());
        System.out.println(axel.getColor());
        System.out.println(mitzi.getName());
        System.out.println(mitzi.getAge());
        System.out.println(mitzi.getColor());
        System.out.println(mitzi.getFavoriteActivity());
        System.out.println(royal.getAvailableInStock());
        System.out.println(royal.getPrice() + " $");
        System.out.println(mori.getName());
        System.out.println(mori.getPrice());
        System.out.println(boy.getName());
        System.out.println(boy.getMoney());
        System.out.println(girl.getName());
        System.out.println(girl.getMoney() + " $");












    }
}
