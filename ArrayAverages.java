import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    //Average is double because it requires division
    //Creates a loop which adds every value in a row
    //Divides by the amount of positions in that row
    //Moves to the next row
    double average = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        average += ray[row][col];
      }
      average /= ray[0].length;
      System.out.println("Row " + row + " average : " + average);
      average = 0;
    }
  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    double average = 0;
    for(int col = 0; col<ray[0].length; col++)
    {
      for(int row = 0; row<ray.length; row++)
      {
       average += ray[row][col];
      }
      average /= ray.length;
      System.out.println("Col " + col + " average : " + average);
      average = 0;
    }
  }

  public void arrayAverage(){
    //average is double because it requires division
    //Creates a loop which adds every value in the 2D array
    //Divides by the amount of positions (rows*cols)
    double average = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        average += ray[row][col];
      }
    }
    average /= ray.length * ray[0].length;
    System.out.println("Array average : " + average);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
