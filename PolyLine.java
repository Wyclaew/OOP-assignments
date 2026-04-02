import java.util.ArrayList; //  esnek bi dizi oluşturmak için
import java.util.Collections;   //  arraylisti kolay şekilde terse döndürmek için

public class PolyLine {

    //  noktaları tutmak için listemiz
    private ArrayList<Point> points;

    //  boş yapıcı method
    public PolyLine() {
        this.points = new ArrayList<>();
    }

    //  line nesnesi alan yapıcı method, doğrunun başını ve sonunu listeye ekliyoruz
    public PolyLine(Line line) {
        this.points = new ArrayList<>();
        this.points.add(line.getStartPoint());
        this.points.add(line.getFinishPoint());
    }

    //  tek bir nokta ekle
    public void addPoint(Point addedPoint) {
        points.add(addedPoint);
    }

    //  tek bir line ın başını ve sonunu listeye ekler
    public void addLine(Line line) {
        points.add(line.getStartPoint());
        points.add(line.getFinishPoint());
    }

    //  başka bir polylinedakileri mevcuta aktarma
    public void addPolyLine(PolyLine other) {
        this.points.addAll(other.points);
    }

    //  tüm noktaları yazdıran tostring methodu
    public String toString() {

        //  arraylistin kendi to stringini kullanabiliriz
        return points.toString();
    }

    //  sırayla noktalar arasındaki mesafeyi bulup hepsini topluyoruz
    public double lenght() {
        double totalLenght = 0;

        //  i + 1 ile topladığımız için size - 1 yaptık
        for(int i = 0; i <= points.size() - 1; i++) {
            totalLenght += points.get(i).distanceFromPoint(points.get(i + 1));
        }
        return totalLenght;
    }


    public void reverse() {

        //  javanın içindeki kendi kütüphanesyile çözdük
        Collections.reverse(points);
    }
}
