#include <iostream>
#include <fstream>
#include <string>
#include <stack>
#include "class.h"
#include "getInputFromFile.cpp"
#include "graph.cpp"


int main(int argc, char const *argv[])
{

	struct node**  schedule = getInputFromFile(); 

	for(int i = 1; i <= totalTransactions; i++) {
		for(int j = 1; j <= maxInstructionNum; j++) {
			if(schedule[i][j].operation != 'N')
			cout<<"T"<<i<<" : "<< "stament-"<<j<<" : "<<schedule[i][j].operation<<"("<< schedule[i][j].dataItem<<")"<<endl;
		}
	}

	int** graph = createGraph(totalTransactions);

	graph = createConflictingGraph(graph, schedule);

	cout<<endl;

	for(int i = 1; i <= totalTransactions; i++) {
		for(int j = 1; j <= totalTransactions; j++) 
			cout<<graph[i][j]<<" ";
		cout<<endl;
	}

	Graph GraphObject = Graph(graph);

	bool isThereAnyCycle = GraphObject.cycleDetection();

	if(isThereAnyCycle) {
		cout<<"\nThere is at least one cycle : It is not conflict serializable schedule"<<endl;
	}
	else {
		cout<<"\nThere is a no cycle : It is a conflict serializable schedule"<<endl;
		cout<<"\nAt least one Conflict Serializable Schedule is"<<endl<<endl;

		GraphObject.topologicalSorting();

	}


	cout<<endl<<endl;
	return 0;
}