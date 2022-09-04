#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>
using namespace std;

int main(int argc, char *argv[]){

    ifstream infile(argv[1]);
    int inbase;          // first number on a line
    string numstring;
    string a[20];
    int value;
    int line_cnt = 0;  // line we're processing
    double sum = 0;
    string line;
    while(getline(infile, line)) {
        line_cnt++;

        if(line.empty()) {}
        else if(line[0] == '*'){}

        else {
            stringstream ss(line);
            ss >> inbase  >> numstring;

        if (inbase>10)
            {
            value = 0; //Placeholder
            }
        else

            {
            stringstream degree(numstring);
            degree >> value;
            }
        int digits;

            digits = 0;

            do {
                ++digits;
              value /= 10;
                } while (value );

            digits= -1 + digits ;
            double point = 0;

            for (int i; (i<=digits);i++)
            {

             point= value % 10;
            point = point * pow(inbase, i );
             sum= point + sum ;

            }

        }
    }
cout << line_cnt << ": ";
cout << sum << endl;

    infile.close();

    return EXIT_SUCCESS;
}
