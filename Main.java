class Main 
{
  int[] numbers = {1, 2, 3, 4, 5, 6};

  public static void main(String[] args) 
  {
    Main mainClass = new Main();

    mainClass.PrintHorizontalNumbers();

    System.out.println();
 
    mainClass.PrintVerticalNumbers();
    mainClass.PrintTree();
  }

  void PrintHorizontalNumbers()
  {
    for(int i = 0; i < numbers.length; i++)   
      System.out.print(i < numbers.length - 1 ? numbers[i] + " - " : numbers[i]); 
  }

  void PrintVerticalNumbers()
  {
    System.out.println();
    for(int j = 0; j < numbers.length; j++)
      System.out.println(numbers[j]);
  }

  void PrintTree()
  {
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