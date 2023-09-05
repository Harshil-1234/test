import java.util.Random;
import java.util.Scanner;

class PlayGame{
    Random rand = new Random();
    private int answerToGuess;
    private int numberOfGuess;

    public PlayGame(){
        answerToGuess = rand.nextInt(101);
        numberOfGuess = 0;
    }

    public boolean checkGuess(int num){
        return (this.answerToGuess == num);
    }

    public void printDetails(){
        System.out.println("Your answer is: "+answerToGuess);
        System.out.println("It took you "+numberOfGuess+" guesses to reach the answer");
    }

    public void increaseStep(){
        numberOfGuess++;
    }

    public void gievHint(int num){
        if(num - answerToGuess > 10){
            System.out.println("Your guess is too high!! Please guess a smaller number");
        }
        else if(num - answerToGuess <= 10 && num-answerToGuess>0) {
            System.out.println("Your guess is a bit high!! Please guess a smaller number");
        }
        else if(num<answerToGuess){
            System.out.println("Please guess a higher number");
        }
    }
}
public class GuessNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game");
        System.out.println("Here you have to guess a number from 1 to 100");
        System.out.println("Let\'s see how many attempts you need");

        PlayGame startGame = new PlayGame();

        boolean playing = true;
        int guessNum;

        Scanner sc = new Scanner(System.in);
        while(playing){
            System.out.print("Input your guess: ");
            guessNum = sc.nextInt();
            startGame.increaseStep();
            if(startGame.checkGuess(guessNum)){
                System.out.println("Congratulations!!! You have WON");
                startGame.printDetails();
                playing = false;
            }
            else{
                startGame.gievHint(guessNum);
            }
        }

        System.out.println("Thank you for Playing");

        sc.close();
    }
}
