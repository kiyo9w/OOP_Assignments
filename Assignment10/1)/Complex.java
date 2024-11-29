public class Complex {
    private double real;
    private double imag;

   
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    
    public Complex() {
        this(0.0, 0.0);
    }

    
    public double getReal() {
        return real;
    }

    
    public void setReal(double real) {
        this.real = real;
    }

    
    public double getImag() {
        return imag;
    }

  
    public void setImag(double imag) {
        this.imag = imag;
    }

   
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

   
    public void print() {
        System.out.print(real);
        if (imag >= 0) {
            System.out.println(" + " + imag + "i");
        } else {
            System.out.println(" - " + -imag + "i");
        }
    }

   
    public boolean isReal() {
        return imag == 0.0;
    }

   
    public boolean isImaginary() {
        return real == 0.0;
    }

   
    public Complex addInto(Complex another) {
        this.real += another.real;
        this.imag += another.imag;
        return this;
    }

   
    public Complex addInto(double real, double imag) {
        this.real += real;
        this.imag += imag;
        return this;
    }

    
    public Complex addReturnNew(Complex another) {
        return new Complex(this.real + another.real, this.imag + another.imag);
    }

    
    public Complex addReturnNew(double real, double imag) {
        return new Complex(this.real + real, this.imag + imag);
    }
}
