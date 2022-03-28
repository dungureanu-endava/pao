package ro.unibuc.serializable;

import java.io.*;

class NonSerializableObject {

    public int parentValue = 101;

    public NonSerializableObject() {

    }

    public NonSerializableObject(int parentValue) {
        this.parentValue = parentValue;
    }

    public int getParentValue() {
        return parentValue;
    }

    public void setParentValue(int parentValue) {
        this.parentValue = parentValue;
    }

}

class SerializableObject extends NonSerializableObject implements Serializable {

    private static final long serialVersionUID = 1780287288710761553L;

    public int childValue;
    public static double staticValue;
    public transient String transientValue;
    private final long privateValue;

    public SerializableObject() {
        this.privateValue = 55;
    }

    public SerializableObject(int parentValue, long privateValue) {
        super(parentValue);
        this.privateValue = privateValue;
    }

    @Override
    public String toString() {
        return "SerializableObjects: " +
                "parentValue = " + parentValue +
                "; childValue = " + childValue +
                "; staticValue = " + staticValue +
                "; transientValue = " + transientValue +
                "; privateValue = " + privateValue;
    }

}

public class WorkingWithSerializableObjects {

    private static final String FILE_NAME = "objectFile.txt";

    public static void main(String[] args) {
        WorkingWithSerializableObjects worker = new WorkingWithSerializableObjects();

        SerializableObject serializableObject = worker.buildSerializableObject();
        worker.writeObjectToFile(serializableObject);
        worker.readObjectFromFile();
    }

    public void writeObjectToFile(SerializableObject serializableObject) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(serializableObject);
        } catch (IOException ioException) {
            System.out.println("Exception raised while using ObjectOutputStream");
        }
    }

    public void readObjectFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            SerializableObject serializableObject = (SerializableObject) objectInputStream.readObject();
            System.out.println(serializableObject);
        } catch (ClassNotFoundException | IOException ioException) {
            System.out.println("Exception raised while using ObjectInputStream");
        }
    }

    public SerializableObject buildSerializableObject() {
        SerializableObject serializableObject = new SerializableObject(111, 77);
        SerializableObject.staticValue = 33.33;
        serializableObject.childValue = 33;
        serializableObject.transientValue = "And it's gone!";
        return serializableObject;
    }
}
