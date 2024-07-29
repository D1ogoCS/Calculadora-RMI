import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
	public static void main(String[] args) {
        try {
            // cria um objeto para se tornar acessível via rede
            ICalculadora calc = new Calculadora();
            String objName = "rmi://localhost/Calc";
			
            System.out.println("A registar o objeto no RMIRegistry...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, calc);

            System.out.println("A aguardar Clientes!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    } 
}
