import java.util.ArrayList;


public class test {
	public static void main(String args[]){
		UndirectedGraphNode node = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		UndirectedGraphNode node3= new UndirectedGraphNode(3);
		node.neighbors.add(node1);
		node.neighbors.add(node2);
		node.neighbors.add(node3);
		node2.neighbors.add(node3);
		node3.neighbors.add(node1);

		Solution test = new Solution();
		test.cloneGraph (node);
	}
	
}
