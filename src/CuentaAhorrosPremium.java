public final class CuentaAhorrosPremium extends CuentaAhorros{
    private double comisionPorRetiro;

    public CuentaAhorrosPremium(double comisionPorRetiro, String titular, String numeroCuenta, double saldo, double tasaInteres){
        super(titular, numeroCuenta, saldo, tasaInteres);
        this.comisionPorRetiro = comisionPorRetiro;
    }

    @Override 
    public boolean retirar(double monto){
        if(monto <=0){
            System.out.println("Monto invalido.");
            return false;
        }
        double totalADescontar = monto + comisionPorRetiro;
        if (totalADescontar > super.getSaldo()){
            System.out.println("Saldo insuficiente para cubrir retiro + comisión de " + this.comisionPorRetiro);
            return false;
        }else{
        super.setSaldo(super.getSaldo() - totalADescontar);
        System.out.println("Retiro de " + monto + "comisión " + this.comisionPorRetiro + ". Saldo: " + super.getSaldo());
        return true;
        }
    }

    @Override 
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo: Cuenta Premium");
        System.out.println("Comisión por retiro: $" + this.comisionPorRetiro);
        System.out.println("Sin límite de retiro mensuales.");
    }
}
