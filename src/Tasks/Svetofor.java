package Tasks;

public class Svetofor {
    private String color;
    private int duration;

    public Svetofor(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isRed() {
        return color.equals("Red");
    }

    public boolean isGreen() {
        return color.equals("Green");
    }

    public static void main(String[] args) {
        Svetofor svetofor = new Svetofor("Red", 60);

        System.out.println("Начальный цвет: " + svetofor.getColor());
        System.out.println("Продолжительность: " + svetofor.getDuration());

        svetofor.setColor("Red");
        svetofor.setDuration(45);

        System.out.println("Текущий цвет: " + svetofor.getColor());
        if (svetofor.isRed()) {
            System.out.println("Текущий цвет - красный");
        } else if (svetofor.isGreen()) {
            System.out.println("Текущий цвет - зеленый");
        } else {
            System.out.println("Текущий цвет - другой");
        }
    }
}
