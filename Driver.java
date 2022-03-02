public class Driver {
    public static void main(String[] args) {
        //SurfacePen dPen = new Surfacepen();
        Stylet Surface = new Stylet("Black","Brush");
        Surface.draw("A Penis");
        SurfacePen pen1 = new SurfacePen();
        Surface.draw("Stack and Heap"); //prioritizes within class
        pen1.draw("Stack and Heap");//prioritizes Stack and Heap




    }
}
