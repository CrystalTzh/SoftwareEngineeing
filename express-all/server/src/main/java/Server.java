import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import businesslogicservice.constblservice.ConstInfoConstblService;
import impl.constImpl.ConstInfoServiceImpl;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			ConstInfoConstblService vo = new ConstInfoServiceImpl();
			Registry registry = LocateRegistry.createRegistry(33000);
//			Naming.bind("rmi://127.0.0.1:33000/ConstInfoVO", vo);
			registry.rebind("ConstInfoVO", vo);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}

}
