class Game{
    int RandomInput;
    int UserInput;
    int NoOfGuess = 0;
    //constructor for random no
    public Game(){
        Random rand = new Random();
        RandomInput = rand.nextInt(101);
        System.out.println("Welcome to the Game!");
        System.out.println("The computer has made its choice:)");
        //bcuz it start from 1
    }
    //for user input
    public void TakeUserInput(){
        Scanner user = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 100:");
        UserInput = user.nextInt();
    }
    //check conditions
    public void isCorrectNumber(){
        if (UserInput>RandomInput){
            System.out.println("Its TOO High!");
        }
        else if(UserInput<RandomInput){
            System.out.println("Its TOO low!");
        }
        else if(UserInput == RandomInput){
            System.out.println("Correct Answer, You Win:)");
        }
    }
    //no of guess getter n setter
    public void SetNoOfGuess(int a){
        NoOfGuess = a;
    }
    public int GetNoOfGuess(){
        return NoOfGuess;
    }
}
public class GuessTheNumber {
    public static void main(String[]args){
Game game1 = new Game();
//using do while loop for range
do{
    game1.TakeUserInput();
    if(game1.UserInput<0||game1.UserInput>100){
        System.out.println("Number is out of Range!\n  ,please select between 1 to 100\n ");
    continue;
    }
    game1.SetNoOfGuess(++game1.NoOfGuess);
    game1.isCorrectNumber();
}
while(game1.UserInput!=game1.RandomInput);
        System.out.println("Number of guesses-"+game1.GetNoOfGuess());
    }
}
