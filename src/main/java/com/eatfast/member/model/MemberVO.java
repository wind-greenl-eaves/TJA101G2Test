package com.eatfast.member.model;

public class MemberVO {

	private int memID;
	private String memName;

	public MemberVO() {
		super();
	}

	public MemberVO(int memID, String memName) {
		super();
		this.memID = memID;
		this.memName = memName;
	}

	public int getMemID() {
		return memID;
	}

	public void setMemID(int memID) {
		this.memID = memID;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

}
