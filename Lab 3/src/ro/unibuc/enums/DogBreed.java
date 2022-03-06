package ro.unibuc.enums;

public enum DogBreed {

    ALASKAN_MALAMUTE,
    AKITA,
    BEAGLE,
    JAPANESE_SPITZ,
    PUG

}

class Dog {

    private DogBreed dogBreed;

    public Dog(DogBreed dogBreed) {
        this.dogBreed = dogBreed;
    }

    public static void main(String[] args) {
        Dog pug = new Dog(DogBreed.PUG);
        Dog spitz = new Dog(DogBreed.JAPANESE_SPITZ);
    }

}