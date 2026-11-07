public class App {
    public static void main(String[] args) throws Exception {
        CuentaAhorros cuentaAhorros = new CuentaAhorros("Laura Gómez", "AH-001", 500000, 3);
        CuentaAhorrosPremium cuentaPremium = new CuentaAhorrosPremium("Carlos Rios", "PR-002", 2000000, 4, 2500);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("Empresa XYZ", "CC-003", 100000, 500000);

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

        cuentaAhorros.aplicarInteres();
    }
}
