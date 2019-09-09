package pyramid.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import calculation.BestPath;
import data.structure.TreeRoot;

@RunWith(JUnitPlatform.class)
public class AppTest {
	final static Logger logger = Logger.getLogger(AppTest.class);
	String path = "files/testData.txt";
	String path2 = "files/testData2.txt";

	DataExtraction rd = new DataExtraction();

	@Test
	void testSum() {

		List<Integer> resultData = rd.readDataFromFile(path);

		TreeRoot treeRoot = new TreeRoot(0, 1, resultData);

		BestPath bestPath = new BestPath();
		int result = bestPath.calculate(treeRoot);
		logger.info("TOTAL SUM: " + result);
		assertEquals(12, result);
	}

	@Test
	void testSum2() {

		List<Integer> resultData = rd.readDataFromFile(path2);

		TreeRoot treeRoot = new TreeRoot(0, 1, resultData);

		BestPath bestPath = new BestPath();
		int result = bestPath.calculate(treeRoot);
		logger.info("TOTAL SUM: " + result);
		assertEquals(22, result);
	}

}
