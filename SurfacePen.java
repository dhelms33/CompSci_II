public class SurfacePen extends Stylet {
    public SurfacePen() {
        super();

    }
   //can use super(); on variables
    public void setName(String name) {
        super.userName = name; // use as super as var
    }

    public void draw(String focus) {
        System.out.println("Highlight " + focus );
        //or if we wanted to run Stylet's draw method
        //super.draw();
    }
}
