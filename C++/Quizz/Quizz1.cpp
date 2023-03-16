/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>
using namespace std;

int main()
{
    int correct = 0;
    int wrong = 0;
    string q1;
    string q2;
    string q3;
    cout<<"Does 1000 * 0= 0, true or false"<<"\n";
    cin>>q1;
    if(q1=="true"){
        correct+=1;
        cout<<"you got "<<correct<<" correct"<<"\n";
    }else{
        wrong +=1;
        cout<<"you got "<<wrong<<" wrong"<<"\n";
    }
    cout<<"Does 1000 * 1= 0, true or false"<<"\n";
    cin>>q2;
    if(q2=="false"){
        correct+=1;
        cout<<"you got "<<correct<<" correct"<<"\n";
    }else{
        wrong +=1;
        cout<<"you got "<<wrong<<" wrong"<<"\n";
    }
    cout<<"Does 1000 * 2= 2000, true or false"<<"\n";
    cin>>q3;
    if(q3=="true"){
        correct+=1;
        cout<<"you got "<<correct<<" correct"<<"\n";
    }else{
        wrong +=1;
        cout<<"you got "<<wrong<<" wrong"<<"\n";
    }
    cout<<"You got"<<correct<<"/3";
    return 0;
}
