package ro.unibuc.io;

import java.io.File;

public class FileUtils {

    private FileUtils() {
        throw new IllegalCallerException("Access denied!");
    }

    public static void listFiles(String directoryPath) {
        File directory = new File(directoryPath);

        File[] filesList = directory.listFiles();
        System.out.printf("List of files and directories in %s: \n", directoryPath);
        System.out.println();

        for (File file : filesList) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println();
        }
    }

}
