/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>
using namespace std;

double addition(double num1, double num2){
	double result= num1+num2;
	cout<<"the result of"<<num1<<"+"<<num2<<"="<<result<<"\n";
	return result;
}
double subtraction(double num1, double num2){
	double result= num1-num2;
	cout<<"the result of"<<num1<<"-"<<num2<<"="<<result<<"\n";
	return result;
}
double multiplication(double num1, double num2){
	double result= num1*num2;
	cout<<"the result of"<<num1<<"*"<<num2<<"="<<result<<"\n";
	return result;
}
double division(double num1, double num2){
	double result= num1/num2;
	cout<<"the result of"<<num1<<"/"<<num2<<"="<<result<<"\n";
	return result;
}
double exponents(double num1, double num2){
	int result = 1;
	   for (int i = 0; i < num2; i = i + 1) {
	       result = result * num1;
	   }
	cout<<"the result of"<<num1<<"^"<<num2<<"="<<result<<"\n";
	return result;
}
int mod( int num1, int num2){
	int result=  num1 % num2;
	cout<<"the result of"<<num1<<"%"<<num2<<"="<<result<<"\n";
	return result;
}

int main()
{
    string question;
	int correct = 0;
	double num1;
	double num2;
	double answer;
	double result;
	int qt;
	cout<<"Do you want to count something? Y/N \n";
	cin>> question;
	while(question == "Y" || question == "y"){
		cout<<"What type of question do you want to do? \n";
		cout<<"1. addition \n";
		cout<<"2. subtraction \n";
		cout<<"3. multiplication \n";
		cout<<"4. division \n";
		cout<<"5. exponents \n";
		cout<<"6. mod \n";
		cin>>qt;
		if (qt==1)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num2;
			result = addition(num1 , num2);
			cout<<result<<"\n";
		}
		else if (qt==2)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num2;
			result = subtraction(num1 , num2);
			cout<<result<<"\n";
		}
		else if (qt==3)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num2;
			result = multiplication(num1 , num2);
			cout<<result<<"\n";
		}
		else if (qt==4)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num2;
			result = division(num1 , num2);
			cout<<result<<"\n";
		}
		 else if (qt==5)
		{
		    cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num2;
			result = exponents(num1 , num2);
			cout<<result<<"\n";
		}
		else if (qt==6)
		{
			cout<<"What is your num1=?\n";
			cin>>num1;
			cout<<"What is your num2=?\n";
			cin>>num2;
			result = mod(num1 , num2);
			cout<<result<<"\n";
		}
	cout<<"Do you want to count something? Y/N \n";
	cin>> question;
	}
}

double modulus( double num1, double num2){
	double result=  num1 % num2;
	cout<<"the result of"<<num1<<"%"<<num2<<"="<<result<<"\n";
	return result;
}

int main()
{
    string question;
	int correct = 0;
	double num1;
	double num2;
	double answer;
	double result;
	int qt;
	cout<<"Do you want to count something? Y/N \n";
	cin>> question;
	if(question == "Y" || question == "y"){
		cout<<"What type of question do you want to do? \n";
		cout<<"1. addition \n";
		cout<<"2. subtraction \n";
		cout<<"3. multiplication \n";
		cout<<"4. division \n";
		cout<<"5. exponents \n";
		cout<<"6. addition \n";
		cin>>qt;
		if (qt==1)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num2;
			result = addition(num1 , num2);
			cout<<result<<"\n";
		}
		if (qt==2)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num1;
			result = subtraction(num1 , num2);
			cout<<result<<"\n";
		}
		if (qt==3)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num1;
			result = multiplication(num1 , num2);
			cout<<result<<"\n";
		}
		if (qt==4)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num1;
			result = division(num1 , num2);
			cout<<result<<"\n";
		if (qt==5)
		{
			cout<<"What is your num1?\n";
			cin>>num1;
			cout<<"What is your num2?\n";
			cin>>num1;
			result = exponents(num1 , num2);
			cout<<result<<"\n";
		if (qt==6)
		{
			cout<<"What is your num1=?\n";
			cin>>num1;
			cout<<"What is your num2=?\n";
			cin>>num1;
			result = modulus(num1 , num2);
			cout<<result<<"\n";
			}
	cout<<"Do you want to count something? Y/N \n";
	cin>> question;
	}
}
}
}