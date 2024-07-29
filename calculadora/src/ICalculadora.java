import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
	
    double adicao(double x, double y) throws RemoteException;
    double subtracao(double x, double y) throws RemoteException;
    double multiplicacao(double x, double y) throws RemoteException;
    double divisao(double x, double y) throws RemoteException;
    double exp(double x, double y) throws RemoteException;
    double raiz(double x, double y) throws RemoteException;
    double logaritmo(double x, double y) throws RemoteException;
    double mod(double x, double y) throws RemoteException;
    double cos(double x) throws RemoteException;
    double sin(double x) throws RemoteException;
    double tan(double x) throws RemoteException;
    double acos(double x) throws RemoteException;
    double asin(double x) throws RemoteException;
    double atan(double x) throws RemoteException;
}
