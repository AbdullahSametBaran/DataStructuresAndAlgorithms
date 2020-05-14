
public class Edge implements Comparable<Edge> {
	 int destination,source, weight; // edge components

	public int compareTo(Edge compareEdge) {  //Comparator function used for sorting edges
		return this.weight - compareEdge.weight; // Of course, based on weight component
	}
};