enum Color {WHITE, GRAY, BLACK};

class Graph {

	private :
		int** graph;
		int vertices;

		bool dfs_Search(int, int*) ;
		void topologicalSortingUtil(int, bool*, stack<int>&);

	public :
		
		bool cycleDetection();
		void topologicalSorting();

		Graph(int** graph) {
			this->graph = graph;
			this->vertices = totalTransactions;
		}


};


//Depth First Search
bool Graph :: dfs_Search(int u, int* color) {

	color[u] = GRAY;

	for( int v = 1; v <= vertices; v++ ) {
		if(graph[u][v] == 1 ) {  //Edge between u---> v
			
			if( color[v] == GRAY )
				return true;

			if( color[v] == WHITE && dfs_Search(v, color) )
				return true;

		}
	}

	color[u] = BLACK;

	return false;

}


//Cycle Detection
bool Graph :: cycleDetection() {

	int *color = new int[vertices + 1];

	for(int i = 1; i <= vertices; i++) {
		color[i] = WHITE;
	}

	//DFS Traversal
	for(int i = 1; i <= vertices; i++) {
		if(color[i] == WHITE) {
			if( dfs_Search(i, color) == true )
				return true;
		}
	}

	return false;
}

void Graph:: topologicalSortingUtil(int u, bool *visited, stack<int> &Stack) {

	visited[u] = true;

	for( int v = 1; v <= vertices; v++ ) {
		if( graph[u][v] == 1 ) {
			if( !visited[v] )
				topologicalSortingUtil(v, visited, Stack);
		}
	}

	Stack.push(u);

}

//Topological Sorting to get at least one conflict serializable schedule
void Graph :: topologicalSorting() {

	stack <int> Stack;

	bool *visited = new bool[vertices + 1];
	for( int i = 1; i <= vertices ; i++ ) 
		visited[i] = false;

	for(int i = 1; i <= vertices; i++) {
		if( visited[i] == false ) {
			topologicalSortingUtil(i, visited, Stack);
		}
	}	

	if(!Stack.empty()) {
		cout<<"T"<<Stack.top();
		Stack.pop();
	}

	while(Stack.empty() == false) {
		cout<<" ---> "<<"T"<<Stack.top();
		Stack.pop();

	}

}