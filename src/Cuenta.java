public class Cuenta {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldo < 0){
            this.saldo = 0;
        }else{
            this.saldo = saldo;
        }
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double Saldo){
        this.saldo = saldo;
    }


    public String getTitular(){
        return this.titular;
    }

    public String numeroCuenta(){
        return this.numeroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }




    
    //METODOS

    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Deposito de: " + monto + " realizado. Nuevo saldo: " + this.saldo);
        }else{
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void depositar(double monto, String concepto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Deposito de: " + monto + " por concepto" + concepto + "Nuevo saldo: " + this.saldo);
        }else{
            System.out.println("El monto debe ser positivo.");
        }
    }



    public boolean retirar(double monto){
        if (monto <= 0){
            System.out.println("Monto invalido.");
            return false;
        }else if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro de " + monto + " exitoso. Saldo restante: " + this.saldo);
            return true;
        }else{
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void mostrarInfo(){
        System.out.println("=== Información de cuenta ===");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo);
    }




}
