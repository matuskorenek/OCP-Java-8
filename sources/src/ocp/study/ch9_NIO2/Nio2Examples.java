package ocp.study.ch9_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nio2Examples {
    public static void main(String[] args) throws IOException {
//	    System.out.println(Paths.get(".").toAbsolutePath());
    	       cute();
    }

	private static void relativize() {
    	Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
		System.out.println(path.normalize());
    	path = path.normalize().relativize(Paths.get("/lion"));
    	System.out.println(path);
	}

	private static void symbolicLinks() throws IOException {
		Path path = Paths.get("/kang");
		if(Files.isDirectory(path) && Files.isSymbolicLink(path))
			Files.createDirectory(path.resolve("joey"));
	}

	private static void slothSchedule() throws IOException {
    	Path path = Paths.get("sloth.schedule");
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
		if(attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
			BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
			view.setTimes(null, null, null);
		}
	}

	private static void bear() {
    	Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());
	}

	private static void walkingAgain() throws IOException {
		Path path = Paths.get("/animals");
		boolean myBoolean = Files.walk(path)
				.filter(p -> Files.isDirectory(p) && !path.equals(p))
				.findFirst().isPresent();
		System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
	}

	private static void sameFile() throws IOException {
    	Path path = Paths.get("turkey");
    	if(Files.isSameFile(path, Paths.get("/zoo/turkey")))
    		Files.createDirectory(path.resolve("info"));
	}

	private static void isSameFileAgain() throws IOException {
    	Path path1 = Paths.get("./README.md").normalize();
    	Path path2 = Paths.get("mule.png");
    	Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES);
		System.out.println(Files.isSameFile(path1, path2));
	}

	private static void monkeys() throws IOException {
    	Path path = Paths.get("./");
		System.out.println(path.toAbsolutePath());
    	Files.find(path, 1, (p, a) -> a.isSymbolicLink()).map(p -> p.toString())
			    //.collect(Collectors.toList())
			    //.stream()
			    .filter(x -> x.toString().endsWith(".md"))
			    .forEach(System.out::println);
	}

	private static void squid() throws IOException {
    	Path path = Paths.get("./squid/food-schedule.csv");
    	Files.lines(path)
			    .flatMap(p -> Stream.of(p.split(",")))
			    .map(s -> s.toUpperCase())
			    .forEach(System.out::println);
	}

	private static void cute() throws IOException {
    	Files.walk(Paths.get("..").toRealPath())
			    .map(p -> p.toAbsolutePath().toString())
			    .filter(s -> s.endsWith(".java"))
			    .collect(Collectors.toList())
			    .forEach(System.out::println);
	}

}
