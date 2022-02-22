package ro.unibuc;

public class WrapperClasses {

//   - Byte
    static Byte wrapperByte = 123; // (byte) -> Byte
    static Byte defaultWrapperByte;

//   - Short
    static Short wrapperShort = 26345;

//   - Integer
    static Integer wrapperInt = 32_354_324;

//   - Long
    static Long wrapperLong = wrapperInt.longValue();

//   - Float
    static Float wrapperFloat = new Float(32.453);

//   - Double
    static Double wrapperDouble = 32_354_324.2;

//   - Boolean
    static Boolean wrapperBoolean = false;

//   - Character
    static Character wrapperCharacter = 'c';

//   - Default values
    public static void main(String[] args) {
        System.out.println("Default - " + defaultWrapperByte);
        System.out.println("Byte - " + wrapperByte);

//        System.out.println(defaultWrapperByte.equals(wrapperByte));
        System.out.println("short - " + wrapperShort);
        System.out.println("int - " + wrapperInt);
        System.out.println("long - " + wrapperLong);
        System.out.println("float - " + wrapperFloat);
        System.out.println("double - " + wrapperDouble);
        System.out.println("boolean - " + wrapperBoolean);
        System.out.println("char - " + wrapperCharacter);
    }

}
