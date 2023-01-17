/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    double height;
    double weight;
    cout<<"What is your height in m?";
    cin>>height;
    cout<<"What is your weight?";
    cin>>weight;
    cout<<"Your BMI is "<<(weight/height/height);

}
