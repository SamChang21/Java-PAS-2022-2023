/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int cars = 100;
    int space_in_a_car = 4.0;
    int drivers = 30;
    int passengers = 90;
    int cars_not_driven = cars - drivers;
    int cars_driven = drivers;
    int carpool_capacity = cars_driven * space_in_a_car;
    int average_passengers_per_car = passengers / cars_driven;

    cout<<"There are"<<cars<<"cars available."<<"\n";
    cout<<"There are only" <<drivers << " drivers available."<<"\n";
    cout<<"There will be" <<cars_not_driven<<"empty cars today."<<"\n";
    cout<<"We can transport"<<carpool_capacity<<"people today."<<"\n";
    cout<<"We have"<<passengers<<"to carpool today."<<"\n";
    cout<<"We need to put about"<<average_passengers_per_car<<"in each car."<<"\n";
}
