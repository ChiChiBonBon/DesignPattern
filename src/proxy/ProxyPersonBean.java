package proxy;

public class ProxyPersonBean implements Person {
	PersonBean personBean;
	
	
	

	public ProxyPersonBean(PersonBean personBean) {
		super();
		this.personBean = personBean;
	}

	@Override
	public void setLikeCount(int like) {
		// TODO Auto-generated method stub
		System.out.println("無權限修改like數");
	}

	@Override
	public int getLikeCount() {
		// TODO Auto-generated method stub
		return this.personBean.getLikeCount();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.personBean.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.personBean.setName(name);
	}

}
