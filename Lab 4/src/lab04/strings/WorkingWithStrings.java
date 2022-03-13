package ro.unibuc.practice.lab04.strings;

import java.util.Arrays;
import java.util.Random;

class StringExamples {

    public void creatingStrings() {
        System.out.println("Working with String is simple as: " + new String("Hello World"));

        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
        String helloString = new String(helloArray);
        System.out.println("Creating string from char array: " + helloString);

        int salary = 10_000;
        int days = 30;
        float price = 50.99f;
        System.out.println("Casting numbers to string automatically: " + salary);
        System.out.println("Casting formulas to strings automatically: " + (salary / days));
        System.out.println("Or using classic convertors like String.valueOf(): " + String.valueOf(price));
        System.out.println("Or like Integer.toString(): " + Integer.toString(days));
    }

    public void concatenatingStrings() {
        String price = "100";
        String currency = "$";

        System.out.println("Concatenating String in different ways:");
        System.out.println("Using '+' sign: " + price + currency);
        System.out.println("Or using the .concat() method: ".concat(price).concat(currency));
    }

    public void usingStringMethods() {
        String randomString = " World apple carrot home house dor hodor nodor   ";

        System.out.println(".length() for String size: " + randomString.length());

        System.out.println(".charAt(index) for retrieving a character at a particular index: " + randomString.charAt(13));
        System.out.println(".indexOf(string) for retrieving the first position found of a substring: " + randomString.indexOf("hodor"));
        System.out.println(".lastIndexOf(string) for retrieving the last position found of a substring: " + randomString.indexOf("dor"));

        System.out.println(".substring(index) this returns a substring starting at a given index: " + randomString.substring(13));
        System.out.println("or .substring(index1, index2) returns a substring between two indexes: " + randomString.substring(13, 25));

        System.out.println(".toLowerCase() and .toUpperCase() are self explanatory" + randomString.toUpperCase());
        System.out.println(".trim() removes all unnecessary spaces before and after the string: " + randomString.trim());

        System.out.println(".replace(string1, string2) replaces all occurrences of the first string with the second one: " + randomString.replace("dor", "norm"));

        System.out.println("One thing to note is that, it doesn't mather how many operations you do on a String, it never changes its value: " + randomString);
    }

    public void usingRegexExpressions() {
        String latin = "Im agee fiat quin addi ha ex. Libet ha ob omnem de vitae fieri. Du duas ad dare si gi quia. Tur age credidisse reperiatur rei discrepant ibi objectivum distinctum. Extensarum perfectior de industriam in at producatur re. Corrigatur expectabam ha ei necessitas id. Evadit rom hic quodam falsam induci nullas quavis dem. Vice quid ecce quae vel agi ope sim.";
        System.out.println("Regex expressions are patterns used for matching/searching inside strings");
        System.out.println("[abc] match one character from the options 'a', 'b', 'c': " + "b".matches("[abc]"));
        System.out.println("[0-9] match one character from the range 0 to 9: " + "6".matches("[0-9]"));
        System.out.println("[0-9]{2} match two characters from the range 0 to 9: " + "10".matches("[0-9]{2}"));
        System.out.println("[X-Z] match one character from the range 'X' to 'Z': " + "Y".matches("[X-Z]"));
        System.out.println("[a-z]+ match any characters that contains at least one from the range 'a' to 'z': " + "Libet".matches("[a-z]+"));
        System.out.println("[a-z]* match any characters that contains zero or more from the range 'a' to 'z': " + "Libet".matches("[a-z]*"));
        System.out.println("[A-Z][a-z]* match any characters start with a capital letter and follows with any number of lower case letters: " + "Libet".matches("[A-Z][a-z]*"));
        System.out.println("(I|L)[a-z]+ match any characters start with a 'I' or 'L' and follows at least one other lower case letters: " + latin.replaceAll("(I|L)[a-z]+", "Replaced"));
        System.out.println("[aeg]{1,4} match any characters that contain only 'a', 'g', 'e' and that have a size from 1 to 4: " + latin.replaceAll("[aeg]{1,4}", "replaced"));
        System.out.println("^[a-zA-Z]* match any characters at the start of a string that contains only characters: " + latin.replaceAll("^[a-zA-Z]*", "Replaced"));
        System.out.println("[ .]+ match any spaces or dots that appear in a string: " + Arrays.toString(latin.split("[ .]+")));
    }

}

class StringBuilderExamples {

    private static final String SPACE = " ";

    public void buildingStrings() {
        StringBuilder stringBuilder = new StringBuilder("Pleraque eo caeteras in curantes proposui interdum immittit.");
        System.out.println("String Builders are similar to String objects: " + stringBuilder);

        stringBuilder.append(" Color facit de ii volui nulli alium vitam.");
        System.out.println("Except that they can be modified: " + stringBuilder);

        stringBuilder.insert(stringBuilder.toString().indexOf(".") + 1, " At se fraudem incumbo innatis virorum gi.");
        System.out.println("The reference does not change: " + stringBuilder);

        StringBuilder newStringBuilder = new StringBuilder("Im naturales de eundemque ad inspectio ii.");
        stringBuilder.append(SPACE).append(newStringBuilder);
        System.out.println("And you can't use simple operators like '+' to merge strings: " + stringBuilder);

        newStringBuilder.append(SPACE).append("Aciem corpo ullum lor est imo.");
        System.out.println("But once two String Builders have been merged, they don't keep the reference of the other object: " + stringBuilder);

        for (int wordCount = 0; wordCount < 1000; wordCount++) {
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int lengthLimit = 10;
            Random random = new Random();

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < random.nextInt(lengthLimit); i++) {
                int randomLimitedInt = leftLimit + (int) (random.nextDouble() * (rightLimit - leftLimit + 1));
                builder.append((char) randomLimitedInt);
            }

            stringBuilder.append(SPACE).append(builder);
        }

        System.out.println("Finally, strings should always be used unless string builders offer an advantage in terms of simpler code and memory efficiency: " + stringBuilder);

        String currentString = stringBuilder.toString();
        stringBuilder.delete(currentString.lastIndexOf(".") + 1, currentString.length());
        System.out.println("And never forget to cleanup after making a mess: " + stringBuilder);
    }

}

class StringBufferExamples {

    private static final String NEW_LINE = "\n";

    public void bufferingStrings() {
        StringBuffer stringBuffer = new StringBuffer("Pleraque eo caeteras in curantes proposui interdum immittit.");
        System.out.println("StringBuffer and StringBuilder are identical in methods provided: " + stringBuffer);

        stringBuffer.append(" Color facit de ii volui nulli alium vitam.");
        System.out.println("But StringBuilder is faster and preferred over StringBuffer: " + stringBuffer);

        StringBuilder newStringBuilder = new StringBuilder("Im naturales de eundemque ad inspectio ii.");
        stringBuffer.append(NEW_LINE).append(newStringBuilder);
        System.out.println("With the exception being in multi-thread operations, where StringBuffer is used: " + stringBuffer);
    }

}

public class WorkingWithStrings {

    public static void main(String[] args) {
        System.out.println("--- Strings ---");
        StringExamples stringExamples = new StringExamples();
        stringExamples.creatingStrings();
        stringExamples.concatenatingStrings();
        stringExamples.usingStringMethods();
        stringExamples.usingRegexExpressions();

        System.out.println("--- String Builders ---");
        StringBuilderExamples stringBuilderExamples = new StringBuilderExamples();
        stringBuilderExamples.buildingStrings();

        System.out.println("--- String Buffers ---");
        StringBufferExamples stringBufferExamples = new StringBufferExamples();
        stringBufferExamples.bufferingStrings();
    }

}
