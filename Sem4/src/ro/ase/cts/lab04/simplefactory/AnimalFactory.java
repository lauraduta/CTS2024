package ro.ase.cts.lab04.simplefactory;

public class AnimalFactory {
    public static Animal createAnimal(String type){
    if ("Dog".equalsIgnoreCase(type)){
        return new Dog();
    } else if ("Cat".equalsIgnoreCase(type)){
        return new Cat();
    } else {
        throw new IllegalArgumentException("Invalid animal type");
    }
    }
}
