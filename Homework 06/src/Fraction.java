public class Fraction {
    int numerator , denominator;
    Fraction(int numerator , int denominator ){
        this.denominator = denominator;
        this.numerator = numerator;
    }
    Fraction(){

    }
    void rutgon(){
        int uocchung = GCD.GCD(denominator,numerator);
        denominator /= uocchung;
        numerator /= uocchung;
    }
     String ShowString(){
        String res = numerator + "/" + denominator;
        return res;
    }
    static Fraction congphanso(Fraction a , Fraction b){
        Fraction c = new Fraction(a.numerator*b.denominator + b.numerator*a.denominator , a.denominator*b.denominator);
        c.rutgon();
        return c;
    }
    static Fraction truphanso(Fraction a , Fraction b){
        Fraction c = new Fraction(a.numerator*b.denominator - b.numerator*a.denominator , a.denominator*b.denominator);
        c.rutgon();
        return c;
    }
    static Fraction nhanphanso(Fraction a , Fraction b){
        Fraction c = new Fraction(a.numerator*b.numerator , a.denominator*b.denominator);
        c.rutgon();
        return c;
    }
    static Fraction chiaphanso(Fraction a , Fraction b){
        Fraction c = new Fraction(a.numerator*b.denominator , a.denominator*b.numerator);
        c.rutgon();
        return c;
    }

}
