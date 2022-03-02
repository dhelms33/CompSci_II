public class Stylet {
    public String color;
    public String type;
    public String userName;
    public final String manufacturer = "Microsoft";
    public Stylet() {


    }

    public Stylet(String color, String type ) {
    this.color = color;
    this.type = type;
    }
    public void draw(String describe) {
        System.out.println("Draw " + describe + ("!"));
    }

}
