package threads3_1;


public class Points {
    private static int point = 0;
    public static void addPoint(){
        point++;
    }
    public static void reduPoint(){
        point--;
    }
    public static int getpoint(){
        return point;
    }
}
