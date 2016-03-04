public class Main { 
  public static void main(String[] args){
  　System.out.println("I will predict your fortune");
    //This equation produces produces a random number between one and four
    int fortune = new java.util.Random() .nextInt(4) + 1;
     
    //Below are outcomes based on the outcomes of the random number generator

    if (fortune == 1) {
     System.out.println("Very lucky!");
  } else if (fortune == 2) {
     System.out.println("Lucky");
  } else if (fortune == 3) {
     System.out.println("Mildly lucky");
  } else {
     System.out.println("Unlucky");
    }
  }
}
