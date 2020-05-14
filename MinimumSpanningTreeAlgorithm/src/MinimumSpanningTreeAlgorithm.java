import java.util.*;

public class MinimumSpanningTreeAlgorithm { //Basically A Graph Class
	
	/*                  What is Minimum Spanning Tree?
	 * 
	 * Based on a bonded and weighted graph, a spanning tree is a subgraph of the primary graph. 
	 * Also,that is a tree which connects all the vertices (nodes) together.
	 *  
	 *  Main Point:
	 * Although a single graph can have lots of dissimilar spanning trees, 
	 * a minimum spanning tree (MST) for a weighted, bonded and undirected graph
	 *  is a spanning tree with weight less than or equal to the weight of every other spanning trees.
	*/
	
	

	Edge edgeCollection[]; // Edge Array Collection
	int numberOfVertices, numberOfEdges;

	MinimumSpanningTreeAlgorithm(int numberOfVertices, int numberOfEdges) { // Creates a graph with vertices and edges
		this.numberOfVertices = numberOfVertices;
		this.numberOfEdges = numberOfEdges;
		edgeCollection = new Edge[numberOfEdges];

		for (int i = 0; i < numberOfEdges; ++i)
			edgeCollection[i] = new Edge();
	}
	
	class subCategory { // A class to exemplify a subset 
		int parent;
		 int rank;
	}
	
	int findIt(subCategory subCs[], int i) {// With find and union methods, we detect the possible cycles

		if (subCs[i].parent != i)
			subCs[i].parent = findIt(subCs, subCs[i].parent);

		return subCs[i].parent;
	}

	public void Union(subCategory subCategories[], int a, int b) { // merging two roots with via their ranks
		int firstRoot = findIt(subCategories, a);
		int secondRoot = findIt(subCategories, b);

		//Connect the smaller rank tree under the root of the high-rank tree 
		if (subCategories[firstRoot].rank < subCategories[secondRoot].rank)
			subCategories[firstRoot].parent = secondRoot;
		else if (subCategories[firstRoot].rank > subCategories[secondRoot].rank)
			subCategories[secondRoot].parent = firstRoot;

		 // If ranks are same, then make one as root and increment its rank by one 
		else {
			subCategories[secondRoot].parent = firstRoot;
			subCategories[firstRoot].rank++;
		}
	}
	

	public void minimumSpanningTree() { //We use Kruskal's algorithm 

		Edge result[] = new Edge[numberOfVertices];  //We can store the formed Minimum Spanning Tree with that

		int resultsIndex = 0;
		int sortedEdges = 0;
		for (sortedEdges = 0; sortedEdges < numberOfVertices; ++sortedEdges)
			result[sortedEdges] = new Edge();

		 // 1) Sort all the edges in non-decreasing order of their 
         // weight. If we cannot alter the given graph, we 
         // can create a copy of an array of edges 
		
		Arrays.sort(edgeCollection);

		// Allocate memory for creating V subsets
		subCategory subCs[] = new subCategory[numberOfVertices];
		for (sortedEdges = 0; sortedEdges < numberOfVertices; ++sortedEdges)
			subCs[sortedEdges] = new subCategory();
		
		
		 // Create V subsets with single elements
		for (int v = 0; v < numberOfVertices; ++v) {
			subCs[v].parent = v;
			subCs[v].rank = 0;
		}

		// Index used to pick next edge 
		sortedEdges = 0;

		// Number of edges to be taken is equal to V-1 
		while (resultsIndex < numberOfVertices - 1) {

			 //  2) Pick the smallest edge and increase the index for the following iteration
			Edge nextEdge = new Edge();
			nextEdge = edgeCollection[sortedEdges++];

			int s = findIt(subCs, nextEdge.source);
			int m = findIt(subCs, nextEdge.destination);

			
			//If containing this edge doesn't cause cycle, 
			//add it in the result and increase the index of result for next edge  
			
			if (s != m) {
				result[resultsIndex++] = nextEdge;
				Union(subCs, s, m);
			}
		}
		

		System.out.println("In the set Minimum Spanning Tree,"
				+ "\nthe minimum edge amount between the two nodes is given below.");
		
		for (sortedEdges = 0; sortedEdges < resultsIndex; ++sortedEdges) {
			System.out.println(result[sortedEdges].source + " <-to-> " + 
		result[sortedEdges].destination + " == " + result[sortedEdges].weight);
			}
	}

	
	
	// 1) Sort all the edges in non-decreasing order of their weight.
	
	// 2) Pick the smallest edge. Check if it fits a cycle with the spanning-tree formed so far.
	// If the cycle is not created, include this edge; otherwise, discard it
	 
	
	//3. Repeat the (2) until there are (V-1) edges in the spanning tree.
	

}