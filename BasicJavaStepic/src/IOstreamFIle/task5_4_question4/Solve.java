package IOstreamFIle.task5_4_question4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solve {
    public static Animal[] method(byte[] data) throws Exception {
        //Path path = Paths.get("object.bin");

        InputStream input = new ByteArrayInputStream(data);
        int deserliazedCNT = 0;

        try (ObjectInputStream ois  = new ObjectInputStream(input)) {
            deserliazedCNT = ois.readInt();
            Animal[] out = new Animal[deserliazedCNT];
            for(int i = 0; i < deserliazedCNT; i++) {
                out[i] = (Animal) ois.readObject();
            }
            return out;

        }
        catch(Exception ex) {
            throw new IllegalArgumentException("error");
        }
    }

    public static void main(String[] args) throws Exception {
        int size = 2;
        Animal first = new Animal("first");
        Animal second = new Animal("second");

        Path path = Paths.get("object.bin");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeInt(2);
            oos.writeObject(first);
            oos.writeObject(second);
        }
        byte[] data = new byte[1024];
        InputStream fin =  Files.newInputStream(Paths.get("object.bin"));
        size = 0;
        int tmp = 0;
        while( (tmp = fin.read(data)) > 0) {
            size += tmp;
        }
        byte[] totalData = new byte[size];
        for(int i = 0; i < size; i++) {
            totalData[i] = data[i];
        }
        for(Animal it : method(totalData)) {
            System.out.println(it.getName());
        }
    }
}
