package businesslogic.stub.userblStub;

import vo.UserInfoVO;
import businesslogicservice.userblservice.UserInfoUserblService;

public class UserInfoUserblStub implements UserInfoUserblService {

	public UserInfoVO create() {
		// TODO Auto-generated method stub
		System.out.println("call UserInfocreat...");
		return null;
	}

	public boolean add(UserInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfoadd...");
		return false;
	}

	public boolean delete(UserInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfodelete...");
		return false;
	}

	public UserInfoVO find(long userAccount) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfofind...");
		return null;
	}

	public UserInfoVO update() {
		// TODO Auto-generated method stub
		System.out.println("call UserInfoupdate...");
		return null;
	}

	public boolean add(String userAccount, String password) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfoaddInfo...");
		return true;
	}

}
