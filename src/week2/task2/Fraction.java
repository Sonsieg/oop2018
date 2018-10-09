package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;
    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
    }


    public static void rutgon(Fraction n) {
        int a = n.numerator;
        int b = n.denominator;
        int tmp;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        n.denominator /= a;
        n.numerator /= a;
        if(n.numerator > 0 && n.denominator < 0){
            n.numerator *= -1;
            n.denominator *= -1;
        }

    }

    public String phanso(){
        if(this.numerator % this.denominator !=0)
            return this.numerator + "/" + this.denominator;
        else return "" + this.numerator/this.denominator;
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sum = new Fraction(1,1);
        sum.numerator = this.numerator*other.denominator + other.numerator*this.denominator;
        sum.denominator = this.denominator*other.denominator;
        rutgon(sum);
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sub = new Fraction(1,1);
        sub.numerator = this.numerator*other.denominator - other.numerator*this.denominator;
        sub.denominator = this.denominator*other.denominator;
        rutgon(sub);
        return sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(1,1);
        result.numerator = this.numerator*other.numerator;
        result.denominator = this.denominator*other.denominator;
        rutgon(result);
        return result;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(1,1);
        result.numerator = this.numerator*other.denominator;
        result.denominator = this.denominator*other.numerator;
        rutgon(result);
        return result;
    }




    public boolean equals(Fraction other){
        //so sanh 2 phan so
        Fraction n = new Fraction(this.numerator, this.denominator);
        rutgon(n);
        rutgon(other);
        if(n.numerator == other.numerator && n.denominator == other.denominator)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(2,-6);
        Fraction b = new Fraction(-1,2);
        Fraction result = new Fraction(1,1);
        rutgon(a);
        System.out.println(a.phanso());
        result = a.add(b);
        System.out.println("ket qua phep cong: " + result.phanso());
        result = b.subtract(a);
        System.out.println("ket qua phep tru: " + result.phanso());
        result = b.multiply(a);
        System.out.println("ket qua phep nhan: "+ result.phanso());
        result = b.divide(a);
        System.out.println("ket qua phep chia; "+ result.phanso());
        System.out.println("hai phan so bang  nhau: " + a.equals(b));
    }
}
