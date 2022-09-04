#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <cstdlib>

using namespace std;

int main(int argc, char *argv[]){

    ifstream infile(argv[1]);

    int a;  // first number on a line
    int b;  // second number on a line
    int c;  // first character on a line
    int line_cnt = 0;  // line we're processing

    string line;
    while(getline(infile, line)) {
        line_cnt++;

        if(line.empty()) {
            cout << "blank line" << endl;
        }
        else if(line[0] == '#') {
            cout << "comment" << endl;
        }
        else {
            stringstream ss(line);
            ss >> a >> b;
            cout << line_cnt;
            cout << ": " << a + b << endl;









        }




    }

    cout << strtol("3B7", NULL, 13) << endl;

    infile.close();

    return EXIT_SUCCESS;
}

