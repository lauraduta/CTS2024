package ro.ase.cts.lab04.simplefactory;

public class MainSF {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.sound();
        Animal cat = AnimalFactory.createAnimal("Cat");
        cat.sound();

        //to do
    }

}
