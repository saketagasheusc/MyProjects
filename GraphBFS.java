import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

//A program that includes an implementation of a graph (based on adjacency
//lists) and Breadth First Search using queue implementation.
//Graph construction takes O(E) time
//Author: Saket Agashe
//Date: 27 July 2019
public class GraphBFS{

	//Private variables for size of graph and storing adjacency list for each node
	private static int numVertices;
	private static LinkedList<Integer> adjList[];

	//Constructor for Graph
	GraphBFS(int numVertices){
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

	//BFS implementation using queue
	//Runs in O(V + E)
	void BFS(int s){
		boolean visited[] = new boolean[numVertices];
		Queue<Integer> q = new LinkedList<Integer>();

		visited[s] = true;
		q.add(s);
		while(q.size() != 0){
			s = q.poll();
			System.out.print(s + " ");
		  Iterator<Integer> i = adjList[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					q.add(n);
				}
			}
		}
	}

	//Driver function to test out program
	public static void main(String args[]){
        GraphBFS g = new GraphBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
				System.out.println("Graph: ");
				g.printGraph();
        System.out.println("BFS Traversal: ");
        g.BFS(2);
    }

}
