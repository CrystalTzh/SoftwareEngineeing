package impl.constImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import businesslogicservice.constblservice.ConstInfoConstblService;
import vo.ConstInfoVO;

public class ConstImpl extends UnicastRemoteObject implements ConstInfoConstblService{

	public ConstImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ConstInfoVO find() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		return new ConstInfoVO();
	}

	@Override
	public ConstInfoVO update(ConstInfoVO vo) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println("1");
		if(vo == null){
			throw new IllegalArgumentException();
		}
		System.out.println(vo.getBaseSalary());
		return vo;
	}

}
