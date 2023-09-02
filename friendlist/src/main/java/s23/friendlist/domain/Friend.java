package s23.friendlist.domain;

import jakarta.validation.constraints.NotEmpty;

public class Friend {
	
	@NotEmpty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public Friend() {
		super();
	}
	
}
