import java.util.Scanner;

public class Main {

  public static void main (String ... args){
    String phrase = " ";
    int words = 0;
    boolean isEmpty = true;
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("Write a phrase: ");
      phrase = input.nextLine();

      if (phrase.length() <= 0){
        System.out.println("Write something will ya?");
      }
      else {
        for (int i = 0; i < phrase.length(); i++){
            if(i > 0 && i < phrase.length() - 1){
              if(phrase.charAt(i - 1) != ' ' && phrase.charAt(i) == ' ' && phrase.charAt(i + 1) != ' '){
                words++;
                isEmpty = false;
              }
            }
        }
        break;
      }
    }

    if(!isEmpty)
      words++;
    
    System.out.println("This phrase has " + words + " words!");
  }
}
