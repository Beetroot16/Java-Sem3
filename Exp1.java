class Complex{
    double real;
    double imaginary;

    Complex(double r,double i){
        this.real = r;
        this.imaginary = i;
    }

    static Complex add(Complex n1,Complex n2){
        Complex n3 = new Complex(0, 0);
        n3.real = n1.real + n2.real;
        n3.imaginary = n1.imaginary + n2.imaginary;
        return n3;
    }
    static Complex substract(Complex n1,Complex n2){
        Complex n3 = new Complex(0, 0);
        n3.real = n1.real - n2.real;
        n3.imaginary = n1.imaginary - n2.imaginary;
        return n3;
    }

    static void display(Complex n3){
        System.out.println(n3.real + " + " + n3.imaginary+"i");
    }
}

class Exp1 {
    public static void main(String[] args) {
        Complex n1 = new Complex(5.5, 2);
        Complex n2 = new Complex(4, 3);
        Complex n3 = Complex.add(n1,n2);
        Complex.display(n3);
    }
}