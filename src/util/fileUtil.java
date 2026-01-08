        package util;

import java.io.*;
import java.util.*;

public class FileUtil {

    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) file.createNewFile();
        return new ArrayList<>(java.nio.file.Files.readAllLines(file.toPath()));
    }

    public static void writeFile(String path, List<String> data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (String line : data) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}
