//Program to create a matrix and find an integer
//Written by Jarrett
//Elements derived from www.Cplusplus.com
//January 2020
//Language: c++  (g++ target)

#include <cstring>
#include <iostream>

using namespace std;

int matrix[3][3],
    numb,
    numbcheck,
    found;

int main(void)
{
    numb=1;
    found =0;
    for(int x=0;x<3;x++)
    {
        for(int y=0;y<3;y++)
        {
            matrix[x][y]=numb;
            numb=numb+1;
        }
    }

    for(int x=0;x<3;x++)
    {
        for(int y=0;y<3;y++)
        {
            cout<<matrix[x][y];
        }
        cout<<endl;
    }
    cout<<endl;

cout<< "What integer are you searching for? ";
cin>>numbcheck;

  for(int x=0;x<3&&(found==0);x++)
    {
        for(int y=0;y<3&&(found==0);y++)
        {
            if (matrix[x][y]==numbcheck)
            {found=1;}

            else
              {found=0;}
        }
    }


if (found==1)
{
  cout<< "The integer is in the matrix";
}
  else
  {
    cout<< "The integer is not in the matrix";
  }

    return 0;
}
