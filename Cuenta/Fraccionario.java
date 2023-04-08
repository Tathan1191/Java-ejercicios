public class Fraccionario {
    private int numerador;
    private int denominador;
    

       public void setnumerador(int numerador) {
        this.numeroCuenta = numeroCuenta;
         }

       public void setdenominador(int denominador) {
        this.numeroCuenta = numeroCuenta;
         }


         public int getnumerador() {
          return this.numerador;
        }

         public int getdenominador() {
          return this.denominador;
        }

        public Fraccionario() {
          this.numerador = 0;
          this.denominador = 0;
      }

      public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    

    public Fraccionario sumar(Fraccionario otro) {
        int num = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int den = this.denominador * otro.denominador;
        return new Fraccionario(num, den);
      }
    
    public Fraccionario restar(Fraccionario otro) {
        int num = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int den = this.denominador * otro.denominador;
        return new Fraccionario(num, den);
    }
    
    public Fraccionario multiplicar(Fraccionario otro) {
        int num = this.numerador * otro.numerador;
        int den = this.denominador * otro.denominador;
        return new Fraccionario(num, den);
    }
    
    public Fraccionario dividir(Fraccionario otro) {
        int num = this.numerador * otro.denominador;
        int den = this.denominador * otro.numerador;
        return new Fraccionario(num, den);
    }
    
    public String toString() {
        return numerador + "/" + denominador;
    }
}
