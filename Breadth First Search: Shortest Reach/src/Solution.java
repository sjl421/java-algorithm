import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static List[] graph;
    
    @SuppressWarnings("unchecked")
	public static void addToGraph(int node1, int node2) {
        if(graph[node1] == null) graph[node1] = new ArrayList<Integer>();
        if(!graph[node1].contains(node2))
        	graph[node1].add(node2);
        if(graph[node2] == null) graph[node2] = new ArrayList<Integer>();
        if(!graph[node2].contains(node1))
        graph[node2].add(node1);        
    }    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num_cases = in.nextInt();
        for(int c = 0; c < num_cases; c++) {
    	int num_nodes = in.nextInt(), num_edge = in.nextInt();      
        graph = new List[num_nodes+1];
    	for(int i = 0; i < num_edge; i++) {
            addToGraph(in.nextInt(), in.nextInt());
        }
    		List<Integer> result = new ArrayList<>();	
            int startNode = in.nextInt(); //get the start node.
            
            // print the graph for test
            /*
            System.out.println("This is the graph represented using adjacent lists");
            for(int x = 0; x < graph.length; x++) {
                System.out.print(x + "--> ");
                System.out.println(graph[x]);
            }*/
            
            // get the shortest distance for each destinationNode.
            for(int destinationNode = 1; destinationNode <= num_nodes; destinationNode++){
                if(destinationNode == startNode) continue;
                /*if(graph[destinationNode] == null) {
                	if(destinationNode == num_nodes) System.out.println(-1);
                	else System.out.println(-1 + " ");
                }*/
                boolean[] visited = new boolean[num_nodes+1];// to mark visited node for avoiding cycle.
                Deque<Integer> queue = new ArrayDeque<>();
                queue.addLast(startNode);
                visited[startNode] = true;
                int distance = 0;
                boolean gotPath = false;
                while(!queue.isEmpty()) {
                    int levelSize = queue.size();
                    for(int j = 0; j < levelSize; j++) {
                        int curNode = queue.removeFirst();
                        if(curNode == destinationNode){
                            result.add(distance);
                            gotPath = true;
                            break;
                        }else{  
                                for(int k = 0;graph[curNode] != null && k < graph[curNode].size(); k++){
                                	int nextNode = (int)graph[curNode].get(k); // why need we cast to int?
                                	if(!visited[nextNode]){
                                		queue.addLast(nextNode);
                                		visited[nextNode] = true;
                                	}
                                }
                            }                            
                        }
                    distance += 6;
                    }
                	if(!gotPath) result.add(-1);
                }
	        	for(int n = 0; n < result.size()-1; n++) {
	        		System.out.print(result.get(n) + " ");
	        	}
	        	System.out.print(result.get(result.size()-1));
	            System.out.println();
            }
            System.out.println();
        }
    	
}