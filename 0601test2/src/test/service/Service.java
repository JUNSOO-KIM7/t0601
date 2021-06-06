package test.service;

import test.dao.TestDao;
import test.service.Service;

public class Service {
	
	private static Service service = new Service(); // 여기 안에서.. 객체 만듬.
	private Service() {} // 외부에서 service 객체생성 불가.
	private TestDao dao = TestDao.getInstance();
	public static Service getInstance()	// <- 한번만 생성된 객체를 가져옴.
	{
		return service;
	}
	
	public boolean loginS(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.loginS(id,pwd);
	}
	
	
	public boolean loginP(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.loginP(id,pwd);
	}
	
	public int enrollSubject(String subid) {
		// TODO Auto-generated method stub
		return dao.enrollSubject(subid);
	}
	
}
