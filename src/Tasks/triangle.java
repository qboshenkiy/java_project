public class triangle {
    public double width;
    public double height;

    public triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getSquare(){
        return ((double) 1 / 2 * width * height);
    }
}
