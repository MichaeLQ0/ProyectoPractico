public class CuentaCorriente extends Cuenta{
  private double limiteCredito;

  public CuentaCorriente(String titular, String numeroCuenta, double saldo, double limiteCredito){
    super(titular, numeroCuenta, saldo);
    this.limiteCredito = limiteCredito;
  }

  @Override 
  public final boolean retirar(double monto){
    if (monto <= 0){
      System.out.println("Monto invalido");
      return false;
    }

    if ((super.getSaldo() - monto) >= (-limiteCredito)){
      super.setSaldo(super.getSaldo() - monto);
      System.out.println("Retiro de " + monto + " aprobado. Saldo: " + super.getSaldo());
      if (super.getSaldo() < 0){ 
        System.out.println( "Cuenta en sobregiro: " + super.getSaldo());
      }
      return true;
    } else{ 
      System.out.println( "Limite de credito superado. Retiro denegado");
      return false;
    }
  } 
    
  @Override
  public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo: Cuenta Corriente");
    System.out.println("Limite de credito: $" + this.limiteCredito);
    if (super.getSaldo() < 0){
      System.out.println("Estado: En sobregiro");
    }else{
      System.out.println("Estado: Al dia");
    }
  }

}

