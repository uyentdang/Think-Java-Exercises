public class Pen {
  String color;
  String maker;
  boolean Click;

  public Pen(String color, String maker) {
        this.color = color;
        this.maker = maker;
        this.Click = false;
  }

  public boolean isClick(boolean Click) {
      if (this.Click == false) this.Click = true;
      else if (this.Click) this.Click = false;
      return this.Click;
  }

  public void ReadyToWrite(boolean Click) {
      String On = "Pen is ready to use";
      String Off = "Pen is Off";
      if (this.Click == false) System.out.println(Off);

      else if (this.Click) System.out.println(On);
      }

  }

