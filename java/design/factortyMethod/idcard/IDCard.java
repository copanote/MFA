package factortyMethod.idcard;

public class IDCard extends Product {
	private String owner;
	public IDCard(String owner) {
		// TODO Auto-generated constructor stub
		System.out.println(owner + "�� ī�带 ����ϴ�.");
		this.owner = owner;

	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner + "�� ī�带 ����մϴ�.");
	}
	
	public String getOwner() {
		return owner;
	}

}