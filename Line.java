

public class Line {

    private Point startPoint;
    private Point finishPoint;

    //  line yapıcı methodu
    public Line(Point startPoint, Point finishPoint) {
        this.startPoint = startPoint;
        this.finishPoint =finishPoint;
    }

    public String toString() {
        return startPoint.toString() + " , " + finishPoint.toString();
    }

    public double lineLenght(Point startPoint, Point finishPoint) {

        // point clası içinde zaten hazır vardı direkt kullandık
        return startPoint.distanceFromPoint(finishPoint);
    }

    //  startpointe erişmek için
    public Point getStartPoint() {
        return startPoint;
    }

    //  finishpointe erişmek için
    public Point getFinishPoint() {
        return finishPoint;
    }
}
