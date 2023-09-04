public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", 3, Size.SMALL, Breed.BEAGLE);
        Dog spot = new Dog("Spot", 2, Size.MEDIUM, Breed.LABRADOR);
        Dog wolf = new Dog("Wolf", 5, Size.LARGE, Breed.GERMAN_SHEPHERD);

        // Using getter methods to retrieve dog information
        System.out.println("Dog 1: " + snoopy.getName() + ", Age: " + snoopy.getAge() + ", Size: " + snoopy.getSize() + ", Breed: " + snoopy.getBreed());
        System.out.println("Dog 2: " + spot.getName() + ", Age: " + spot.getAge() + ", Size: " + spot.getSize() + ", Breed: " + spot.getBreed());
        System.out.println("Dog 3: " + wolf.getName() + ", Age: " + wolf.getAge() + ", Size: " + wolf.getSize() + ", Breed: " + wolf.getBreed());

        // Calling the bark method
        snoopy.bark();
        spot.bark();
        wolf.bark();
    }
}


