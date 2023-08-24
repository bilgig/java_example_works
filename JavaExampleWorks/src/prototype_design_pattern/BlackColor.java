package prototype_design_pattern;
//Color abstract sınıfını extend eden subclasstır.
public class BlackColor extends Color{
    public BlackColor()
    {
        this.colorName = "black";
    }

    @Override
    void addColor()
    {
        System.out.println("Black color added");
    }
}
