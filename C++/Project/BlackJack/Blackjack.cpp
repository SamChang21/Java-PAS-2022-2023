#include <iostream>
#include <cstdlib>
#include <ctime>
#include <vector>
#include <string>

using namespace std;

int cardDeck[13] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
    
int dealCards(){
    int y;
    y = rand()%13;
    return cardDeck[y];
}
int Hit(){
    int y;
    y = rand()%13;
    return cardDeck[y];
}
void check(int total){
    if(total>21){
        cout<<"Bust! \n";
        cout<<"You lose \n";
    }
}
void WinorLose(int x,y){
    if(x<y && x<21){
            cout<<"You lose \n";
        }
        else if(x>y && x<21){
            cout<<"You win \n";
        }
}
int main(){
    srand(time(0));
    int gamerTotal = 0; 
    int dealerTotal = 0;
    string play;
    string hit;
    cout<<"Do you want to play Blackjack? Y/N?\n";
    cin>>play;
    while(play == "Y"){
        gamerTotal = 0; 
        dealerTotal = 0;
        gamerTotal = gamerTotal + dealCards() + dealCards();
        dealerTotal = dealerTotal + dealCards() + dealCards();
        cout<<"Your total: "<<gamerTotal<<"\n";
        cout<<"Dealer's total: "<<dealerTotal<<"\n";
        while(dealerTotal<15){
            dealerTotal = dealerTotal + Hit();
            cout<<"Dealer's total: "<<dealerTotal<<"\n";
            if(dealerTotal>21){
                cout<<"You win \n";
            }
        }
        cout<<"Hit? Y/N?\n";
        cin>>hit;
        while(hit == "Y"){
            gamerTotal = gamerTotal + Hit();
            cout<<"Your total: "<<gamerTotal<<"\n";
            if(gamerTotal<21){
                cout<<"Hit? Y/N?\n";
                cin>>hit;
            }
            check(gamerTotal);
            if(gamerTotal>21){
                break;
            }
        }
        WinorLose(gamerTotal,dealerTotal)
        cout<<"Do you want to play again? Y/N?\n";
        cin>>play;
    }
    
}