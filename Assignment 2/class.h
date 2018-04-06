using namespace std;


//global variables
int totalTransactions = 0;
int maxInstructionNum = -1;

struct  node
{
	char operation;
	char dataItem;
};

struct node** getInputFromFile();

int** createGraph(int);