package entity;

public class user {
	@Override
	public String toString() {
		return "user [name=" + name + ", password=" + password + "]";
	}

	private Integer id;
	private String name;
	private String password;
	private Integer power;

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
