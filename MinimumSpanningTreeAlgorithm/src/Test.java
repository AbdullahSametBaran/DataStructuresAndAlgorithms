
public class Test {
	 public static void main (String[] args) 
	    { 
	  
	        /* Lets create a weighted graph
	         * Parenthesized numbers are vertices(nodes)
	         * only numbers represent weights between them 
	         
	          
	          
	          
	           110 
	       (0)------(1) 
	        |  \     | 
	      26|   2\   |118 
                |      \ | 
	       (2)      (3) 
	      / |        |  \
	 300/  6|        |10  \16
	  /     |        |      \
	 /  11  |        |   22  \
   23/ (7)-----(5)      (4)------(6)  \23
   /    |     /            \      |    \
 (11) 34|   /10000           5\   |18   (10)
   \    | /                      \|    /
   23\ (8)-----------------------(9)  / 23               
	                 93     
	                      
	          like that..            
	                      
	                      
	              
	                */
	        int V = 12;  // Number of vertices in graph 
	        int E = 21;  // Number of edges in graph 
	        MinimumSpanningTreeAlgorithm graph = new MinimumSpanningTreeAlgorithm(V, E); 
	  
	        // add edge 0-1 
	        graph.edgeCollection[0].source = 0; 
	        graph.edgeCollection[0].destination = 1; 
	        graph.edgeCollection[0].weight = 110; 
	  
	        // add edge 0-2 
	        graph.edgeCollection[1].source = 0; 
	        graph.edgeCollection[1].destination = 2; 
	        graph.edgeCollection[1].weight = 26; 
	  
	        // add edge 0-3 
	        graph.edgeCollection[2].source = 0; 
	        graph.edgeCollection[2].destination = 3; 
	        graph.edgeCollection[2].weight = 2; 
	  
	        // add edge 1-3 
	        graph.edgeCollection[3].source = 1; 
	        graph.edgeCollection[3].destination = 3; 
	        graph.edgeCollection[3].weight = 118;  

	         // add edge 3-4 
            graph.edgeCollection[5].source = 3; 
            graph.edgeCollection[5].destination = 4; 
            graph.edgeCollection[5].weight = 10; 
	        
            // add edge 5-7
  	        graph.edgeCollection[6].source = 5; 
  	        graph.edgeCollection[6].destination = 7; 
  	        graph.edgeCollection[6].weight = 11; 
  	        
  	        // add edge 5-2
            graph.edgeCollection[7].source = 5; 
            graph.edgeCollection[7].destination = 2; 
            graph.edgeCollection[7].weight = 6;
            
            // add edge 0-4
            graph.edgeCollection[8].source = 0; 
            graph.edgeCollection[8].destination = 4; 
            graph.edgeCollection[8].weight = 20; 
            
            // add edge 8-9
            graph.edgeCollection[9].source = 8; 
            graph.edgeCollection[9].destination = 9; 
            graph.edgeCollection[9].weight = 93;
            
            //add edge 7-8
            graph.edgeCollection[10].source = 7; 
            graph.edgeCollection[10].destination = 8; 
            graph.edgeCollection[10].weight = 34;
            
            //add edge 6-9
            graph.edgeCollection[11].source = 6; 
            graph.edgeCollection[11].destination = 9; 
            graph.edgeCollection[11].weight = 18;
            
            //add edge 4-6
            graph.edgeCollection[12].source = 4; 
            graph.edgeCollection[12].destination = 6; 
            graph.edgeCollection[12].weight = 22;
            
            //add edge 3-6
            graph.edgeCollection[13].source = 3; 
            graph.edgeCollection[13].destination = 6; 
            graph.edgeCollection[13].weight = 16;
            
            //add edge 2-7
            graph.edgeCollection[14].source = 2; 
            graph.edgeCollection[14].destination = 7; 
            graph.edgeCollection[14].weight = 300;
            
            //add edge 4-9
            graph.edgeCollection[15].source = 4; 
            graph.edgeCollection[15].destination = 9; 
            graph.edgeCollection[15].weight = 5;
            
            //add edge 5-8
            graph.edgeCollection[16].source = 5; 
            graph.edgeCollection[16].destination = 8; 
            graph.edgeCollection[16].weight = 10000;
            
            //add edge 7-11
            graph.edgeCollection[17].source = 7; 
            graph.edgeCollection[17].destination = 11; 
            graph.edgeCollection[17].weight = 23;
            
            //add edge 11-8
            graph.edgeCollection[18].source = 11; 
            graph.edgeCollection[18].destination = 8; 
            graph.edgeCollection[18].weight = 23;
            
            //add edge 6-10
            graph.edgeCollection[19].source = 6; 
            graph.edgeCollection[19].destination = 10; 
            graph.edgeCollection[19].weight = 23;
            
            //add edge 10-9
            graph.edgeCollection[20].source = 10; 
            graph.edgeCollection[20].destination = 9; 
            graph.edgeCollection[20].weight = 23;
            
	        graph.minimumSpanningTree(); 
	    } 

}
