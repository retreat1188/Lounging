#include<iostream>
#include<iomanip>
#include<string>
#include<ctime>
#include<cstdlib>
#include<sstream>
#include<cstdio>
using namespace std;

const int ROWSIZE = 12;
const int COLSIZE = 6;
const int ARRAYSIZE = 12;
const int Lineup = 12;
bool checkPosition;
void displayArray(int twoDimensionArr[][COLSIZE]);

struct LineUpPositions {
	string name;
	string positions;
};

string Position(int n) {
	string positions[Lineup] = { "3B", "2B", "1B", "SS", "C", "P", "RCF", "LCF", "RF", "LF", "OUT" };
	string inField;
	string outField;
	bool checkPoint = true;
	positions[0, 1, 2, 3, 4, 5] = inField;
	positions[6, 7, 8, 9, 10] = outField;
	string a = " ";

	for (int i = 0; i < n && checkPoint; i++) {
		if (outField == inField) checkPoint;
		else	checkPoint = false;
	}

	for (int i = 0; i < n; i++)
	{
		a = a + positions[rand() % Lineup];
	}
		return a;
	}

int main() {
	//declarations
	int Table[ROWSIZE][COLSIZE];
	int cntPlayers;
	int num[ARRAYSIZE];
	int temp = 0;
	int smallAvg = 0;
	int bigAvg = 0;
	int userNum = 0;
	int counter;
	string playerNames[12] = {};
	string name[ARRAYSIZE];
	string output = "";
	int lowerBound = 0;
	int upperBound = 0;
	bool tryAgain = true;
	char userChar = 0;
	ostringstream oss; //output string stream

	//get user input
	cout << "Enter 12 player names and their averages: \n";

	for (cntPlayers = 0; cntPlayers < ARRAYSIZE; cntPlayers++) {
		cout << "What is player " << (cntPlayers + 1) << "'s name: ";
		cin >> name[cntPlayers];
	}

		for (cntPlayers = 0; cntPlayers < ARRAYSIZE; cntPlayers++) {
		cout << "What is " << name[cntPlayers] << "'s average: ";
		cin >> num[cntPlayers];

		cout << endl;
	}

	//calculation(s)
	srand(time(NULL)); //initializes random simulation
	int n = 1;

	counter = 0;
	while (counter < userNum) {
		cout << rand() << endl;
		counter++;
	}
	//construction for table modulation
	cout << "Game lineup and field positions: \n";
	cout << "--------------------------------" << endl;
	cout << "Name		Inning 1	Inning 2	Inning 3	Inning 4  Inning 5" << endl;

	reverse(name, name + ARRAYSIZE);
	string positions[Lineup] = { "RCF", "2B", "1B", "P", "C", "SS", "3B", "LCF", "RF", "LF", "OUT", "OUT" };
		string positions1[Lineup] = { "SS", "LCF", "RF", "OUT", "LF", "OUT", "RCF", "1B", "C", "P", "2B", "3B" };
		string positions2[Lineup] = { "LCF", "SS", "C", "1B", "2B", "3B", "P", "RCF", "OUT", "OUT", "LF", "RF"};
		string positions3[Lineup] = { "2B", "OUT", "RCF", "RF", "OUT", "LF", "LCF", "P", "SS", "3B", "1B", "C" };
		string positions4[Lineup] = { "OUT", "3B", "1B", "SS", "C", "P", "2B", "OUT", "LF", "RF", "LCF", "RCF" };
	for (int cntPlayers = 0; cntPlayers < ARRAYSIZE; cntPlayers++)
	{
		cout << name[cntPlayers] << "		" << positions[cntPlayers] << "		" << positions1[cntPlayers] << "		" << 
			positions2[cntPlayers] << "		" << positions3[cntPlayers] << "	  " << positions4[cntPlayers] << "	  	 ";
		cout << endl;
	}

		//nested for statement produces 2D multiplication array
		for (int rowCnt = 0; rowCnt < ROWSIZE; rowCnt++) {
			for (int colCnt = 0; colCnt < COLSIZE; colCnt++) {
				Table[rowCnt][colCnt] = (rowCnt + 1) * (colCnt + 1);
			}
		}

		//**output in a table format
		//create output for first row
		cout << "  ";
		oss << "  ";
		for (int colCnt = 0; colCnt < COLSIZE; colCnt++) {
			cout << "    " << (colCnt + 1) << "   ";
			oss << "    " << (colCnt + 1) << "   ";
		}

		cout << endl;
		oss << endl;
		cout << "  ------------------------------------" << endl;
		oss << "  ----------------------------------" << endl;
		//designation of names and positions
		for (int rowCnt = 0; rowCnt < ROWSIZE; rowCnt++) {
			cout << (rowCnt + 1) << "  ";
			oss << (rowCnt + 1) << "  ";
			for (int colCnt = 0; colCnt < COLSIZE; colCnt++) {
				cout << "- " << setw(3) << Table[rowCnt][colCnt] << "  ";
				oss << "- " << setw(3) << to_string(Table[rowCnt][colCnt]) << "  ";
			}
			cout << "-" << endl;
			oss << " -" << endl;
		}
		cout << "  ---------------------------" << endl << endl;
		output = oss.str() + "  ----------------------------\n";
		cout << output << endl;
		system("pause");
		return 0;
	}

	
//positions sorted onto array of arrays
void displayArray(int twoDimensionArr[][COLSIZE]) {
	for (int row = 0; row < ROWSIZE; row++) {
		for (int col = 0; col < COLSIZE; col++) {
			twoDimensionArr[row][col] = row*col;
		}
	}
};