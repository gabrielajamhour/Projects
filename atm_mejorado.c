
#include <stdio.h>

#define InitBalance 1000
float Balance;

int main()
{ int operation, ans;
  float income, withdraw;
  
  printf("\nWelcome to the FSO ATM\n");
  Balance=InitBalance;
  operation=0;
  printf("\nIndicate operation to do:\n");
  printf(" 1.Cash Income\n 2.Cash Withdrawal\n 3.Balance Enquiry\n");
  printf(" 4.Exit\n");

  while(operation != 4) {

    printf("\n Operation: ");
    scanf("%d",&operation);

    switch(operation){
      case 1:
        printf(" Cash Income\n");
        printf("\n Enter the amount to deposit: ");
        scanf("%f",&income);
        Balance=Balance+income;
        printf(" Successful income\n");
        break;

      case 2:
        printf(" Cash Withdrawal\n");
        printf("\n Enter the amount to withdraw: ");
        scanf("%f",&income);

        if(Balance>income){
          Balance=Balance-income;
        }else{
          printf(" Operation does not allowed\n");
          printf("   Not enough cash\n");
        }
        break;

      case 3:
        printf("\n Current Balance: %.2f Euros\n", Balance);
        break;

      case 4:
        printf("\n EXIT\n");
        break;

      default:
        printf(" ERROR: This operation does not applied\n");
        break;
    }
  }
    
  printf("\n Current Balance: %.2f Euros\n", Balance);
  printf("\n Thanks \n\n");
   return(0);
}
