public class Point {
    private int x;
    private int y;

    // iki integer değeri alan yapıcı method
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //  tostring methodu
    public String toString() {
        return "(x = " + x + ", y = " + y + ")";
    }

    public double distanceFromPoint(Point otherPoint) {
        
        int xDiff = this.x - otherPoint.x;
        int yDiff = this.y - otherPoint.y;

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2) );
    }

    //  x değikenine ulaşmak için
    public int getX() {
        return x;
    }

    //  y değişkenine ulaşmak için
    public int getY() {
        return y;
    }

}
