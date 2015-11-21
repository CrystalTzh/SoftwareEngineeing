package impl.constImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import businesslogicservice.constblservice.ConstInfoConstblService;
import vo.ConstInfoVO;

public class ConstInfoServiceImpl extends UnicastRemoteObject implements ConstInfoConstblService{

	public ConstInfoServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConstInfoVO find() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println("远程绑定ConstInfoService对象成功！");
		return new ConstInfoVO();
	}

	public ConstInfoVO update(ConstInfoVO vo) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(vo == null){
			throw new IllegalArgumentException();
		}
		System.out.println("远程绑定ConstInfoService对象成功！");
		return vo;
	}

}
