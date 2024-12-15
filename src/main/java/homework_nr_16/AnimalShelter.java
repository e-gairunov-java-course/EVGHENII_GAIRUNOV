package homework_nr_16;

import java.util.LinkedList;
import java.util.List;

public class AnimalShelter <T extends Animal>{
    public void addNewAnimal(List<? super T> animalList, T animal){
        animalList.add(animal);
    }

    public void makeSounds(List<? extends T> animals){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();
        AnimalShelter<Animal> animalShelter = new AnimalShelter<>();
        animalShelter.addNewAnimal(animals,new Dog());
        animalShelter.addNewAnimal(animals,new Cat());
        animalShelter.makeSounds(animals);
        System.out.println("-----------------");

        List<Dog> dogs = new LinkedList<>();
        AnimalShelter<Dog> dogAnimalShelter = new AnimalShelter<>();
        dogAnimalShelter.addNewAnimal(dogs,new Dog());
        dogAnimalShelter.addNewAnimal(dogs,new Dog());
        dogAnimalShelter.addNewAnimal(dogs,new Dog());
        dogAnimalShelter.addNewAnimal(dogs,new Dog());
        dogAnimalShelter.addNewAnimal(dogs,new Dog());
        dogAnimalShelter.makeSounds(dogs);
    }
}
