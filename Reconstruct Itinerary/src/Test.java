import java.util.List;


public class Test {
	static String tickets[][] = {{"EZE","TIA"},{"EZE","HBA"},{"AXA","TIA"},{"JFK","AXA"},{"ANU","JFK"},{"ADL","ANU"},{"TIA","AUA"},{"ANU","AUA"},{"ADL","EZE"},{"ADL","EZE"},{"EZE","ADL"},{"AXA","EZE"},{"AUA","AXA"},{"JFK","AXA"},{"AXA","AUA"},{"AUA","ADL"},{"ANU","EZE"},{"TIA","ADL"},{"EZE","ANU"},{"AUA","ANU"}};
	static String tickets2[][] = {{"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"}};
	public static void main (String args[]){
		Solution test = new Solution();
		solution2 test2 = new solution2();
		List<String> result = test2.findItinerary(tickets);
		System.out.println(result);
	}
}
