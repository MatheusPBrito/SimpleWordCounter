import java.util.Scanner;

public class Main {

  public static void main (String ... args){
    String phrase = " ";
    int words = 1;
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("Write a phrase: ");
      phrase = input.nextLine();

      if (phrase.length() <= 0){
        System.out.println("Write something will ya?");
      }
      else {
        for (int i = 0; i < phrase.length(); i++){
            if(i > 0){
              if(phrase.charAt(i - 1) != ' ' && phrase.charAt(i) == ' ')
                words++;
            }
        }
        break;
      }
    }

    System.out.println("This phrase has " + words + " words!");
  }
}
