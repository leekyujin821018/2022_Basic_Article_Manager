package com.KoreaIT.java.BAM.service;

import java.util.List;

import com.KoreaIT.java.BAM.container.Container;
import com.KoreaIT.java.BAM.dao.MemberDao;
import com.KoreaIT.java.BAM.dto.Member;

public class MemberService {
	private MemberDao memberdao;
	
	public MemberService() {
		this.memberdao = Container.memberDao;
	}

	public Member getMemberByLoginId(String loginId) {
		return memberdao.getMemberByLoginId(loginId);
	}

	public int setNewId() {
		return memberdao.setNewId();
	}

	public void add(Member member) {
		memberdao.add(member);
	}
	
	public boolean isJoinableLoginId(String loginId) {
		return memberdao.isJoinableLoginId(loginId);
	}

	public List<Member> getMembers() {
		return memberdao.getMembers();
	}
}
