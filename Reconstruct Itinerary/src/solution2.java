import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;


public class solution2 {
	
	 public List<String> findItinerary(String[][] tickets) {
	        List<String> ans = new ArrayList<String>();
	        if(tickets == null || tickets.length == 0) return ans;
	        Map<String, PriorityQueue<String>> ticketsMap = new HashMap<>();
	        for(int i = 0; i < tickets.length; i++) {
	            if(!ticketsMap.containsKey(tickets[i][0])) ticketsMap.put(tickets[i][0], new PriorityQueue<String>());
	            ticketsMap.get(tickets[i][0]).add(tickets[i][1]);
	        }
	System.out.println(ticketsMap);
	        String curr = "JFK";
	        Stack<String> drawBack = new Stack<String>();
	        for(int i = 0; i < tickets.length; i++) {
	            while(!ticketsMap.containsKey(curr) || ticketsMap.get(curr).isEmpty()) {
	                drawBack.push(curr);
	                System.out.println(curr+ " was pushed into drawBack");
	                curr = ans.remove(ans.size()-1);
	            }
	            ans.add(curr);
                System.out.println( "Ticket from: "+ curr);
	            curr = ticketsMap.get(curr).poll();
                System.out.println( "Ticket to: "+ curr);	            
	        }
	        ans.add(curr);
	        while(!drawBack.isEmpty()){
	        	ans.add(drawBack.pop());
	        }
	        return ans;
	    }

}
