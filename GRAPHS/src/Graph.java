import java.util.*;

public class Graph 
{
	
	static class Edge{
		int src,dest;
		
		Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	
	List<List<Integer>> adj=new ArrayList<>();//list interface
	
	public Graph(List<Edge> edges)
	{
		for(int i=0;i<edges.size();i++)
		{
			adj.add(i,new ArrayList<>());
		}
		for(Edge e:edges)
		{
			adj.get(e.src).add(e.dest);
			//adj.get(e.dest).add(e.src); for undirected graph
		}
	}
		
	public static void printgraph(Graph graph)
	{
		int src=0;
		//int size=graph.adj.size();
		

		/* ALTERNATIVE IMPLEMENTATION WITH AN LISTITERATOR */
			
			  ListIterator<List<Integer>> i=graph.adj.listIterator();
			 
			 while(i.hasNext())
			  {
			  		
			  		ArrayList<Integer> i1=new ArrayList<Integer>(graph.adj.get(src));
			  		ListIterator<Integer> i11=i1.listIterator();
			  		while(i11.hasNext())
			  		{
			  			System.out.print(src+" "+i11.next()+" ");
			  		}
			  System.out.println();
			  src++;
			  }
	} 
			
		/*while(src<size)
		{
			for(int a:graph.adj.get(src)) {
				
				System.out.println(src+"  "+a);
				
			}
			System.out.println();
			src++;
		}
	}
	*/
	public static void main(String args[])
	{
		List<Edge> edges=Arrays.asList(new Edge(0,1),new Edge(0,2),
				new Edge(1,3),new Edge(2,4),new Edge(4,5),new Edge(3,5));
		
		Graph g=new Graph(edges);
		printgraph(g);
	}

}
