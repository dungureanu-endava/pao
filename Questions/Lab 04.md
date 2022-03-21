## Lab 4

### What is a String?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        String characters = "abcdefghij...";
        String text = "Viderer eae sciamus pla aliisve capacem cui nec. ";
        int indexOfCharacter = text.indexOf(characters.charAt(5));
        text = text.substring(0, indexOfCharacter) + text.substring(indexOfCharacter+1);
        System.out.println("Updated text: " + text);
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        String original = "Digna sciam facit et at scoporld! Ejusque si ut caetera quomodo co luminis~";
        StringBuilder result = new StringBuilder("New word");
        int index = original.indexOf('m');

        result.setCharAt(0, original.charAt(0));
        result.setCharAt(2, original.charAt(original.length()-1));
        result.insert(1, original.charAt(53));
        result.append(original.substring(29, 33));
        result.delete(7, 9);
        result.insert(3, (original.substring(index-1, index+1)));

        System.out.println("Result: " + result);
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        String text = "Ei loco deus puto quum gi ipsi eo fuse ex.";
        String word = "loco";
        int length = text.length() - text.replace(word, "").length();
        System.out.println("Are lengths the same: " + (word.length() == length));
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        String text = "Cujuslibet distribuam ut ii, credidisse immortalem advertisse ea! Ero respondere diligenter probabiles quodcumque? Discrepant his realitatis.";
        String regex = "[.,!? ]+";
        System.out.println("Split: " + Arrays.toString(text.split(regex)));
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class GrandParent {
    String name = "";
    public GrandParent(String name) { this.name = this.name + name + "Grand Parent Name"; }
}
class Parent extends GrandParent {
    public Parent(String name) { super(name); this.name = this.name + name + "Parent Name"; }
}
class Child extends Parent {
    public Child(String name) { super(name); this.name = this.name + name + "Child Name"; }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Name: " + new Child("David").name);
    }
}
```

### What is a StringBuilder?

### In what context would you use a StringBuilder vs a String?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        String text = "Priusquam rem Suo credendas";
        String palindrome = "sadnedercousmermauqsuirp";

        StringBuilder builder = new StringBuilder(text);
        builder.reverse();

        System.out.println("Is the text a palindrome: " + palindrome.equalsIgnoreCase(builder.toString().replaceAll(" ", "")));
    }
}
```

### What is a StringBuffer?

### In what context would you use a StringBuffer vs a StringBuilder?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pleraque eo caeteras in curantes proposui interdum immittit. ");
        StringBuffer stringBuffer = new StringBuffer("Sum incipio replere visione halitus scripto deo. ");
        stringBuffer.append(stringBuilder);
        stringBuilder.append("Objectioni afferuntur excogitent est addiscerem caligantis his eam deo. ");
        System.out.println("String Builder data: " + stringBuilder);
        System.out.println("String Buffer data: " + stringBuffer);
    }
}
```

### What is an immutable object?

### Is the SupermarketCoupon class immutable?
```
final class SupermarketCoupon {
    private final Long number;
    private final PrivateInformation privateInformation;

    public CreditCard(Long number, PrivateInformation privateInformation) {
        this.number = number
        this.privateInformation = privateInformation;
    }
}

class PrivateInformation {
    private String code;
    private String owner;

    public Chip(String code, String owner) {
        this.code = code;
        this.owner = owner;
    }
}
```

### Is the UniversityDiploma record immutable?
```
record UniversityDiploma(String firstName, String secondName, Date expiryDate, State state) {

    DrivingLicence(String firstName, String secondName, Date expiryDate, State state) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.expiryDate = expiryDate;
        this.state = state;
    }

}
```

### What is a singleton?

### Is the Database class a singleton?
```
class Database {
    private static Database instance;

    private Database() { }

    public static Database getInstance() {
        instance = new Database();

        return instance;
    }
}
```

### Is the System class a singleton?
```
class System {
    public static final System INSTANCE;

    private System() { }

    static {
        INSTANCE = new System();
    }
}
```