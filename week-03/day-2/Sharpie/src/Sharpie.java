public class Sharpie {
    public String color;
    public Float width;
    static float inkAmount = 100;
    public Sharpie (String color, Float width){
        this.color = color;
        this.width = width;
    }
    public void useSharpie (){
        this.inkAmount --;
    }
}
