public class Main{
    public static void main(String[] args) {
        Challenges challenges = Challenges.getInstance();
        Integer numList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("CHALLENGE 1: " + challenges.maximum(numList));
        System.out.println("CHALLENGE 2: " + challenges.printNumberInWord(7));
        challenges.checkOddEven(7);
        challenges.checkOddEven(6);
        System.out.println("CHALLENGE 4: " + challenges.average(numList));
    }
}