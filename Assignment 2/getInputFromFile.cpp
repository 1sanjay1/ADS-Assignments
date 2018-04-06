struct node** getInputFromFile() {

	string line;
	std::fstream inputFile("input/schedule.txt", std::ios_base::in);

	int transcationNum = -1;
	int statementNum = -1;	
	int totalStatements = 0;
	char operation;
	char dataItem;

	while( getline(inputFile , line)) {
		if(line.length() != 0)
			totalStatements++;
	}

	std::fstream inputFile1("input/schedule.txt", std::ios_base::in);
	int count = totalStatements ;

	while(count--) {
		inputFile1 >> transcationNum;
		inputFile1 >> statementNum;
		inputFile1 >> operation;
		inputFile1 >> dataItem;

		if( totalTransactions < transcationNum )
			totalTransactions = transcationNum;

		if( maxInstructionNum < statementNum ) 
			maxInstructionNum = statementNum;

	}

	struct node**  schedule = new struct node*[totalTransactions + 1];

	for(int i = 0; i <= totalTransactions ; i++) {
		schedule[i] = new struct node[maxInstructionNum + 1];
	}

	for(int i = 1; i <= totalTransactions; i++) {
		for(int j = 1; j <= totalStatements; j++) {
			schedule[i][j].operation = 'N';
			schedule[i][j].dataItem = 'N';
		}
	}

	std::fstream inputFile2("input/schedule.txt", std::ios_base::in);
	count = totalStatements ;

	while(count--) {
		inputFile2 >> transcationNum;
		inputFile2 >> statementNum;
		inputFile2 >> operation;
		inputFile2 >> dataItem;

		schedule[transcationNum][statementNum].operation = operation; 
		schedule[transcationNum][statementNum].dataItem = dataItem;
	}

	return schedule;
}


int** createGraph(int totalVertices) {

	int** graph = new int*[totalVertices + 1];
	for(int i = 0; i <= totalVertices; i++) {
		graph[i] = new int[totalVertices + 1];
	}

	//Initialization of Graph
	for(int i = 0; i <= totalVertices; i++) {
		for(int j = 0; j <= totalVertices; j++) {
			graph[i][j] = 0;
		}
	}

	return graph;

}

void createEdge(int** graph, struct node** schedule, int transcation, int stmt) {

	char operation = schedule[transcation][stmt].operation;
	char dataItem = schedule[transcation][stmt].dataItem;


	for( int t = 1; t <= totalTransactions; t++ ) {
		if( t != transcation ) {

			for(int s = stmt + 1; s <= maxInstructionNum; s++) {
				if( schedule[t][s].dataItem != 'N') {
					if( (operation == 'R' && schedule[t][s].operation == 'R') || (schedule[t][s].dataItem != dataItem) ) {
						;
					}else {
						graph[transcation][t] = 1;
					}
				}
			}

		}
	}

}

int** createConflictingGraph(int** graph, struct node** schedule) {

	int row = totalTransactions;
	int col = maxInstructionNum;

	for( int stmt = 1; stmt <= col; stmt++) {
		for( int transcation = 1; transcation <= row; transcation++ ) {

			if( schedule[transcation][stmt].dataItem != 'N' ) {
				createEdge(graph, schedule, transcation, stmt);
			}

		}
	}

	return graph;
}