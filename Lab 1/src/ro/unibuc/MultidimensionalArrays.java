package ro.unibuc;

// import java.long.*;
import java.util.Arrays;

public class MultidimensionalArrays {

//    - Arrays
//   - dataType[] reference = new dataType[arraySize];
//   - dataType reference[] = new dataType[arraySize];
//   - dataType[] reference = {value0, value1, value2, ...}
//   * Once defined, the size of an array doesn not change
//
//           - Multidimensional Arrays (Matrix)
//
//           - Arrays utility class
//   - binarySearch
//           - copyOf
//           - equals
//           - sort
//           - fill
//           - forEach

    public static void main(String[] args) {
//    - Arrays
        System.out.println("Arrays");
//   - dataType[] reference = new dataType[arraySize];
//   - dataType reference[] = new dataType[arraySize];
        int[] arrayOfInteger = new int[2];
//        int arrayOfInteger[] = new int[2];

        arrayOfInteger[0] = 1;
        arrayOfInteger[1] = 2;

        System.out.println("Array: " + arrayOfInteger);
        System.out.println("Array at position 0: " + arrayOfInteger[0]);
        System.out.println("Array at position 1: " + arrayOfInteger[1]);

        System.out.println("Array size: " + arrayOfInteger.length);

//        arrayOfInteger[2] = 3;
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//        at ro.unibuc.MultidimensionalArrays.main(MultidimensionalArrays.java:36)

//   - dataType[] reference = {value0, value1, value2, ...}
        int[] arrayDefined = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Defined array size: " + arrayDefined.length);

//           - Multidimensional Arrays (Matrix)
        int[][] matrix = new int[2][];
        matrix[0] = new int[3];
        // Add data here

        int[][] matrix2Point0 = { {1, 2, 3}, {1}, {2, 3, 4, 5} };


//   - Arrays utility class
//           - copyOf
        int[] arrayDefinedSubSection = Arrays.copyOf(arrayDefined, 20);
        System.out.println("Defined array new size: " + arrayDefinedSubSection.length);

//           - equals
        int[] arrayDefinedInverted = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Arrays equal? " + Arrays.equals(arrayDefined, arrayDefinedInverted));

//           - sort
        Arrays.sort(arrayDefinedInverted);
        System.out.println("Arrays equal? " + Arrays.equals(arrayDefined, arrayDefinedInverted));

//           - fill - replaces all elements with the given value
        Arrays.fill(arrayDefinedInverted, 11);
        System.out.println("Array reference: " + arrayDefinedInverted);
        Arrays.fill(arrayDefinedInverted, 12);
        System.out.println("Array reference: " + arrayDefinedInverted);
        Arrays.fill(arrayDefinedInverted, 13);
        System.out.println("Array reference: " + arrayDefinedInverted);

//           - forEach
        Arrays.stream(arrayDefined).forEach(element -> {
            System.out.println(element);
        });

//           - binarySearch
        System.out.println("Element at position 5: " + Arrays.binarySearch(arrayDefined, 5));
    }

}
