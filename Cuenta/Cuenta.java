public class Cuenta {
    private int numeroCuenta;
    private String idCliente;
    private float saldoActual;
    private float interes;

 //  Set
    public void setnumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }


 //  Get
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public String getIdCliente() {
        return this.idCliente;
    }

    public float getSaldoActual() {
        return this.saldoActual;
    }

    public float getInteres() {
        return this.interes;
    }


    public Cuenta() {
        this.numeroCuenta = 0;
        this.idCliente = "";
        this.saldoActual = 0;
        this.interes = 0;
    }

    public Cuenta(int numeroCuenta, String idCliente, float saldoActual, float interes) {
        this.numeroCuenta = numeroCuenta;
        this.idCliente = idCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public void actualizarSaldo() {
        this.saldoActual *= (1 + (this.interes / 365));
    }

    public void ingresar(float valor) {
        this.saldoActual += valor;
    }

    public void retirar(float valor) {
        this.saldoActual -= valor;
    }

}



