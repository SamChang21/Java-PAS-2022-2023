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
    string q1;
    string q2;
    string q3;
    string q4;
    string q5;
    string q6;
    string q7;
    string q8;
    cout<<"Try to survive!!!";
    cout<<"You are on a island without any help after eject from the plane, and you need to try to survive.\n";
    cout<<"what is the first thibg that you should do?\n";
    cout<<"A. Go find water\n";
    cout<<"B. Find things that can be used in the crashed plane\n";
    cin>>q1;
    
    if(q1=="A"|| q1=="a"||q1=="A."|| q1=="a."){
        cout<<"Nice, you find a river as the drinkable water source.\n";
        cout<<"It is getting dark. What should you do?\n";
        cout<<"A. Go find a cave for the night\n";
        cout<<"B. Build a tent by leaves and sticks\n";
        cin>>q2;
        if(q2=="B"|| q2=="b"||q2=="B."|| q2=="b."){
            cout<<"Great, you suvive the first day.\n";
            cout<<"However, you feel every hungry, what should you eat?\n";
            cout<<"A. Go find fishes in the river\n";
            cout<<"B. Eat the red mushrooms beside the tent\n";
            cin>>q3;
            if(q3=="A"|| q3=="a"||q3=="A."|| q3=="a."){
                cout<<"Great, you catch some fishes to eat.\n";
                cout<<"Now, you need to find a someone to rescue you. What will you do?\n";
                cout<<"A. Use signal flare\n";
                cout<<"B. Build a boat and get out of the island\n";
                cin>>q4;
                if(q4=="A"|| q4=="a"||q4=="A."|| q4=="a."){
                    cout<<"No one saw the signal flare\n";
                    cout<<"What else can you do?\n";
                    cout<<"A. Set up fire for the smoke\n";
                    cout<<"B. Write letters and put them into bottles\n";
                    cin>>q5;
                    if(q5=="A"|| q5=="a"||q5=="A."|| q5=="a."){
                        cout<<"You set up fire successfully, but what can you do to make the fire more obvious?\n";
                        cout<<"A. Add more wood\n";
                        cout<<"B. Put some plastic into the fire\n";
                        cin>>q6;
                            if(q6=="B"|| q6=="b"||q6=="B."|| q6=="b."){
                                cout<<"While waiting to be rescued, a bear shows up\n";
                                cout<<"What do you do?\n";
                                cout<<"A. Use fire to scare iy away\n";
                                cout<<"B. Fight it\n";
                                cin>>q7;
                                if(q7=="A"|| q7=="a"||q7=="A."|| q7=="a."){
                                    cout<<"Great choice, someone finally notice the smoke, and got saved\n";
                                }else{
                                    cout<<"You got killed by the bear";
                                }
                                
                            }else{
                                cout<<"The fire is not getting bigger, so no one save you, and then you die.\n";
                            }

                    }else{
                        cout<<"There is no one ganna see the letter, and you are going to die on the island\n";
                    }
                }else{
                    cout<<"The boat fall apart and you drowned\n";
                }
            }else{
                cout<<"You got poison and die\n";
            }
            
        }else{
            cout<<"The bear inside the cave kill you\n";
        }
        
    }else{
        cout<<"You die because of the explotion of the crashed plane\n";
    }
}