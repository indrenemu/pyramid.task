package pyramid.task;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataExtraction {

	public List<Integer> readDataFromFile(String pathToFile) {
		
		Path path;
		List<Integer> result = null;
		
		try {

			path = Paths.get(getClass().getClassLoader().getResource(pathToFile).toURI());
			Stream<String> lines = Files.lines(path);
			String data = lines.collect(Collectors.joining("\n"));
			result = this.split(data);
			lines.close();

		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public List<Integer> split(String str){
		String newString = str.replaceAll("\n", " ");
		return Stream.of(newString.split(" "))
	      .map (elem -> Integer.parseInt(elem))
	      .collect(Collectors.toList());
	}

}
