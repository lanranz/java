package club.banyuan;

public class Fraction {
    //分母
    private int denominator;
    //分子
    private int numerator;

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public Fraction plus(Fraction r) {
        Fraction fraction = new Fraction();
        fraction.numerator = this.numerator * r.denominator + this.denominator * r.numerator;
        fraction.denominator = this.denominator * r.denominator;
        return fraction;
    }

    public Fraction multiply(Fraction r) {
        Fraction fraction = new Fraction();
        fraction.numerator = r.numerator * this.numerator;
        fraction.denominator = r.denominator + this.denominator;
        return fraction;
    }

    void print() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        System.out.printf("%d / %d\n", numerator / gcd, denominator / gcd);
    }

    int greatestCommonDivisor(int a, int b) {
        int mod = a % b;
        if (mod == 0) {
            return b;
        } else {
            return greatestCommonDivisor(b, mod);
        }
    }
}
