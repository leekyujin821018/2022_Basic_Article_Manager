package com.KoreaIT.java.BAM.service;

import java.util.List;

import com.KoreaIT.java.BAM.container.Container;
import com.KoreaIT.java.BAM.dao.MemberDao;
import com.KoreaIT.java.BAM.dto.Member;

public class MemberService {
	private MemberDao memberDao;
	
	public MemberService() {
		this.memberDao = Container.memberDao;
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}

	public int setNewId() {
		return memberDao.setNewId();
	}

	public void add(Member member) {
		memberDao.add(member);
	}
	
	public boolean isJoinableLoginId(String loginId) {
		return memberDao.isJoinableLoginId(loginId);
	}

	public List<Member> getMembers() {
		return memberDao.getMembers();
	}

	public String getMemberNameById(int id) {
		return memberDao.getMemberNameById(id);
	}
}
