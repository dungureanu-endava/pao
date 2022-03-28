package ro.unibuc.io;

public class WorkingWithFiles {

    public static void main(String[] args) throws WriterException, ReaderException {
        final String fileName = "testFile.txt";
        final String text = "Ola (Wave)! \n" +
                "Test Test 1 2 3";

        Writer writer = new Writer(fileName);
        Reader reader = new Reader(fileName);

        writer.fileOutputStream(text);
        reader.fileInputStream();
        System.out.println();

        writer.fileWriter(text);
        reader.fileReader();
        System.out.println();

        writer.writeUsingDataOutputStream(text);
        reader.dataInputStream();
        System.out.println();

        writer.bufferedOutputStream(text);
        reader.bufferedInputStream();
        System.out.println();

        writer.bufferedWriter(text);
        reader.bufferedReader();
    }

}
