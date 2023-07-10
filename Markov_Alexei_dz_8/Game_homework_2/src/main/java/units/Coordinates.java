package units;

import java.util.ArrayList;

public class Coordinates {
    int x, y;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double countDistanse(Coordinates coordinates){
        int dx = coordinates.x - x;
        int dy = coordinates.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }


}
