package dto;

import java.io.Serializable;

public class MemberDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7159726773562029167L;
	private int number;
	private String name;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDto [number=" + number + ", name=" + name + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
