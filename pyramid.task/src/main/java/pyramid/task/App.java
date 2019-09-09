package pyramid.task;

import java.util.List;

import org.apache.log4j.Logger;

import calculation.BestPath;
import data.structure.TreeRoot;

public class App {
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {

		String path = "files/data.txt";

		DataExtraction rd = new DataExtraction();
		List<Integer> resultData = rd.readDataFromFile(path);

		TreeRoot treeRoot = new TreeRoot(0, 1, resultData);

		BestPath bestPath = new BestPath();
		int sum = bestPath.calculate(treeRoot);
		logger.info("TOTAL SUM: " + sum);
	}

}
