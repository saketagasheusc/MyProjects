import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.LinkedList;
//A program that includes an implementation of a graph (based on adjacency
//lists) and Depth First Search using queue implementation.
//Graph construction takes O(E) time
//Author: Saket Agashe
//Date: 27 July 2019
public class GraphDFS{

	//Private variables for size of graph and storing adjacency list for each node
	private static int numVertices;
	private static LinkedList<Integer> adjList[];

	//Constructor for Graph
	GraphDFS(int numVertices){
		this.numVertices= numVertices;
		adjList = new LinkedList[numVertices];
		for(int i = 0; i < numVertices; i++){
			adjList[i] = new LinkedList<Integer>();
		}
	}

	//Function to add an edge from node V to node W
	void addEdge(int v, int w){
		adjList[v].add(w);
	}

	//Function to print the graph by adjacency list
	static void printGraph(){
  	for(int v = 0; v < numVertices; v++) {
    	System.out.println("Adjacency list of vertex "+ v);
      System.out.print("Head");
      	for(Integer pCrawl: adjList[v]){
	        System.out.print(" -> "+pCrawl);
        }
        System.out.println();
      }
  }

	//Helper Function for DFS imlpementation
	//Uses stack to print all nodes reachable from passed in node
	//Nodes have not been visited yet
	void DFSUtil(int s, Vector<Boolean> visited){
		Stack<Integer> stack = new Stack<>();
		stack.push(s);

		while(stack.empty() == false){
			s = stack.peek();
			stack.pop();

			if(visited.get(s) == false){
				System.out.print(s + " ");
				visited.set(s, true);
			}

			Iterator<Integer> itr = adjList[s].iterator();

			while(itr.hasNext()){
				int v = itr.next();
				if(!visited.get(v)){
						stack.push(v);
				}
			}
		}
	}

	//Visits all vertices in DFS manner
	void DFS(){
		Vector<Boolean> visited = new Vector<Boolean>(numVertices);
		for (int i = 0; i < numVertices; i++){
			visited.add(false);
		}

		for (int i = 0; i < numVertices; i++){
			if (!visited.get(i)){
				DFSUtil(i, visited);
			}
		}
	}

	public static void main(String args[]){
		GraphDFS g = new GraphDFS(5);

        g.addEdge(1, 0);
        g.addEdge(2, 1);
        g.addEdge(3, 4);
        g.addEdge(4, 0);

				System.out.println("Graph: ");
				g.printGraph();

        System.out.println("DFS Traversal: ");
        g.DFS();
	}
}
