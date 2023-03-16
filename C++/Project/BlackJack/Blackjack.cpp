#include <iostream>
#include <cstdlib>
#include <ctime>
#include <vector>
#include <string>

using namespace std;

int cardDeck[13] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
    
int dealCardsG(){
    int y;
    y = rand()%13;
    cout<<"You got"<<cardDeck[y]<<"\n";
    return cardDeck[y];
}
int dealCardsD(){
    int y;
    y = rand()%13;
    cout<<"Dealer got"<<cardDeck[y]<<"\n";
    return cardDeck[y];
}
int Hit(){
    int y;
    y = rand()%13;
    cout<<"You got"<<cardDeck[y]<<"\n";
    return cardDeck[y];
}
int HitD(){
    int y;
    y = rand()%13;
    cout<<"dealer got"<<cardDeck[y]<<"\n";
    return cardDeck[y];
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
        gamerTotal = gamerTotal + dealCardsG() + dealCardsG();
        dealerTotal = dealerTotal + dealCardsD() + dealCardsD();
        cout<<"Your total: "<<gamerTotal<<"\n";
        cout<<"Dealer's total: "<<dealerTotal<<"\n";
        cout<<"Hit? Y/N?\n";
        cin>>hit;
        while(hit == "Y"){
            gamerTotal = gamerTotal + Hit();
            cout<<"Your total: "<<gamerTotal<<"\n";
            if(gamerTotal<21){
                cout<<"Hit? Y/N?\n";
                cin>>hit;
            }
            if(gamerTotal>21){
                cout<<"Bust! \n";
                cout<<"You lose \n";
                break;
            }
        }
        if(dealerTotal<15){
            dealerTotal = dealerTotal + HitD();
            cout<<"Dealer's total: "<<dealerTotal<<"\n";
            if(dealerTotal>21){
                cout<<"You win \n";
            }
        }
        if(gamerTotal<dealerTotal && gamerTotal<21){
            cout<<"You lose \n";
        }
        else if(gamerTotal>dealerTotal && gamerTotal<21){
            cout<<"You win \n";
        }
        cout<<"Do you want to play again? Y/N?\n";
        cin>>play;
    }
    
}