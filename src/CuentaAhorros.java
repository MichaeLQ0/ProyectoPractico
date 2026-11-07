public class CuentaAhorros extends Cuenta{
    private double tasaInteres;
    private int retirosMesActual;

    public CuentaAhorros (double tasaInteres, int retirosMesActual ,String titular, String numeroCuenta,double saldo){
        super(Cuenta);
        this.tasaInteres= tasaInteres;
        this.retirosMesActual= 0;
    }
    @Override
    public boolean retirar (double monto){
        if retirosMesActual >= 3{
        System.out.println("limite de 3 retiros mensuales alcanzado");
        return false;
        if monto <= 0 || monto > saldo
           System.out.println("Monto invalido o saldo insuficiente");
           return false
    }
        saldo -= monto
        retirosMesActual += 1
        System.out.println("Retiro #"+ retirosMesActual + " de" + monto + ". Saldo: " + saldo);
        return true
         }
    public aplicarInteres ()
      interes = saldo * tasaInteres
      saldo += interes
      retirosMesActual = 0
      System.out.println("Interes aplicado: " + interes + ". Nuevo saldo: " + saldo);
    
      @Override
       public mostrarInfo()
       System.out.println("Tipo: Cuenta de Ahorros");
       System.out.println("tasa de interes: " + (tasaInteres * 100) + % );
       System.out.println("Retiros este mes: " + retirosMesActual + "/3" );
    }