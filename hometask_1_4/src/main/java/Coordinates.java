
public class Coordinates {
    double x;
    double y;

  public Coordinates (double x, double y){
      this.x=x;
      this.y=y;
    }

    public boolean is1Area (double x, double y) {
        if ((x >= -2) & (x <= 2) & (y >= 0) & (y <= 4)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean is2Area (double x, double y) {
        if ((x>=-4) & (x<=4) & (y>=-3) & (y<=0)){
            return true;
        } else {
            return false;
            }
        }

    public boolean isResult () {
      if (is1Area(x,y)|| is2Area(x,y))  {
          return true;
      } else {
          return false;
      }
    }
}
