package pyramid.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import calculation.BestPath;
import data.structure.TreeRoot;

@RunWith(JUnitPlatform.class)
public class AppTest {

	String path = "files/testData.txt";
	String path2 = "files/testData2.txt";
	
	DataExtraction rd = new DataExtraction();

	@Test
	void testSum() {

		List<Integer> resultData = rd.readDataFromFile(path);

		TreeRoot.list = resultData;
		TreeRoot treeRoot = new TreeRoot(0, 1);

		BestPath bestPath = new BestPath();
		int result = bestPath.calculate(treeRoot);
		assertEquals(10, result);
	}
	
	@Test
	void testSum2() {

		List<Integer> resultData = rd.readDataFromFile(path2);

		TreeRoot.list = resultData;
		TreeRoot treeRoot = new TreeRoot(0, 1);

		BestPath bestPath = new BestPath();
		int result = bestPath.calculate(treeRoot);
		assertEquals(22, result);
	}

}
