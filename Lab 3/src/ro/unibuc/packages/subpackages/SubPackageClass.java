package ro.unibuc.packages.subpackages;

import java.util.Random;

public class SubPackageClass {

    public Integer generateRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }

}
