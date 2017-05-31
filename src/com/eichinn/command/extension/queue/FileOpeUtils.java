package com.eichinn.command.extension.queue;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class FileOpeUtils {
    private FileOpeUtils() {

    }

    public static List readFile(String pathName) {
        List list = new ArrayList();

        ObjectInputStream ois = null;

        try {
            File f = new File(pathName);
            if (f.exists()) {
                ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List) ois.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

    public static void writeFile(String pathName, List list) {
        File f = new File(pathName);

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
