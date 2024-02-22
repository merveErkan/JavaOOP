class Rectangular {
    int height;
    int weight;
    public Rectangular(int height, int weight){
        this.height = height;
        this.weight = weight;
    }
    public int  Calculation() {
        return height * weight;
    }

}
public class AreaCalculation {
    public static void main(String[] args){
        Rectangular rectangular = new Rectangular(5, 8);
        System.out.println("area of rectagle:" + rectangular.Calculation());
    }
}
