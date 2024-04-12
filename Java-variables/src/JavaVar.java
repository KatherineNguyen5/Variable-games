
public class JavaVar {
//datatypes
//class level vars
    
    public static void main(String[] args) throws Exception {
        // datatype varName [=value];
        int games = 3;
        double allowance = 40.50; 
        long battlepass; //We define battlepass
        battlepass = 15;//We assign a value to battle pass

        // Print out our vars values along with a string that explains our values
        System.out.println("Number of games I own = " + games);
        System.out.println("My monthly allowance = " + allowance);
        System.out.println("Cost of a single battlepass = " + battlepass);


        //With your current Allowance, how many battle passes will we able to buy?
        //Comment what you did, and why/how
        System.out.println("With your current Allowance, you can buy " + battlepass);
        //I use System.out.println as the example above that you instuct us in class, and then I type "with your current Allowance, you can buy" with a space and a plus sign and the battle that assigned above.

        //What is the total cost of battle passes 
        //Comment what you did, and why/how

        //First of all, assign the price of battlepass and the number of battlepass. Finally, I continue use System.out.println to calculate the total of battlepasses. 

        // Define the price of a battle pass
        int priceOfBattlePass = 1000;

        // Calculate the total cost of battle passes
        int numBattlePasses = 5;  
        int totalCost = priceOfBattlePass * numBattlePasses;
        System.out.println("The total cost of " + numBattlePasses + " battle passes is $" + totalCost + ".");

    }
}
