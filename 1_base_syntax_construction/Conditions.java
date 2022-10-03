class Conditions {
  public static void main(String[] args) {
    
    // if, else, else if, switch

    int hour = 10;
    boolean isWorkTime = hour > 9 && hour < 21;

    if(isWorkTime){
      System.out.println("Hello!");
    } else {
      System.out.println("world");
    }

  }
}
