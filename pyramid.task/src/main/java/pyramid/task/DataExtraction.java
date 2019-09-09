package pyramid.task;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class DataExtraction {

	final static Logger logger = Logger.getLogger(DataExtraction.class);

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
			logger.error("Error occured: ", e);
		} catch (IOException e) {
			logger.error("Error occured: ", e);
		}

		return result;
	}

	public List<Integer> split(String str) {
		String newString = str.replaceAll("\n", " ");
		return Stream.of(newString.split(" ")).map(elem -> tryParse(elem)).collect(Collectors.toList());
	}

	public static Integer tryParse(String number) {
		try {
			return Integer.parseInt(number);
		} catch (NumberFormatException e) {
			logger.error("Could not parse string : " + number, e);
			return 0;
		}
	}

}
