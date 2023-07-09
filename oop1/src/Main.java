public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 3);
        Segment segment = new Segment(point1, point2);
        double length = segment.getLength();
        String svgCode = segment.toSvg();
        System.out.println(svgCode);
        Polygon polygon = new Polygon(2);
        polygon.setVertex(0,point1);
        polygon.setVertex(1,point2);
        String svgCode1 = polygon.toSvg();
        System.out.println(svgCode1);
    }

}