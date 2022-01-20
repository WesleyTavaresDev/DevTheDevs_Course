class Main 
{
  public static void main(String[] args) 
  {
    Main mainClass = new Main();
    int[] numbers = {1, 2, 3, 4, 5, 6};

    mainClass.PrintHorizontalNumbers(numbers);

    System.out.println();
    
    mainClass.PrintVerticalNumbers(numbers);
    mainClass.PrintTree();
  }

  void PrintHorizontalNumbers(int[] numbers)
  {
    for(int i = 0; i < numbers.length; i++)   
      System.out.print(i < numbers.length - 1 ? numbers[i] + " - " : numbers[i]); 
  }

  void PrintVerticalNumbers(int[] numbers)
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