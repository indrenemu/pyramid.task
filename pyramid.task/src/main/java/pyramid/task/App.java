package pyramid.task;

import java.util.List;

import calculation.BestPath;
import data.structure.TreeRoot;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {

		String path = "files/data.txt";

		DataExtraction rd = new DataExtraction();
		List<Integer> resultData = rd.readDataFromFile(path);

		TreeRoot.list = resultData;
		TreeRoot treeRoot = new TreeRoot(0, 1);

		BestPath bestPath = new BestPath();
		int result = bestPath.calculate(treeRoot);
		System.out.println(result);
	}

}
