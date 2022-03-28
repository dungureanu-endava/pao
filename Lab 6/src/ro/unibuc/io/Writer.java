package ro.unibuc.io;

import java.io.*;

class WriterException extends Exception {

    public WriterException(String message, Throwable cause) {
        super(message, cause);
    }

}

public class Writer {

    private final String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileOutputStream(String text) throws WriterException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(text.getBytes());
        } catch (IOException ioException) {
            throw new WriterException("Exception raised while using FileOutputStream", ioException);
        }
    }

    public void fileWriter(String text) throws WriterException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.append(text);
        } catch (IOException ioException) {
            throw new WriterException("Exception raised while using FileWriter", ioException);
        }
    }

    public void writeUsingDataOutputStream(String text) throws WriterException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeUTF(text);
        } catch (IOException ioException) {
            throw new WriterException("Exception raised while using DataOutputStream", ioException);
        }
    }

    public void bufferedOutputStream(String text) throws WriterException {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException ioException) {
            throw new WriterException("Exception raised while using BufferedOutputStream", ioException);
        }
    }

    public void bufferedWriter(String text) throws WriterException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName))) {
            buffer.write(text);
        } catch (IOException ioException) {
            throw new WriterException("Exception raised while using BufferedWriter", ioException);
        }
    }

}
