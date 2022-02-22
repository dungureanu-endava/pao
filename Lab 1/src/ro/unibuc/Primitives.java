package ro.unibuc;

public class Primitives {

//  Type Casting
//   - Widening Casting (automatically - byte -> short -> char -> int -> long -> float -> double)
//   - Narrowing Casting (manually - double -> float -> long -> int -> char -> short -> byte)

//    - byte
//    It has a minimum value of -128 and a maximum value of 127.
    static byte defaultPrimitiveByte;
    static byte primitiveByte = (byte) 200;

//    - int
//    It has a minimum value of -2^31 and a maximum value of 2^31-1. Default Number Type.
    static int defaultPrimitiveInt;
    static int primitiveInt = 30000;

//    - Using Underscore Characters
    static int primitiveIntWithUnderscore = 354______2____34_234;
//    static int primitiveIntWithUnderscore = 354______2____34_234_; - Invalid
//    static int primitiveIntWithUnderscore = _354______2____34_234_; - Invalid

//    - short
//    It has a minimum value of -32,768 and a maximum value of 32,767.
    static short defaultPrimitiveShort;
    static short primitiveShort = (short) primitiveInt;

//   - long
//    It has a minimum value of -2^63 and a maximum value of 2^63-1. Prefixed with L or l.
    static long defaultPrimitiveLong;
    static long autoCastPrimitiveLong = primitiveInt;
    static long primitiveLong = 234059609L;

//    - float
//    Prefixed with F or f.
    static float defaultPrimitiveFloat;
    static float primitiveFloat = 12.3F;

//    - double
//    Prefixed with D or d. Default Floating-Point Type.
    static double defaultPrimitiveDouble;
    static double primitiveDouble = 34543.2545;

//    - boolean
//    Has only two possible values: true and false.
    static boolean defaultPrimitiveBoolean;
    static boolean primitiveBoolean = true;

//    - char
//    It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
    static char defaultPrimitiveChar;

//    static char primitiveChar = 'c';
    static char primitiveChar = 123;

//   - Decimal: Base 10
//            - Hexadecimal: Base 16 (Prefix 0x)
//            - Binary: Base 2 (Prefix 0b)
    static int hexadecimalInt = 0x1a;
    static int binaryInt = 0b11;

    //   - Default values
    public static void main(String[] args) {
        System.out.println("byte - " + primitiveByte);
        System.out.println("short - " + primitiveShort);
        System.out.println("int with underscore - " + primitiveIntWithUnderscore);
        System.out.println("int - " + primitiveInt);
        System.out.println("Hexadecimal int - " + hexadecimalInt);
        System.out.println("Binary int - " + binaryInt);
        System.out.println("long - " + primitiveLong);
        System.out.println("float - " + primitiveFloat);
        System.out.println("double - " + primitiveDouble);
        System.out.println("boolean - " + primitiveBoolean);
        System.out.println("char - " + primitiveChar);
    }

}
