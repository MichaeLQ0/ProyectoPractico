public class CuentaAhorros extends Cuenta{
    private double tasaInteres;
    private int retirosMesActual;

    public CuentaAhorros (String titular, String numeroCuenta, double saldo, double tasaInteres){
        super(titular, numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
        this.retirosMesActual = 0;
    }

    @Override
    public boolean retirar (double monto){
        if (retirosMesActual >= 3){
            System.out.println("limite de 3 retiros mensuales alcanzado");
            return false;
        }
        if (monto <= 0 || monto > super.getSaldo()){
            System.out.println("Monto invalido o saldo insuficiente");
            return false;
        }
        super.setSaldo(super.getSaldo() - monto);
        retirosMesActual += 1;
        System.out.println("Retiro #"+ retirosMesActual + " de" + monto + ". Saldo: " + super.getSaldo());
        return true;
    }


    public void aplicarInteres(){
      double interes = super.getSaldo() * this.tasaInteres;
      super.setSaldo(super.getSaldo() + interes); 
      this.retirosMesActual = 0;
      System.out.println("Interes aplicado: " + interes + ". Nuevo saldo: " + super.getSaldo());
    }

    @Override
    public void mostrarInfo(){
       System.out.println("Tipo: Cuenta de Ahorros");
       System.out.println("tasa de interes: " + (this.tasaInteres * 100) + "%" );
       System.out.println("Retiros este mes: " + this.retirosMesActual + "/3" );
    }

}