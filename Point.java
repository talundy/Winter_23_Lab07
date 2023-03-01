import java.util.List;

public class Point
{
   public final int x;
   public final int y;

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public boolean isValidPoint(PathingMain.GridValues[][] grid){
      return PathingMain.withinBounds(this, grid) &&
              grid[this.y][this.x] != PathingMain.GridValues.OBSTACLE &&
              grid[this.y][this.x] != PathingMain.GridValues.SEARCHED;
   }
}
