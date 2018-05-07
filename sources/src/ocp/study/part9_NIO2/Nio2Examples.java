package ocp.study.part9_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Examples {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/kang");
        if(Files.isDirectory(path) && Files.isSymbolicLink(path))
            Files.createDirectory(path.resolve("joey"));
    }
}
