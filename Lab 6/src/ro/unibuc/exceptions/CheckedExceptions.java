package ro.unibuc.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) throws Exception {
        CheckedExceptions checkedExceptions = new CheckedExceptions();

        checkedExceptions.exception(false);
        checkedExceptions.fileNotFoundException();
    }

    public void fileNotFoundException() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("NewFile");
    }

    public void exception(boolean throwException) throws Exception {
        if (throwException) {
            throw new Exception("Throwing checked exception!");
        }
    }

}
