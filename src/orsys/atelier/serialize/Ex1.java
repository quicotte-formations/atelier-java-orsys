package orsys.atelier.serialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("src/config.bin"))));
        oos.writeObject(new Config("urlJdbc", "config", "user", "pwd"));


        oos.flush();
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("src/config.bin"))));

        Config config= (Config)ois.readObject();
        System.out.println(config);
        ois.close();
	}
}
