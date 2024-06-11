public class Circle {
    public int R;

    public  Circle(int R){
        this.R = R;
    }

    public double getSquare(){
        return Math.PI * Math.pow(R, 2);
    }

    public double getCircleLength(){
        return 2 * Math.PI * Math.pow(R, 2);
    }
}
