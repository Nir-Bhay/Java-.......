#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 1; i <= n; i++)
    {
        for (int j = i; j < n; j++)
        {
            cout << " ";
        }
        for (int k = 1; k <= i; k++)
        {
            cout << "*";
        }
        //pattern 6

        for (int j = 1; j < i; j++)
        {
            cout << "*";
        }

        // patter 3
        cout << endl;
    }

    return 0;
}
