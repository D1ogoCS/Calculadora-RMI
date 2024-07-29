import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    String resultado = "";

    public Calculadora() throws RemoteException { 
		//super() is allways called!
    }

    public double adicao(double x, double y) throws RemoteException { 
        return x + y;
    }

    public double subtracao(double x, double y) throws RemoteException { 
        return x - y;
    }
	
    public double multiplicacao(double x, double y) throws RemoteException { 
        return x * y;
    }
	
    public double divisao(double x, double y) throws RemoteException { 
        return x / y;
    }

    public double exp(double x, double y) throws RemoteException { 
        return Math.pow(x, y);
    }

    public double raiz(double x, double y) throws RemoteException { 
        return Math.pow(y , 1/x);
    }

    public double logaritmo(double x, double y) throws RemoteException { 
        return Math.log(y) / Math.log(x);
    }

    public double mod(double x, double y) throws RemoteException { 
        return x % y;
    }

    public double cos(double x) throws RemoteException { 
        double anguloEmRadianos = Math.toRadians(x);
        return Math.cos(anguloEmRadianos);
    }

    public double sin(double x) throws RemoteException { 
        double anguloEmRadianos = Math.toRadians(x);
        return Math.sin(anguloEmRadianos);
    }

    public double tan(double x) throws RemoteException { 
        double anguloEmRadianos = Math.toRadians(x);
        return Math.tan(anguloEmRadianos);
    }

    public double acos(double x) throws RemoteException { 

        double inverso = Math.acos(x);
        return Math.toDegrees(inverso);
    }

    public double asin(double x) throws RemoteException { 
        double inverso = Math.asin(x);
        return Math.toDegrees(inverso);
    }

    public double atan(double x) throws RemoteException { 
        double inverso = Math.atan(x);
        return Math.toDegrees(inverso);
    }
  
}