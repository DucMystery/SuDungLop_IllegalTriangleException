import java.util.Map;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public double getA() {
        return a;
    }

    public Triangle setA(double a) {
        this.a = a;
        return this;
    }

    public double getB() {
        return b;
    }

    public Triangle setB(double b) {
        this.b = b;
        return this;
    }

    public double getC() {
        return c;
    }

    public Triangle setC(double c) {
        this.c = c;
        return this;
    }

    public boolean isTriangle(){
        if ((a+b)>c && (a+c)>b&& (b+c)>a && a>0 && b>0 && c>0){
            return true;
        }else
            return false;
    }

    public double getArea() throws IllegalTriangleException{
        if (isTriangle()){
            double p = (a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }else {
            throw new IllegalTriangleException("Not Triangle!");
        }
    }
}
