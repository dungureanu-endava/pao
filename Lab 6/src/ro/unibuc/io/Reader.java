package ro.unibuc.io;

import java.io.*;

class ReaderException extends Exception {

    public ReaderException(String message, Throwable cause) {
        super(message, cause);
    }

}

public class Reader {

    private final String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileInputStream() throws ReaderException {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int character;
            while ((character = fileInputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException ioException) {
            throw new ReaderException("Exception raised while using FileOutputStream", ioException);
        }
    }

    public void fileReader() throws ReaderException {
        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException ioException) {
            throw new ReaderException("Exception raised while using FileOutputStream", ioException);
        }
    }

    public void dataInputStream() throws ReaderException {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            while (dataInputStream.available() > 0) {
                String content = dataInputStream.readUTF();
                System.out.print(content);
            }
        } catch (IOException ioException) {
            throw new ReaderException("Exception raised while using FileOutputStream", ioException);
        }
    }

    public void bufferedInputStream() throws ReaderException {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            while (bufferedInputStream.available() > 0) {
                int data = bufferedInputStream.read();
                System.out.print((char) data);
            }
        } catch (IOException ioException) {
            throw new ReaderException("Exception raised while using FileOutputStream", ioException);
        }
    }

    public void bufferedReader() throws ReaderException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException ioException) {
            throw new ReaderException("Exception raised while using FileOutputStream", ioException);
        }
    }

}