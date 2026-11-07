public class App {
    public static void main(String[] args) throws Exception {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(3, "Laura Gómez", "AH-001", 500000);
        CuentaAhorrosPremium cuentaPremium = new CuentaAhorrosPremium(2500, "Carlos Rios", "PR-002", 2000000, 4);
        CuentaCorriente cuentaCorriente = new CuentaCorriente (500000, "Empresa XYZ", "CC-003", 100000);

        cuentaAhorros.depositar(50000);
        cuentaAhorros.depositar(100000, "Nómina Julio");

        cuentaAhorros.retirar(20000);
        cuentaAhorros.retirar(30000);
        cuentaAhorros.retirar(10000);
        cuentaAhorros.retirar(5000);

        cuentaPremium.retirar(100000);
        cuentaPremium.retirar(300000);
        
        cuentaCorriente.retirar(400000);
        cuentaCorriente.retirar(300000);

        cuentaAhorros.mostrarInfo();
        cuentaPremium.mostrarInfo();
        cuentaCorriente.mostrarInfo();

        cuentaAhorros.aplicarIntereses();
    }
}
