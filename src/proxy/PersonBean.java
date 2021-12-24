package proxy;

public class PersonBean implements Person {
	private String name;
	private int likeCount;
	

	@Override
	public void setLikeCount(int like) {
		// TODO Auto-generated method stub
		this.likeCount = like;
	}

	@Override
	public int getLikeCount() {
		// TODO Auto-generated method stub
		return this.likeCount;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

}
