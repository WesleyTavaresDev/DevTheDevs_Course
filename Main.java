class Main {
  public static void main(String[] args) 
  {
    int[] numbers = {1, 2, 3, 4, 5, 6};

    for(int i = 0; i < numbers.length; i++)
    {
      if(i < numbers.length - 1)
        System.out.print(numbers[i] + " - ");
      else
      {
        System.out.print(numbers[i]);
        System.out.println();
      }
    }

     System.out.println();
    
    for(int j = 0; j < numbers.length; j++)
        System.out.println(numbers[j]);

    System.out.println("      *    ");
    System.out.println("     ***   ");
    System.out.println("    *****  ");
    System.out.println("   ******* ");
    System.out.println("  *********");
    System.out.println("      *    ");
    System.out.println("      *    ");
    System.out.println("      *    ");
  }
}